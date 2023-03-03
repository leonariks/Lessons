import React, { Children } from 'react'
import ChildrenComponent from './ChildrenComponent'


const FirstComponent = () => {
  return (
    <div>
      <h1>Наш компонент</h1>
      <p>
        Текст еомпонента
      </p>
      <ChildrenComponent text="Текст пропса" width="230px"/>

    </div>
  )
}

export default FirstComponent