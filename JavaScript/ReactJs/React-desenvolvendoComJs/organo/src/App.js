import Banner from './componentes/Banner/';
import CampoTexto from './componentes/CampoTexto/index.js';

function App() {
  return (
    <div className="App">
      <Banner/>
      <CampoTexto label="Nome" placeholver="Digite seu nome"/>
      <CampoTexto label="Cargo" placeholver="Digite seu cargo"/>
      <CampoTexto label="Imagem" placeholver="Digite o endereço da imagem..."/>
    </div>
  );
}

export default App;
