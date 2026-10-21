// ===== Header: background on scroll, back-to-top button =====
const header = document.getElementById('header');
const backToTop = document.getElementById('backToTop');

function onScroll() {
    const y = window.scrollY;
    header.classList.toggle('scrolled', y > 60);
    backToTop.classList.toggle('show', y > 600);
    highlightNav();
}

window.addEventListener('scroll', onScroll);

// ===== Mobile navigation =====
const nav = document.getElementById('nav');
const navToggle = document.getElementById('navToggle');

navToggle.addEventListener('click', () => {
    const open = nav.classList.toggle('open');
    navToggle.classList.toggle('open', open);
    navToggle.setAttribute('aria-expanded', open);
});

nav.querySelectorAll('a').forEach(link => {
    link.addEventListener('click', () => {
        nav.classList.remove('open');
        navToggle.classList.remove('open');
        navToggle.setAttribute('aria-expanded', false);
    });
});

// ===== Active nav link while scrolling =====
const navLinks = document.querySelectorAll('.nav-link:not(.btn)');
const sections = [...navLinks].map(link => document.querySelector(link.getAttribute('href')));

function highlightNav() {
    const pos = window.scrollY + 120;
    let current = sections[0];
    sections.forEach(section => {
        if (section && section.offsetTop <= pos) current = section;
    });
    navLinks.forEach(link => {
        link.classList.toggle('active', link.getAttribute('href') === '#' + current.id);
    });
}

// ===== Reveal on scroll, counters and skill bars =====
function animateCounter(el) {
    const target = Number(el.dataset.target);
    const duration = 1800;
    const start = performance.now();

    function tick(now) {
        const progress = Math.min((now - start) / duration, 1);
        const eased = 1 - Math.pow(1 - progress, 3);
        el.textContent = Math.floor(eased * target);
        if (progress < 1) requestAnimationFrame(tick);
    }

    requestAnimationFrame(tick);
}

const observer = new IntersectionObserver(entries => {
    entries.forEach(entry => {
        if (!entry.isIntersecting) return;
        const el = entry.target;

        if (el.classList.contains('counter')) {
            animateCounter(el);
        } else if (el.classList.contains('skill-fill')) {
            el.style.width = el.dataset.width + '%';
        } else {
            el.classList.add('visible');
        }
        observer.unobserve(el);
    });
}, { threshold: 0.15 });

document.querySelectorAll('.reveal, .counter, .skill-fill').forEach(el => observer.observe(el));

// ===== Project filter =====
const filterButtons = document.querySelectorAll('.filter-btn');
const projects = document.querySelectorAll('.project-card');

filterButtons.forEach(btn => {
    btn.addEventListener('click', () => {
        filterButtons.forEach(b => b.classList.remove('active'));
        btn.classList.add('active');

        const filter = btn.dataset.filter;
        projects.forEach(card => {
            const show = filter === 'all' || card.dataset.category === filter;
            card.classList.toggle('hide', !show);
        });
    });
});

// ===== Project lightbox =====
const lightbox = document.getElementById('lightbox');
const lightboxImg = document.getElementById('lightboxImg');
const lightboxCaption = document.getElementById('lightboxCaption');

document.querySelectorAll('.project-img').forEach(box => {
    box.addEventListener('click', () => {
        const img = box.querySelector('img');
        lightboxImg.src = img.src;
        lightboxImg.alt = img.alt;
        lightboxCaption.textContent = box.closest('.project-card').querySelector('h3').textContent;
        lightbox.classList.add('open');
        lightbox.setAttribute('aria-hidden', false);
    });
});

function closeLightbox() {
    lightbox.classList.remove('open');
    lightbox.setAttribute('aria-hidden', true);
}

document.getElementById('lightboxClose').addEventListener('click', closeLightbox);
lightbox.addEventListener('click', e => {
    if (e.target === lightbox) closeLightbox();
});
document.addEventListener('keydown', e => {
    if (e.key === 'Escape') closeLightbox();
});

// ===== Testimonial slider =====
const slides = document.getElementById('slides');
const dotsWrap = document.getElementById('dots');
const slideCount = slides.children.length;
let currentSlide = 0;
let autoPlay;

for (let i = 0; i < slideCount; i++) {
    const dot = document.createElement('button');
    dot.setAttribute('aria-label', 'Go to testimonial ' + (i + 1));
    dot.addEventListener('click', () => goToSlide(i));
    dotsWrap.appendChild(dot);
}

function goToSlide(index) {
    currentSlide = (index + slideCount) % slideCount;
    slides.style.transform = `translateX(-${currentSlide * 100}%)`;
    dotsWrap.querySelectorAll('button').forEach((dot, i) => {
        dot.classList.toggle('active', i === currentSlide);
    });
    restartAutoPlay();
}

function restartAutoPlay() {
    clearInterval(autoPlay);
    autoPlay = setInterval(() => goToSlide(currentSlide + 1), 6000);
}

document.getElementById('prevSlide').addEventListener('click', () => goToSlide(currentSlide - 1));
document.getElementById('nextSlide').addEventListener('click', () => goToSlide(currentSlide + 1));
goToSlide(0);

// ===== Contact form validation =====
const form = document.getElementById('contactForm');
const formStatus = document.getElementById('formStatus');

function setError(input, message) {
    const group = input.closest('.form-group');
    group.classList.toggle('invalid', Boolean(message));
    group.querySelector('.error').textContent = message;
    return !message;
}

form.addEventListener('submit', e => {
    e.preventDefault();
    formStatus.textContent = '';
    formStatus.className = 'form-status';

    const [nameInput, phoneInput, emailInput, messageInput] =
        ['name', 'phone', 'email', 'message'].map(id => document.getElementById(id));
    const name = nameInput.value.trim();
    const phone = phoneInput.value.trim();
    const email = emailInput.value.trim();
    const message = messageInput.value.trim();

    const valid = [
        setError(nameInput, name.length < 2 ? 'Please enter your name.' : ''),
        setError(phoneInput, /^[+\d][\d\s-]{7,}$/.test(phone) ? '' : 'Please enter a valid phone number.'),
        setError(emailInput, /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email) ? '' : 'Please enter a valid email address.'),
        setError(messageInput, message.length < 10 ? 'Please tell me a little more about your project.' : '')
    ].every(Boolean);

    if (!valid) return;

    // Demo only: no backend is connected yet. Hook this up to a form service or API to receive messages.
    formStatus.textContent = `Thank you, ${name}! Your enquiry has been received. I'll get back to you within one working day.`;
    formStatus.classList.add('success');
    form.reset();
});

// ===== Footer year =====
document.getElementById('year').textContent = new Date().getFullYear();

onScroll();
