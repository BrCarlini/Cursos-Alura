import banner from './banner.png'
import React from 'react'
import styles from './Banner.module.scss'


export default function Banner() {
    return (
        <div className={styles.banner__imagem}>
            <h1>A galeria mais completa do espaço</h1>
            <img src={banner} alt="A imagem da terra vista do espaço" />
        </div>
    )
}
