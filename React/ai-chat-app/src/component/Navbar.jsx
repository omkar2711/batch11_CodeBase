import React from 'react'

const Navbar = () => {
  return (
    <div className="flex items-center justify-between rounded-2xl border border-white/10 bg-white/5 px-4 py-3 shadow-lg shadow-slate-950/20 backdrop-blur-xl sm:px-5">
      <div>
        <p className="text-xs font-medium uppercase tracking-[0.32em] text-cyan-300/80">Assistant</p>
        <h1 className="mt-1 text-xl font-semibold text-white sm:text-2xl">AI Chat Bot</h1>
      </div>
      <div className="flex items-center gap-2 rounded-full border border-emerald-400/20 bg-emerald-400/10 px-3 py-1 text-xs font-medium text-emerald-300">
        <span className="h-2 w-2 rounded-full bg-emerald-400 shadow-[0_0_12px_rgba(52,211,153,0.9)]" />
        Online
      </div>
    </div>
  )
}

export default Navbar
