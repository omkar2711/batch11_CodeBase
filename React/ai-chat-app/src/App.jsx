import React , {useState} from 'react'
import Navbar from './component/Navbar'
import Result from './component/Result'
import Querybar from './component/Querybar'

const App = () => {

  const [resultHistory, setResultHistory] = useState([]);
  return (
    <div className="min-h-screen bg-slate-950 text-slate-100">
      <div className="absolute inset-0 -z-10 bg-[radial-gradient(circle_at_top,rgba(34,211,238,0.18),transparent_32%),radial-gradient(circle_at_bottom_right,rgba(59,130,246,0.18),transparent_28%),linear-gradient(180deg,#020617_0%,#0f172a_100%)]" />
      <div className="mx-auto flex min-h-screen w-full max-w-6xl flex-col px-4 py-4 sm:px-6 lg:px-8">
        <Navbar />
        <main className="mt-4 flex min-h-0 flex-1 flex-col gap-4 rounded-3xl border border-white/10 bg-white/5 p-4 shadow-2xl shadow-slate-950/40 backdrop-blur-xl sm:p-6">
          <Result result={resultHistory} />
          <Querybar setResultHistory={setResultHistory} />
        </main>
      </div>
    </div>
  )
}

export default App
