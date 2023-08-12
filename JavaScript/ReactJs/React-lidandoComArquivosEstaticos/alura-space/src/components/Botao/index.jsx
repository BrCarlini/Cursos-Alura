import React from 'react'
import style from './Botao.module.scss'

export default function Botao({texto}) {
  return (
    <button className={style.botao}>{texto}</button>
    //Ver mais fotos
  )
}
