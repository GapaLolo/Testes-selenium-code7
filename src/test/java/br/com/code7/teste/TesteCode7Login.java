package br.com.code7.teste;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TesteCode7Login {
	
	
	public void configuracao() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/");
		
//		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		driver.navigate().to("https://accounts.google.com/");
	}

//	public static void verificaContem(String xpath, String texto) throws InterruptedException{
//		assertTrue(driver.findElement(By.xpath(xpath)).getText().contains(texto));
//	}
//	

	@Test
	public void LoginGoogleGUI() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/");
		//Validando os itens presentes na tela de Login do Google
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/h1/span")).getText().contains("Fazer login"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/span")).getText().contains("Use sua Conta do Google"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).getText().contains("Esqueceu seu e-mail?"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/span/div/div")).getText().contains("Não está no seu computador? Use o modo visitante para fazer login com privacidade."));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).getText().contains("Criar conta"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).getText().contains("Próxima"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/div/div/div[1]/div[1]/div[30]/span")).getText().contains("‪Português (Brasil)‬"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[1]/a")).getText().contains("Ajuda"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[2]/a")).getText().contains("Privacidade"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[3]/a")).getText().contains("Termos"));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("gabriel.prado.lolo1@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[2]")).getText().contains("Tente usar outro navegador. Se você já está usando um navegador compatível, atualize a página e tente fazer login novamente."));
		
		driver.quit();
	}
	
	@Test
	public void CriarContaGoogleGUI() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signup/v2");
		//Validando os itens da tela de criação de conta
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div/h1/span")).getText().contains("Criar sua Conta do Google"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[2]")).getText().contains("Você pode usar letras, números e pontos finais"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[3]/div/div/button/span")).getText().contains("Usar meu endereço de e-mail atual em vez disso"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[2]/div/span")).getText().contains("Use oito ou mais caracteres com uma combinação de letras, números e símbolos"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[2]/div/div")).getText().contains("Mostrar senha"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/button/span")).getText().contains("Faça login em vez disso"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).getText().contains("Próxima"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/div/div/div[1]/div[1]/div[30]/span")).getText().contains("‪Português (Brasil)‬"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[1]/a")).getText().contains("Ajuda"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[2]/a")).getText().contains("Privacidade"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[3]/a")).getText().contains("Termos"));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("gabriel");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("lolo");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("gapalolo510");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("G@palolo226o");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("G@palolo226o");

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div/h1/span")).getText().contains("Verifique seu número de telefone"));
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]")).getText().contains("Para sua segurança, o Google quer confirmar se é realmente você. Ele enviará uma mensagem de texto com um código de verificação de seis dígitos."));

		
		driver.quit();
	}
	
	
	
	

}
