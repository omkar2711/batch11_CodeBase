import React,{useState} from 'react'
import fetchResult from '../api/fetchresult.js';

const Querybar = ({ setResultHistory }) => {

    const [query, setQuery] = useState('');
  const [isSending, setIsSending] = useState(false);
    
    const handleQuerySubmit = async () => {
    const trimmedQuery = query.trim();

    if (!trimmedQuery || isSending) {
      return;
    }

        try {
      setIsSending(true);
      setResultHistory(prev => [...prev, { role: 'user', content: trimmedQuery }]);
      const result = await fetchResult(trimmedQuery);
      setResultHistory(prev => [...prev, { role: 'assistant', content: result }]);
      setQuery(''); 
        } catch (error) {
            console.error("Error fetching result:", error);
      setResultHistory(prev => [...prev, { role: 'assistant', content: 'I could not generate a response right now. Please try again.' }]);
    } finally {
      setIsSending(false);
        }
    }
    
  return (
  <div className="sticky bottom-0 mt-auto border-t border-white/10 bg-slate-950/70 pt-4 backdrop-blur-md">
    <div className="flex flex-col gap-3 rounded-3xl border border-white/10 bg-slate-900/80 p-3 shadow-xl shadow-slate-950/30 sm:flex-row sm:items-end sm:p-4">
     <textarea 
    className="min-h-14 flex-1 resize-none rounded-2xl border border-white/10 bg-white/5 px-4 py-3 text-sm text-slate-100 outline-none transition placeholder:text-slate-400 focus:border-cyan-400/50 focus:ring-2 focus:ring-cyan-400/20"
    placeholder="Ask anything about code, writing, planning, or ideas..." 
    value={query}
    rows={1}
    onChange={(e) => setQuery(e.target.value)}
    onKeyDown={(e) => {
      if (e.key === 'Enter' && !e.shiftKey) {
        e.preventDefault();
        handleQuerySubmit();
      }
    }}
     />
     <button className="inline-flex h-12 items-center justify-center rounded-2xl bg-cyan-400 px-5 text-sm font-semibold text-slate-950 transition hover:bg-cyan-300 disabled:cursor-not-allowed disabled:bg-slate-700 disabled:text-slate-400" onClick={handleQuerySubmit} disabled={!query.trim() || isSending}>
    {isSending ? 'Thinking...' : 'Send'}
     </button>
    </div>
    </div>
  )
}

export default Querybar
