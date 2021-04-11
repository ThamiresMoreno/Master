#Author: souza.thamires.96@outllok.com.br

@accenture
Feature: Teste Accenture

  
  Scenario: Preencher formulario e validar envio
    Given que acesse o site "http://sampleapp.tricentis.com/101/app.php"
    And preencher a aba Enter Vehicle Data
    And preencher a aba Enter Insurant Data
    And preencher a aba Enter Product Data
    And preencher a aba Select Price Option
   When preencher a aba Send Quote
   Then Valido a mensagem de sucesso em tela 