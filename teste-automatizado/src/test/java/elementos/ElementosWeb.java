package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// Elementos Web

	private By email = By.id("email");
	private By senha = By.id("senha");
	private By botaoLogin = By.id("btn-entrar");
	private By botaoEsqueciASenha = By.cssSelector("#esqueci-senha");

	// Metodos publicos dos elementos (getters)

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getBotaologin() {
		return botaoLogin;
	}

	public By getBotaoEsquecisenha() {
		return botaoEsqueciASenha;
	}

}
