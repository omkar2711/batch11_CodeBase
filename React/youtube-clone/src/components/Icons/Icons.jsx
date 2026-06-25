const base = {
  width: 24,
  height: 24,
  viewBox: '0 0 24 24',
  fill: 'currentColor',
}

export const MenuIcon = (props) => (
  <svg {...base} {...props}><path d="M3 6h18v2H3zm0 5h18v2H3zm0 5h18v2H3z" /></svg>
)

export const SearchIcon = (props) => (
  <svg width="22" height="22" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" {...props}>
    <circle cx="11" cy="11" r="7" />
    <line x1="21" y1="21" x2="16.65" y2="16.65" />
  </svg>
)

export const MicIcon = (props) => (
  <svg width="20" height="20" viewBox="0 0 24 24" fill="currentColor" {...props}>
    <path d="M12 14a3 3 0 0 0 3-3V6a3 3 0 0 0-6 0v5a3 3 0 0 0 3 3z" />
    <path fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" d="M5 11a7 7 0 0 0 14 0M12 18v3" />
  </svg>
)

export const PlusIcon = (props) => (
  <svg {...base} {...props}><path d="M11 5h2v6h6v2h-6v6h-2v-6H5v-2h6z" /></svg>
)

export const BellIcon = (props) => (
  <svg {...base} fill="none" stroke="currentColor" strokeWidth="2" {...props}>
    <path strokeLinecap="round" strokeLinejoin="round" d="M6 8a6 6 0 0 1 12 0c0 4 1.5 5.5 1.5 6.5H4.5C4.5 13.5 6 12 6 8z" />
    <path strokeLinecap="round" d="M10 19a2 2 0 0 0 4 0" />
  </svg>
)

export const HomeIcon = (props) => (
  <svg {...base} {...props}><path d="M12 3.2 3 10.5v10.3h6.2v-6.4h5.6v6.4H21V10.5z" /></svg>
)

export const ShortsIcon = (props) => (
  <svg {...base} {...props}>
    <path d="M13.5 2c-3.6 0-6.5 2.9-6.5 6.5 0 .3 0 .6.1.9C5.1 9.9 3 11.3 3 14.5 3 18.6 6.4 22 10.5 22c2.3 0 4.4-1 5.8-2.7l.1 2.4 5.6-3.9-5.6-3.9.1 2.4c-.7.6-1.6 1-2.6 1-1.9 0-3.4-1.5-3.4-3.4s1.5-3.4 3.4-3.4c.5 0 1 .1 1.4.3V8.5C19.8 8.1 21 6.4 21 4.5V2z" />
  </svg>
)

export const HistoryIcon = (props) => (
  <svg {...base} fill="none" stroke="currentColor" strokeWidth="1.8" {...props}>
    <path strokeLinecap="round" strokeLinejoin="round" d="M3 12a9 9 0 1 0 3-6.7" />
    <path strokeLinecap="round" strokeLinejoin="round" d="M3 4v5h5" />
    <path strokeLinecap="round" strokeLinejoin="round" d="M12 8v4l3 2" />
  </svg>
)

export const PlaylistIcon = (props) => (
  <svg {...base} {...props}><path d="M3 5h13v2H3zm0 5h13v2H3zm0 5h8v2H3zm11-5 7 3.5L14 17z" /></svg>
)

export const VideoIcon = (props) => (
  <svg {...base} fill="none" stroke="currentColor" strokeWidth="1.8" {...props}>
    <rect x="2.5" y="6" width="13" height="12" rx="2" />
    <path strokeLinecap="round" strokeLinejoin="round" d="m15.5 10 6-3.5v11l-6-3.5" />
  </svg>
)

export const ClockIcon = (props) => (
  <svg {...base} fill="none" stroke="currentColor" strokeWidth="1.8" {...props}>
    <circle cx="12" cy="12" r="9" />
    <path strokeLinecap="round" strokeLinejoin="round" d="M12 7v5l4 2" />
  </svg>
)

export const ThumbUpIcon = (props) => (
  <svg {...base} fill="none" stroke="currentColor" strokeWidth="1.8" {...props}>
    <path strokeLinejoin="round" d="M7 10v10H4V10zm3 10h8.5a2 2 0 0 0 2-1.6l1.2-6A2 2 0 0 0 19.7 10H14l.7-4.5a1.6 1.6 0 0 0-2.9-1.2L8 10v10a2 2 0 0 0 2 2z" />
  </svg>
)

export const DownloadIcon = (props) => (
  <svg {...base} fill="none" stroke="currentColor" strokeWidth="1.8" {...props}>
    <path strokeLinecap="round" strokeLinejoin="round" d="M12 3v12m0 0-4-4m4 4 4-4M4 17v2a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2v-2" />
  </svg>
)

export const ChevronDownIcon = (props) => (
  <svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" {...props}>
    <path strokeLinecap="round" strokeLinejoin="round" d="m6 9 6 6 6-6" />
  </svg>
)

export const ChevronRightIcon = (props) => (
  <svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" {...props}>
    <path strokeLinecap="round" strokeLinejoin="round" d="m9 6 6 6-6 6" />
  </svg>
)

export const VerifiedIcon = (props) => (
  <svg width="13" height="13" viewBox="0 0 24 24" fill="currentColor" {...props}>
    <path d="M12 1 9.6 3.3 6.3 3l-.9 3.2L2.3 8l1.4 3-1.4 3 3.1 1.8.9 3.2 3.3-.3L12 21l2.4-2.3 3.3.3.9-3.2 3.1-1.8-1.4-3 1.4-3-3.1-1.8-.9-3.2-3.3.3z" />
    <path fill="#0f0f0f" d="m9.8 12.2 1.8 1.8 3.6-4.4-1-.9-2.7 3.3-1-1z" />
  </svg>
)
