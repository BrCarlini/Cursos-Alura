import CampoTexto from '../CampoTexto'
import './Formulario.css'

const Formulario = () => {
    return (
        <section className="formulario">
            <form>
                <h2>Preencha os dados para criar o card do colaborador</h2>
                <CampoTexto label="Nome" placeholver="Digite seu nome" />
                <CampoTexto label="Cargo" placeholver="Digite seu cargo" />
                <CampoTexto label="Imagem" placeholver="Digite o endereço da imagem..." />
            </form>
        </section>
    )
}

export default Formulario