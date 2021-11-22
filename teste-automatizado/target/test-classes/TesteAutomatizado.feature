#Author: alexandre.bardelin@gmail.com

Feature: Validar login e senha
  Eu como analista quero validar a fun��o de acesso no site de testes
  
 Background: Acessar o site
     Given que eu esteja no "F:\ProjetoTeste\teste-automatizado\Login\Sistema/index.html"
 

 Scenario: Eu como analista quero validar o acesso um (login e senha corretos)
    When preencho o formulario um 
    Then valido o resultado um "Okay"
    
 Scenario: Eu como analista quero validar o acesso dois (login correto e senha incorreta)
 		When preencho o formulario dois
    Then valido o resultado dois "Error"
    
 Scenario: Eu como analista quero validar o acesso tres (login incorreto e senha correta)
 		When preencho o formulario tres
    Then valido o resultado tres "Error"
    
 Scenario: Eu como analista quero validar o acesso quatro (login e senha incorretos)
 		When preencho o formulario quatro
    Then valido o resultado quatro "Error"
    
 Scenario: Eu como analista quero validar a funcao de redefinir a senha (BONUS)
 		When clico no botao Esqueci a senha
    Then valido o resultado bonus "Okay"