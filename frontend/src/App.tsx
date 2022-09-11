import NotificationButton from "./components/notificationbutton"
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Header from "./components/header"

import SalesCard from "./components/salescard"
import BuyCard from "./components/buycard"

function App() {
  return (
    <>
      <ToastContainer/>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
              <SalesCard/>
              <BuyCard/>
              
          </div>
        </section>
      </main>

    </>
  )
}
export default App
