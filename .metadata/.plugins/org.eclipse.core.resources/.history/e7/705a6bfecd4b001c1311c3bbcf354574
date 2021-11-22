package tests;

import java.io.IOException;

import org.openqa.selenium.By;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb elements = new ElementosWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) {

		metodos.abrirNavegador(appUrl);
		metodos.maximizarNavegador(appUrl);
	}

	@When("preencho o formulario um")
	public void preencho_o_formulario_um() {

		metodos.click(elements.getEmail());
		metodos.digitar("admin@admin.com", elements.getEmail());
		metodos.click(elements.getSenha());
		metodos.digitar("admin123", elements.getSenha());
		metodos.click(elements.getBotaologin());
	}

	@Then("valido o resultado um {string}")
	public void valido_o_resultado_um(String textoEsperado) throws InterruptedException, IOException {

		metodos.validarTexto(textoEsperado, By.id("btn-entrar"));
		metodos.sleep(elements.getBotaologin());
		metodos.screenShot("teste-acesso-um");
		metodos.fecharNavegador();
	}

	@When("preencho o formulario dois")
	public void preencho_o_formulario_dois() {

		metodos.click(elements.getEmail());
		metodos.digitar("admin@admin.com", elements.getEmail());
		metodos.click(elements.getSenha());
		metodos.digitar("senha12345678", elements.getSenha());
		metodos.click(elements.getBotaologin());

	}

	@Then("valido o resultado dois {string}")
	public void valido_o_resultado_dois(String textoEsperado) throws InterruptedException, IOException {

		metodos.validarTexto(textoEsperado, By.id("btn-entrar"));
		metodos.sleep(elements.getBotaologin());
		metodos.screenShot("teste-acesso-dois");
		metodos.fecharNavegador();

	}

	@When("preencho o formulario tres")
	public void preencho_o_formulario_tres() {

		metodos.click(elements.getEmail());
		metodos.digitar("emailalterdata.com", elements.getEmail());
		metodos.click(elements.getSenha());
		metodos.digitar("admin123", elements.getSenha());
		metodos.click(elements.getBotaologin());

	}

	@Then("valido o resultado tres {string}")
	public void valido_o_resultado_tres(String textoEsperado) throws InterruptedException, IOException {

		metodos.validarTexto(textoEsperado, By.id("btn-entrar"));
		metodos.sleep(elements.getBotaologin());
		metodos.screenShot("teste-acesso-tres");
		metodos.fecharNavegador();

	}

	@When("preencho o formulario quatro")
	public void preencho_o_formulario_quatro() {

		metodos.click(elements.getEmail());
		metodos.digitar("emailtesteautomatizado.com", elements.getEmail());
		metodos.click(elements.getSenha());
		metodos.digitar("senhaalterdata123", elements.getSenha());
		metodos.click(elements.getBotaologin());

	}

	@Then("valido o resultado quatro {string}")
	public void valido_o_resultado_quatro(String textoEsperado) throws InterruptedException, IOException {

		metodos.validarTexto(textoEsperado, By.id("btn-entrar"));
		metodos.sleep(elements.getBotaologin());
		metodos.screenShot("teste-acesso-quatro");
		metodos.fecharNavegador();

	}

	@When("clico no botao Esqueci a senha")
	public void clico_no_botao_esqueci_a_senha() {

		metodos.click(elements.getBotaoEsquecisenha());

	}

	@Then("valido o resultado bonus {string}")
	public void valido_o_resultado_bonus(String textoEsperado) throws InterruptedException, IOException {

		metodos.validarTexto(textoEsperado, By.id("btn-entrar"));
		metodos.sleep(elements.getBotaologin());
		metodos.screenShot("teste-esqueciasenha-bonus");
		metodos.fecharNavegador();

	}

}