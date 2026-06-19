const queryInput = document.getElementById('search-input');
const countryInput = document.getElementById('location-input');
const typeFilter = document.getElementById('type-filter');
const modeFilter = document.getElementById('mode-filter');
const clearFiltersButton = document.getElementById('clear-filters');
const resultsContainer = document.getElementById('results');
const searchForm = document.getElementById('search-form');

let query = '';
let country = '';
let allJobs = [];

const escapeHtml = (value = '') =>
    String(value)
        .replace(/&/g, '&amp;')
        .replace(/</g, '&lt;')
        .replace(/>/g, '&gt;')
        .replace(/"/g, '&quot;')
        .replace(/'/g, '&#39;');

const toTitleCase = (value = '') =>
    String(value)
        .split(/\s+/)
        .filter(Boolean)
        .map((part) => part.charAt(0).toUpperCase() + part.slice(1).toLowerCase())
        .join(' ');

const formatDate = (value) => {
    if (!value) {
        return 'Recently posted';
    }

    const date = new Date(value);
    return Number.isNaN(date.getTime()) ? value : date.toLocaleDateString();
};

const formatList = (values) => {
    if (!Array.isArray(values) || values.length === 0) {
        return 'Not specified';
    }

    return values.join(', ');
};

const formatSalary = (job) => {
    if (job.job_salary_string) {
        return job.job_salary_string;
    }

    if (job.job_min_salary && job.job_max_salary) {
        const period = job.job_salary_period ? ` / ${job.job_salary_period}` : '';
        return `${job.job_min_salary} - ${job.job_max_salary}${period}`;
    }

    return 'Salary not disclosed';
};

const buildDescriptionPreview = (description = '') => {
    const cleanText = String(description).replace(/\s+/g, ' ').trim();
    if (!cleanText) {
        return 'No description available for this job.';
    }

    return cleanText.length > 420 ? `${cleanText.slice(0, 420)}...` : cleanText;
};

const renderHighlights = (highlights) => {
    if (!highlights || typeof highlights !== 'object' || Object.keys(highlights).length === 0) {
        return '<p class="muted">No extra highlights listed.</p>';
    }

    return Object.entries(highlights)
        .map(([label, values]) => {
            const items = Array.isArray(values) ? values : [values];
            return `
                <div class="highlight-group">
                    <h4>${escapeHtml(toTitleCase(label.replace(/_/g, ' ')))}</h4>
                    <p>${escapeHtml(formatList(items))}</p>
                </div>
            `;
        })
        .join('');
};

const fallbackJobs = [
    {
        job_title: 'Frontend Developer',
        employer_name: 'TechNova',
        employer_logo: 'https://images.unsplash.com/photo-1552664730-d307ca884978?auto=format&fit=crop&w=120&q=80',
        job_location: 'Remote · India',
        job_country: 'India',
        job_city: 'Bengaluru',
        job_state: 'Karnataka',
        job_employment_type: 'Full-time',
        job_is_remote: true,
        job_posted_at: '2026-06-17',
        job_salary_string: '$1,200 - $1,600 / month',
        job_apply_link: '#',
        job_google_link: '#',
        job_publisher: 'JobsBoard',
        job_description: 'Build responsive interfaces, collaborate with designers, and improve performance for a growing SaaS platform.',
        apply_options: [{ publisher: 'Company Site', is_direct: true }],
        job_highlights: {
            skills: ['HTML', 'CSS', 'JavaScript', 'React'],
            benefits: ['Flexible hours', 'Remote-first']
        }
    },
    {
        job_title: 'Data Analyst',
        employer_name: 'InsightHub',
        employer_logo: '',
        job_location: 'Hybrid · Chennai',
        job_country: 'India',
        job_city: 'Chennai',
        job_state: 'Tamil Nadu',
        job_employment_type: 'Contract',
        job_is_remote: false,
        job_posted_at: '2026-06-15',
        job_salary_string: '$900 - $1,200 / month',
        job_apply_link: '#',
        job_google_link: '#',
        job_publisher: 'CareerPulse',
        job_description: 'Analyze product data, build dashboards, and partner with business teams to uncover insights.',
        apply_options: [{ publisher: 'LinkedIn', is_direct: false }],
        job_highlights: {
            skills: ['SQL', 'Excel', 'Power BI'],
            work_style: ['Hybrid']
        }
    },
    {
        job_title: 'Software Engineer',
        employer_name: 'CodeBridge',
        employer_logo: 'https://images.unsplash.com/photo-1521737604893-d14cc237f11d?auto=format&fit=crop&w=120&q=80',
        job_location: 'On-site · Hyderabad',
        job_country: 'India',
        job_city: 'Hyderabad',
        job_state: 'Telangana',
        job_employment_type: 'Full-time',
        job_is_remote: false,
        job_posted_at: '2026-06-12',
        job_salary_string: '$1,400 - $2,000 / month',
        job_apply_link: '#',
        job_google_link: '#',
        job_publisher: 'JobFinder',
        job_description: 'Develop scalable backend services and help improve platform reliability for enterprise clients.',
        apply_options: [{ publisher: 'Company Site', is_direct: true }],
        job_highlights: {
            skills: ['Java', 'Spring Boot', 'REST APIs'],
            perks: ['Health insurance', 'Learning budget']
        }
    }
];

const normalizeText = (value = '') => String(value || '').toLowerCase().replace(/[^a-z0-9]/g, '');

const matchesType = (job, selectedType) => {
    if (selectedType === 'all') {
        return true;
    }

    const normalizedSelected = normalizeText(selectedType);
    const jobTypes = [job.job_employment_type, ...(Array.isArray(job.job_employment_types) ? job.job_employment_types : [])]
        .map((value) => normalizeText(value));

    return jobTypes.some((type) => type === normalizedSelected || type.includes(normalizedSelected));
};

const matchesMode = (job, selectedMode) => {
    if (selectedMode === 'all') {
        return true;
    }

    const location = String(job.job_location || '').toLowerCase();
    const details = String(job.job_description || '').toLowerCase();
    const isRemote = Boolean(job.job_is_remote) || location.includes('remote') || location.includes('anywhere');
    const isHybrid = location.includes('hybrid') || details.includes('hybrid');

    if (selectedMode === 'remote') {
        return isRemote;
    }

    if (selectedMode === 'hybrid') {
        return isHybrid;
    }

    return !isRemote && !isHybrid;
};

const applyFilters = (jobs) => jobs.filter((job) => matchesType(job, typeFilter.value) && matchesMode(job, modeFilter.value));

const renderJobs = (jobs, options = {}) => {
    const { showFallbackNotice = false } = options;
    const filteredJobs = applyFilters(jobs);

    resultsContainer.innerHTML = `
        <div class="results-summary">
            <h2>Showing ${filteredJobs.length} job${filteredJobs.length === 1 ? '' : 's'}</h2>
            <p>Search: <strong>${escapeHtml(query || 'All roles')}</strong> | Location: <strong>${escapeHtml(country || 'Any location')}</strong></p>
            ${showFallbackNotice ? '<p class="muted">Using sample results because the live search service is unavailable right now.</p>' : ''}
        </div>
        ${filteredJobs.map((job) => {
            const employmentType = Array.isArray(job.job_employment_types) && job.job_employment_types.length > 0
                ? job.job_employment_types.join(', ')
                : job.job_employment_type || 'Not specified';
            const locationParts = [job.job_city, job.job_state, job.job_country].filter(Boolean).join(', ') || job.job_location || 'Location not provided';
            const logoMarkup = job.employer_logo
                ? `<img class="company-logo" src="${escapeHtml(job.employer_logo)}" alt="${escapeHtml(job.employer_name || 'Company')} logo">`
                : '<div class="company-logo company-logo--placeholder">No logo</div>';

            return `
                <article class="job-card">
                    <div class="job-card__top">
                        ${logoMarkup}
                        <div>
                            <p class="job-card__publisher">${escapeHtml(job.job_publisher || 'Publisher not specified')}</p>
                            <h3>${escapeHtml(job.job_title || 'Untitled role')}</h3>
                            <p class="job-card__company">${escapeHtml(job.employer_name || 'Company not listed')}</p>
                        </div>
                    </div>

                    <div class="job-card__badges">
                        <span>${escapeHtml(employmentType)}</span>
                        <span>${job.job_is_remote ? 'Remote' : 'On-site / Hybrid'}</span>
                        <span>${escapeHtml(formatDate(job.job_posted_at_datetime_utc || job.job_posted_at))}</span>
                    </div>

                    <div class="job-card__grid">
                        <p><strong>Location:</strong> ${escapeHtml(locationParts)}</p>
                        <p><strong>Country:</strong> ${escapeHtml(job.job_country || 'Not specified')}</p>
                        <p><strong>Salary:</strong> ${escapeHtml(formatSalary(job))}</p>
                        <p><strong>Apply Direct:</strong> ${job.job_apply_is_direct ? 'Yes' : 'No'}</p>
                    </div>

                    <p class="job-card__description">${escapeHtml(buildDescriptionPreview(job.job_description))}</p>

                    <div class="job-card__actions">
                        <a class="button button--primary" href="${escapeHtml(job.job_apply_link || '#')}" target="_blank" rel="noopener noreferrer">Apply Now</a>
                        ${job.employer_website ? `<a class="button button--secondary" href="${escapeHtml(job.employer_website)}" target="_blank" rel="noopener noreferrer">Company Website</a>` : ''}
                        ${job.job_google_link ? `<a class="button button--secondary" href="${escapeHtml(job.job_google_link)}" target="_blank" rel="noopener noreferrer">View in Google Jobs</a>` : ''}
                    </div>

                    <div class="job-card__details">
                        <div>
                            <h4>Apply Options</h4>
                            <p>${escapeHtml(formatList((job.apply_options || []).map((option) => `${option.publisher}${option.is_direct ? ' (direct)' : ''}`)))}</p>
                        </div>
                        <div>
                            <h4>Highlights</h4>
                            ${renderHighlights(job.job_highlights)}
                        </div>
                    </div>
                </article>
            `;
        }).join('')}
    `;
};

queryInput.addEventListener('input', (event) => {
    query = event.target.value;
});

countryInput.addEventListener('input', (event) => {
    country = event.target.value;
});

typeFilter.addEventListener('change', () => {
    if (allJobs.length > 0) {
        renderJobs(allJobs);
    }
});

modeFilter.addEventListener('change', () => {
    if (allJobs.length > 0) {
        renderJobs(allJobs);
    }
});

clearFiltersButton.addEventListener('click', () => {
    typeFilter.value = 'all';
    modeFilter.value = 'all';

    if (allJobs.length > 0) {
        renderJobs(allJobs);
    }
});

searchForm.addEventListener('submit', (event) => {
    event.preventDefault();
    fetchJobDetails();
});

const options = {
    method: 'GET',
    headers: {
        'x-rapidapi-key': '964ab9bfbemshf7c3a95fc2524cep1f15dbjsnbed1d3d53735',
        'x-rapidapi-host': 'jsearch.p.rapidapi.com',
        'Content-Type': 'application/json'
    }
};

const fetchJobDetails = async () => {
    const trimmedQuery = query.trim();
    const trimmedCountry = country.trim();

    if (!trimmedQuery) {
        resultsContainer.innerHTML = '<p class="status">Please enter a job title or keyword to search.</p>';
        return;
    }

    resultsContainer.innerHTML = '<p class="status">Loading jobs...</p>';

    try {
        const url = `https://jsearch.p.rapidapi.com/search-v2?query=${encodeURIComponent(trimmedQuery)}&num_pages=1&country=${encodeURIComponent(trimmedCountry || 'us')}&date_posted=all`;
        const response = await fetch(url, options);
        const result = await response.json();
        const jobs = Array.isArray(result?.data?.jobs) ? result.data.jobs : [];
        allJobs = jobs;

        if (jobs.length === 0) {
            resultsContainer.innerHTML = '<p class="status">No jobs found for the selected search.</p>';
            return;
        }

        renderJobs(jobs);
    } catch (error) {
        console.error(error);
        allJobs = fallbackJobs;
        renderJobs(fallbackJobs, { showFallbackNotice: true });
    }
};

query = 'software developer';
queryInput.value = query;
country = 'india';
countryInput.value = country;

fetchJobDetails();

window.fetchJobDetails = fetchJobDetails;