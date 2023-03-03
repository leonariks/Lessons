import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <div className='card'>
        <div className='title-content'>
          <h3>Заголовок</h3>
            <hr />
              <img src={logo} width="150px"/>
                <hr />
                  <div className='info'>
                    Краткое описание
                  </div>
        </div>
          <div className='card-info'>
            Текст, который появится в карточке
          </div>
          <div className='color-overlay'></div>
      </div>
    </div>
  );
}

export default App;
