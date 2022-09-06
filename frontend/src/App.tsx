import NotificationButton from "./components/notificationbutton"

import Header from "./components/header"

import SalesCard from "./components/salescard"
import BuyCard from "./components/buycard"

function App() {
  return (
    <>

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
