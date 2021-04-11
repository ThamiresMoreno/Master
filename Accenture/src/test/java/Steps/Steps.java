package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Pages p = new Pages();
	Elementos e= new Elementos();
	
	
	
	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String site) throws IOException {
	  p.executarNavegador(site, "CHROME", "ABRINDO NAVEGADOR");
	   
	}

	@Given("preencher a aba Enter Vehicle Data")
	public void preencher_a_aba_enter_vehicle_data() throws IOException {
	  p.selecionarComboPosicao(e.getMarcaCarro(), 2, "selecionando marca");
	  p.selecionarComboPosicao(e.getModeloCarro(), 2,"selecionando modelo"); 
      p.escrever(e.getCilindrada(), "100", "cilindrada");
      p.escrever(e.getDesenpenhoMotor(), "100", "desempenho");
	  p.escrever(e.getDataFabricacao(), "02/02/2015", null);
	  p.selecionarComboPosicao(e.getNumeroAssentos(), 1, "numero de assentos");
	  p.clicar(e.getLadoDirecao(), "selecionando lado da direção");
	  p.selecionarComboPosicao(e.getNumeroassentos2(), 3, "numero de assentos");
	  p.selecionarComboPosicao(e.getTipoCombustivel(), 1, "combustivel");
	  p.escrever(e.getCarga(), "100", "carga");
	  p.escrever(e.getPeso(), "100", "peso");
	  p.escrever(e.getPrecoTabela(), "1000", "preço tabela");
	  p.escrever(e.getPlaca(), "2", "placa");
	  p.escrever(e.getKm(), "1000", "KM");
	  p.clicar(e.getBtnProximo(), "botão next");
	
	}

	@Given("preencher a aba Enter Insurant Data")
	public void preencher_a_aba_enter_insurant_data() throws IOException {
	  p.escrever(e.getPrimeiroNome(), "thamires", "campo nome");
	  p.escrever(e.getUltimoNome(), "Moreno", "ultimo nome");
	  p.escrever(e.getDataNascimento(), "09/22/1996", "data de nascimentos");
	  p.clicar(e.getCheckBoxGenero(), "genero");
	  p.escrever(e.getEndereco(), "Paulista", "endereco");
	  p.selecionarComboTexto(e.getPais(), "Brazil", "selecionando pais");
	  p.escrever(e.getCep(), "04863060", "cep");
	  p.selecionarComboPosicao(e.getOcupacao(), 2, "ocupacao");
	  p.clicar(e.getHobbis(), "Hobbis");
	  p.clicar(e.getBtmProximo2(), "botão next");
	
	
	}

	@Given("preencher a aba Enter Product Data")
	public void preencher_a_aba_enter_product_data() throws IOException {
	  p.escrever(e.getDataInicio(), "02/02/2022", "Data de inicio");
	  p.selecionarComboPosicao(e.getSomaSeguro(), 1, "soma do seguro");
	  p.selecionarComboPosicao(e.getClassificacaoMerito(), 3, "merito");
	  p.selecionarComboPosicao(e.getSeguroDanos(), 2, "seguro danos");
	  p.clicar(e.getCheckboxEuroProtecao(), "");
	  p.selecionarComboPosicao(e.getCarrocortesia(), 2,"carro cortesia");
	  p.clicar(e.getBtnProximo3(), "botão proximo");
	   
	}

	@Given("preencher a aba Select Price Option")
	public void preencher_a_aba_select_price_option() throws IOException, InterruptedException {
	  p.clicar(e.getCheckboxcotacao(), "selecionando cotacao");
	 p.pauser(5000, "pausa");
	  p.clicar(e.getBtnProximo4(), "botão proximo"); 
	}

	@When("preencher a aba Send Quote")
	public void preencher_a_aba_send_quote() throws IOException, InterruptedException {
	  p.escrever(e.getEmail(), "teste@teste.com.br", "email");
	  p.escrever(e.getTelefone(), "111111111", "telefone");
	  p.escrever(e.getUsuario(), "thamires", "usuario");
	  p.escrever(e.getSenha(), "Caribe2016", "senha");
	  p.escrever(e.getConfirmacaoSenha(), "Caribe2016", "confirmacao de senha");
	  p.escrever(e.getComentarios(), "teste", "comentarios");
	  p.clicar(e.getBtnEnviar(), "botão enviar");
	  p.pauser(10000, "pausa");
	}

	@Then("Valido a mensagem de sucesso em tela")
	public void valido_a_mensagem_de_sucesso_em_tela() throws IOException {
	  p.validarTexto(e.getTextosucesso(), "Sending e-mail success!", "validando mensagem");
	  String evidencia =  "Accenture";
	  p.screnShoot("./Evidencia/" + evidencia + ".png");
	  p.fecharBrowser("fechando navegador");
	}
}