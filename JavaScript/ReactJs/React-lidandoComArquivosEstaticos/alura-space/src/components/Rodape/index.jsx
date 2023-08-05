import React from 'react'
import iconeFacebook from "../../assets/iconesRodape/facebook.svg"
import iconeInstagram from "../../assets/iconesRodape/instagram.svg"
import iconeTwitter from "../../assets/iconesRodape/twitter.svg"
import styles from "./Rodape.module.scss"



export default function Rodape() {
    return (
        <footer className={styles.rodape}>
            <div className={styles.rodape__icones}>
                <a href="https://www.facebook.com/AluraCursosOnline/" target="_blank" rel="noopener noreferrer">

                    <img src={iconeFacebook} alt="Icone Facebook" />
                </a>

                <a href="https://twitter.com/aluraonline?lang=en" target="_blank" rel="noopener noreferrer">

                    <img src={iconeTwitter} alt="Icone Twitter" />
                </a>

                <a href="https://www.instagram.com/aluraonline/?hl=en" target="_blank" rel="noopener noreferrer">

                    <img src={iconeInstagram} alt="Icone Instagram" />
                </a>
            </div>


            <p>Desenvolvido por Alura</p>

        </footer>
    )
}
