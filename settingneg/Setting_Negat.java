package com.settingneg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setting_Negat {

	public WebDriver driver;

	public Setting_Negat(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	@FindBy(id = "normal_login_username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath = "(//a[normalize-space()='Settings'])[1]")

	private WebElement settneg;

	public WebElement getsettneg() {
		return settneg;
	}

	@FindBy(xpath = "(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow4'])[1]")

	private WebElement clische;

	public WebElement getclische() {
		return clische;
	}

	@FindBy(xpath = "(//a[normalize-space()='Appointment Reminders'])[1]")

	private WebElement cliappre;

	public WebElement getcliappre() {
		return cliappre;
	}

	@FindBy(xpath = "(//div[contains(text(),'Voice')])[1]")

	private WebElement selevoi;

	public WebElement getselevoi() {
		return selevoi;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-switch-handle')])[2]")

	private WebElement selerad;

	public WebElement getselerad() {
		return selerad;
	}

	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Edit'])[3]")

	private WebElement clied;

	public WebElement getclied() {

		return clied;
	}

	@FindBy(xpath = "(//select[@class='form-control'])[1]")

	private WebElement cliclima;

	public WebElement getcliclima() {

		return cliclima;
	}

	@FindBy(xpath = "(//select)[2]")

	private WebElement clipra;

	public WebElement getclipra() {

		return clipra;
	}

	@FindBy(xpath = "(//select)[2]")

	private WebElement cliclie;

	public WebElement getcliclie() {

		return cliclie;
	}

	@FindBy(xpath = "(//select)[4]")

	private WebElement cliapp;

	public WebElement getcliapp() {

		return cliapp;
	}

	@FindBy(xpath = "(//select)[5]")

	private WebElement clili;

	public WebElement getclili() {

		return clili;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement clisav;

	public WebElement getclisav() {

		return clisav;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-1-tab-3'])[1]")

	private WebElement clitex;

	public WebElement getclitex() {

		return clitex;
	}

	@FindBy(xpath = "(//div[@class='ant-switch-handle'])[3]")

	private WebElement selerad1;

	public WebElement getselerad1() {

		return selerad1;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[4]")

	private WebElement clied1;

	public WebElement getclied1() {

		return clied1;
	}

	@FindBy(xpath = "(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow5'])[1]")

	private WebElement cliad;

	public WebElement getcliad() {

		return cliad;
	}

	@FindBy(xpath = "(//a[normalize-space()='eRx Settings'])[1]")

	private WebElement clier;

	public WebElement getclier() {

		return clier;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='fav-pr-ed-ic text-primary'])[1]")

	private WebElement cliedi;

	public WebElement getcliedi() {

		return cliedi;
	}

	@FindBy(xpath = "(//span[normalize-space()='×'])[1]")

	private WebElement cliclo;

	public WebElement getcliclo() {

		return cliclo;
	}

	@FindBy(xpath = "(//span[normalize-space()='Favourite Prescriptions'])[1]")

	private WebElement clifavp;

	public WebElement getclifavp() {

		return clifavp;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Find Medication'])[1]")

	private WebElement finmed;

	public WebElement getfinmed() {

		return finmed;
	}
	
	@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='RETIN-A (Topical)'])[1]")

	private WebElement selmed1;

	public WebElement getselmed1() {

		return selmed1;
	}
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")

	private WebElement sendi1;

	public WebElement getsendi1() {

		return sendi1;
	}
	

	@FindBy(xpath = "(//span[normalize-space()='Compound'])[1]")

	private WebElement clicom;

	public WebElement getclicom() {

		return clicom;
	}

	@FindBy(xpath = "(//span[normalize-space()='×'])[1]")

	private WebElement cliclo1;

	public WebElement getcliclo1() {

		return cliclo1;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-1-tab-2'])[1]")

	private WebElement clifavpar;

	public WebElement getclifavpar() {

		return clifavpar;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Pharmacies'])[1]")

	private WebElement addphar;

	public WebElement getaddphar() {

		return addphar;
	}

	@FindBy(xpath = "(//button[normalize-space()='Retail'])[1]")

	private WebElement clire;

	public WebElement getclire() {

		return clire;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")

	private WebElement senre;

	public WebElement getsenre() {

		return senre;
	}

	@FindBy(xpath = "(//span[@class='fv-ph-icon input-group-text'])[1]")

	private WebElement serre;

	public WebElement getserre() {

		return serre;
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")

	private WebElement clophar;

	public WebElement getclophar() {

		return clophar;
	}

}
