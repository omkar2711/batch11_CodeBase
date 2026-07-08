import React from 'react'

const Result = ({ result }) => {

  return (
    <div className="flex min-h-0 flex-1 flex-col overflow-hidden rounded-3xl border border-white/10 bg-slate-950/40">
      <div className="border-b border-white/10 px-4 py-3 sm:px-5">
        <p className="text-sm font-medium text-slate-200">Conversation</p>
        <p className="text-xs text-slate-400">Messages appear here like a real chat interface.</p>
      </div>
      <div className="min-h-0 flex-1 space-y-4 overflow-y-auto px-4 py-5 sm:px-5">
      {result && result.length > 0 ? (
        result.map((item, index) => (
          <div key={index} className={`flex ${item.role === 'user' ? 'justify-end' : 'justify-start'}`}>
            <div className={`max-w-[85%] rounded-3xl px-4 py-3 text-sm leading-6 shadow-lg sm:max-w-[75%] ${item.role === 'user' ? 'bg-cyan-400 text-slate-950' : 'border border-white/10 bg-white/5 text-slate-100'}`}>
              <p className="mb-1 text-[11px] font-semibold uppercase tracking-[0.24em] opacity-70">
                {item.role === 'user' ? 'You' : 'Assistant'}
              </p>
              <p className="whitespace-pre-wrap">{item.content}</p>
            </div>
          </div>
        ))
      ) : (
        <div className="flex h-full items-center justify-center">
          <div className="max-w-md rounded-3xl border border-dashed border-white/15 bg-white/5 px-6 py-10 text-center">
            <p className="text-lg font-semibold text-white">Start a conversation</p>
            <p className="mt-2 text-sm leading-6 text-slate-400">Ask a question below and the assistant will respond in a chat-style thread.</p>
          </div>
        </div>
      )}
      </div>
    </div>
  )
}

export default Result
