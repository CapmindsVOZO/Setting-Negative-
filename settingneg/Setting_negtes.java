package com.settingneg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setting_negtes extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getsettingnega().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getsettingnega().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getsettingnega().getSigninbtn());

		// get set

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Clickonelement(pom.getsettingnega().getsettneg());

		// cli sche

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement sche = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Scheduling')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sche);

		// Clickonelement(pom.getsettingnega().getclische());

		// cli app re

		Thread.sleep(3000);

		Clickonelement(pom.getsettingnega().getcliappre());

		// sele voi
		Thread.sleep(3000);

		Clickonelement(pom.getsettingnega().getselevoi());

		// sele rad

		Clickonelement(pom.getsettingnega().getselerad());

		// ed

		Clickonelement(pom.getsettingnega().getclied());

		// cli clie

		Clickonelement(pom.getsettingnega().getcliclima());

		// cli clie

		Clickonelement(pom.getsettingnega().getclipra());

		// cli clie

		Clickonelement(pom.getsettingnega().getcliclie());

		// cli clie

		Clickonelement(pom.getsettingnega().getcliapp());

		// cli clie

		Clickonelement(pom.getsettingnega().getclili());

		// cli clie ******

		Clickonelement(pom.getsettingnega().getclisav());

		// cli clie

		Thread.sleep(5000);

		Clickonelement(pom.getsettingnega().getclitex());

		// sele rad

		Thread.sleep(2000);
		Clickonelement(pom.getsettingnega().getselerad1());

		// ed

		Clickonelement(pom.getsettingnega().getclied1());

		// cli clie

		Clickonelement(pom.getsettingnega().getcliclima());

		// cli clie

		Clickonelement(pom.getsettingnega().getclipra());

		// cli clie

		Clickonelement(pom.getsettingnega().getcliclie());

		// cli clie

		Clickonelement(pom.getsettingnega().getcliapp());

		// cli clie

		Clickonelement(pom.getsettingnega().getclili());

		// cli clie

		Clickonelement(pom.getsettingnega().getclisav());

		// cli admi
		Thread.sleep(4000);

		Clickonelement(pom.getsettingnega().getcliad());

		// cli erx
		Thread.sleep(3000);

		Clickonelement(pom.getsettingnega().getclier());

		// cli admi
		Thread.sleep(2000);

		Clickonelement(pom.getsettingnega().getcliedi());

		// cli admi
		Thread.sleep(2000);

		Clickonelement(pom.getsettingnega().getcliclo());

		// add fav pre

		Thread.sleep(2000);

		Clickonelement(pom.getsettingnega().getclifavp());

		// *******
		// cli sup

//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings_Module().getclisup());

		// fin med

		sendkeys(pom.getsettingnega().getfinmed(), "a");

		// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getsettingnega().getselmed1());

		// sen di

		sendkeys(pom.getsettingnega().getsendi1(), "10");

		// mov com

		Clickonelement(pom.getsettingnega().getclicom());

		// clo com
		Thread.sleep(2000);

		Clickonelement(pom.getsettingnega().getcliclo1());

		// clo com
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement faphar = wait3.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Favorite Pharmacies')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", faphar);

		// Clickonelement(pom.getsettingnega().getclifavpar());

		// clo com
		Thread.sleep(2000);

		Clickonelement(pom.getsettingnega().getaddphar());

		// c;i re

		Clickonelement(pom.getsettingnega().getclire());

		// c;i re

		sendkeys(pom.getsettingnega().getsenre(), "a");

		// sear

		Clickonelement(pom.getsettingnega().getserre());

		// clo

		Clickonelement(pom.getsettingnega().getclophar());

	}

}
