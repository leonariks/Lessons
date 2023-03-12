import React from 'react'

const CardItem = () => {
  return (
    <div className='container py-3'>
      <main>
        <div className='row row-cols-1 justify-content-evenly row row-cols-md-3 row-cols-sm-2 text-center'>
          <div className='col px-3 py-3'>
            <div className='card md-6 rounded'>
              <div className='card-header py-2 px-3'>
                <button type='button' className='w-100 btn btn-lg btn-primary'>
                  Добавить в избранное
                </button>
                <p>Заголовок</p>
                <img className='rounded' src="./img/first.jpg" width={'85%'} alt=""/>
                <p>Описание</p>
                <p>Цена</p>
                <button className='w-100 btn btn-lg btn-primary'>
                  Добавить в корзину
                </button>
              </div>
            </div>
          </div>
        </div>
      </main>
    </div>
  )
}

export default CardItem