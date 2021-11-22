# ProjetoTeste
Teste Automatizado Alterdata

Para executar este projeto valide os seguintes fatores:

1 - Verifique se o POM.xml está com todas as bibliotecas necessárias. 
2 - Verifique se o Cucumber está instalado em seu Eclipse. 
3 - Garanta que o Google Chrome esteja na versão 93. (O arquivo enviado pela empresa veio nessa versão)
4 - É necessário trocar os caminhos do código para que sejam direcionados à máquina do usuário, sendo eles os seguintes:

* {Cucumber} Given que eu esteja no "F:\ProjetoTeste\teste-automatizado\Login\Sistema/index.html" (Mude o caminho até index.html")
* {Classe Metodos} System.setProperty("webdriver.chrome.driver", "F:\\ProjetoTeste\\teste-automatizado\\Driver\\chromedriver.exe"); (Mude o caminho até chromedriver.exe")
* {Classe Metodos} File pathFile = new File("F:\\ProjetoTeste\\teste-automatizado\\Evidências/" + nome + ".png"); (Mude o caminho até Evidências/" + nome + ".png")

(Ao rodar o programa, o Eclipse alerta que o sistema de login/senha disponibilizado para a criação dos testes só aceita a versão 93 do Chrome, por isso, caso o chrome do usuário não esteja nesta versão, o programa não irá funcionar.)
