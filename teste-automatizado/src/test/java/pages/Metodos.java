package pages;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl) {

		try {

			System.setProperty("webdriver.chrome.driver",
					"F:\\ProjetoTeste\\teste-automatizado\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(appUrl);

		} catch (Exception e) {

			System.out.println("Erro ao abrir o navegador" + e.getMessage());
		}

	}

	public void maximizarNavegador(String maximizar) {

		try {

			driver.manage().window().maximize();

		} catch (Exception e) {

			System.out.println("Erro ao maximizar o navegador" + e.getMessage());
		}

	}

	public void digitar(String texto, By elemento) {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {

			System.out.println("Erro ao digitar o texto" + e.getMessage());
		}

	}

	public void submit(By elemento) {

		try {

			driver.findElement(elemento).submit();

		} catch (Exception e) {

			System.out.println("Erro ao usar o submit" + e.getMessage());

		}

	}

	public void fecharNavegador() {

		try {

			driver.quit();

		} catch (Exception e) {

			System.out.println("Erro ao fechar o navegador" + e.getMessage());
		}

	}

	public void validarTexto(String textoEsperado, By elemento) {

		try {

			String texto = driver.findElement(elemento).getText();

			assertEquals(textoEsperado, texto);

		} catch (Exception e) {

			System.out.println("Erro ao validar o texto" + e.getMessage());

		}
	}

	public void click(By elemento) {

		try {

			driver.findElement(elemento).click();

		} catch (Exception e) {

			System.out.println("Erro ao clicar no elemento" + e.getMessage());

		}

	}

	public void screenShot(String nome) throws IOException {

		try {

			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File pathFile = new File("F:\\ProjetoTeste\\teste-automatizado\\EvidÍncias/" + nome + ".png");
			FileUtils.copyFile(scrFile, pathFile);

		} catch (Exception e) {

			System.out.println("Erro ao tirar uma ScreenShot" + e.getMessage());

		}

	}

	public void sleep(By Element) throws InterruptedException {

		try {

			Thread.sleep(500);

		} catch (Exception e) {

			System.out.println("Erro ao usar o ThreadSleep" + e.getMessage());

		}

	}

}
