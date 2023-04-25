import './Rodape.css'

const Rodape = () => {

    return(
        <footer>

            <div className='container-icons'>
                <img src='/imagens/fb.png' alt='Icone Facebook'/>
                <img src='/imagens/tw.png' alt='Icone Twitter'/>
                <img src='/imagens/ig.png' alt='Icone Instagram'/>
                
            </div>

            <div className='container-logo'>
                <img src='/imagens/logo.png'/>
            </div>

            <div className='container-text'>
                <p>Desenvolvido por Alura</p>
            </div>

        </footer>
    )

}

export default Rodape