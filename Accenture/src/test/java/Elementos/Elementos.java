package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Elementos ABa “Enter Vehicle Data”
	private By marcaCarro = By.xpath("//select[@id='make']");
	private By modeloCarro = By.id("model");
	private By cilindrada = By.id("cylindercapacity");
	private By desenpenhoMotor = By.id("engineperformance");
	private By dataFabricacao = By.id("dateofmanufacture");
	private By numeroAssentos = By.id("numberofseats");
	private By ladoDirecao= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]/span");
	private By tipoCombustivel = By.id("fuel");
	private By precoTabela = By.id("listprice");
	private By placa = By.id("licenseplatenumber");
	private By km = By.id("annualmileage");
	private By btnProximo = By.id("nextenterinsurantdata");
	private By carga = By.id("payload");
    private By peso = By.id("totalweight");
	
	
	// Elementos Aba “Enter Insurant Data”
	private By primeiroNome = By.id("firstname");
	private By ultimoNome = By.id("lastname");
	private By dataNascimento = By.id("birthdate");
	private By checkBoxGenero = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]/span");
	private By endereco = By.id("streetaddress");
	private By pais = By.id("country");
	private By cep = By.id("zipcode");
	private By ocupacao = By.id("occupation");
	private By hobbis = By.xpath("//span[@class='ideal-check']");
	private By webSite = By.id("website");
	private By btmProximo2 = By.id("nextenterproductdata");
	private By numeroassentos2 = By.id("numberofseatsmotorcycle");

	// Elementos aba “Enter Product Data” 
	private By dataInicio = By.id("startdate");
	private By somaSeguro = By.id("insurancesum");
	private By classificacaoMerito = By.id("meritrating");
	private By seguroDanos = By.id("damageinsurance");
	private By checkboxEuroProtecao = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span");
	private By carrocortesia = By.id("courtesycar");
	private By btnProximo3 = By.id("nextselectpriceoption");

	//Elementos aba “Select Price Option” 
	private By btnProximo4= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]");
	private By textoValidacao = By.xpath("//p[normalize-space()='Please, select a price option to send the quote.']");
	private By checkboxcotacao = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span");
	

	//Elementos aba “Send Quote” 
	private By email = By.id("email");
	private By telefone = By.id("phone");
	private By usuario = By.id("username");
	private By senha = By.id("password");
	private By confirmacaoSenha  = By.id("confirmpassword");
	private By comentarios = By.id("Comments");
	private By btnEnviar = By.id("sendemail");
	
	//elemento validacao
	
	private By textosucesso = By.xpath("//div[4]/h2[normalize-space()='Sending e-mail success!']");
	
	
	
	
	
	
	public By getTextosucesso() {
		return textosucesso;
	}
	public By getNumeroassentos2() {
		return numeroassentos2;
	}
	public By getPeso() {
		return peso;
	}
	public By getCarga() {
		return carga;
	}
	public By getMarcaCarro() {
		return marcaCarro;
	}
	public By getModeloCarro() {
		return modeloCarro;
	}
	public By getCilindrada() {
		return cilindrada;
	}
	public By getDataFabricacao() {
		return dataFabricacao;
	}
	public By getNumeroAssentos() {
		return numeroAssentos;
	}
	public By getTipoCombustivel() {
		return tipoCombustivel;
	}
	public By getPrecoTabela() {
		return precoTabela;
	}
	public By getPlaca() {
		return placa;
	}
	public By getKm() {
		return km;
	}
	public By getBtnProximo() {
		return btnProximo;
	}
	public By getPrimeiroNome() {
		return primeiroNome;
	}
	public By getUltimoNome() {
		return ultimoNome;
	}
	public By getDataNascimento() {
		return dataNascimento;
	}
	public By getCheckBoxGenero() {
		return checkBoxGenero;
	}
	public By getEndereco() {
		return endereco;
	}
	public By getPais() {
		return pais;
	}
	public By getCep() {
		return cep;
	}
	public By getOcupacao() {
		return ocupacao;
	}
	public By getHobbis() {
		return hobbis;
	}
	public By getWebSite() {
		return webSite;
	}
	public By getBtmProximo2() {
		return btmProximo2;
	}
	public By getDataInicio() {
		return dataInicio;
	}
	public By getSomaSeguro() {
		return somaSeguro;
	}
	public By getClassificacaoMerito() {
		return classificacaoMerito;
	}
	public By getSeguroDanos() {
		return seguroDanos;
	}
	public By getCheckboxEuroProtecao() {
		return checkboxEuroProtecao;
	}
	public By getCarrocortesia() {
		return carrocortesia;
	}
	public By getBtnProximo3() {
		return btnProximo3;
	}
	public By getBtnProximo4() {
		return btnProximo4;
	}
	public By getTextoValidacao() {
		return textoValidacao;
	}
	public By getCheckboxcotacao() {
		return checkboxcotacao;
	}
	public By getEmail() {
		return email;
	}
	public By getTelefone() {
		return telefone;
	}
	public By getUsuario() {
		return usuario;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfirmacaoSenha() {
		return confirmacaoSenha;
	}
	public By getComentarios() {
		return comentarios;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
	public By getDesenpenhoMotor() {
		return desenpenhoMotor;
	}
	public By getLadoDirecao() {
		return ladoDirecao;
	}


}
