package org.test.Project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Base{

	
		public POM() {
			PageFactory.initElements(driver, this);

		}

		@FindBy(name = "first_name")
		private WebElement firstName;

		@FindBy(name = "last_name")
		private WebElement lastName;

		@FindBy(xpath = "//input[@value = 'single']")
		private WebElement statusSingle;

		@FindBy(xpath = "//input[@value = 'married']")
		private WebElement statusMarried;

		@FindBy(xpath = "//input[@value = 'divorced']")
		private WebElement statusDivorced;

		@FindBy(xpath = "//input[@value = 'dance']")
		private WebElement hobbyDance;

		@FindBy(xpath = "//input[@value = 'reading']")
		private WebElement hobbyReading;

		@FindBy(xpath = "//input[@value = 'cricket ']")
		private WebElement hobbyCricket;

		@FindBy(id = "dropdown_7")
		private WebElement dropDownCountry;

		@FindBy(id = "mm_date_8")
		private WebElement month;

		@FindBy(id = "dd_date_8")
		private WebElement date;

		@FindBy(id = "yy_date_8")
		private WebElement year;

		@FindBy(id = "phone_9")
		private WebElement phone;

		@FindBy(id = "username")
		private WebElement userName;

		@FindBy(id = "email_1")
		private WebElement email;

		@FindBy(id = "description")
		private WebElement desc;

		@FindBy(id = "password_2")
		private WebElement pw;

		@FindBy(id = "confirm_password_password_2")
		private WebElement pwConfirm;

		@FindBy(name = "pie_submit")
		private WebElement submitBtn;

		public WebElement getFirstName() {
			return firstName;
		}

		public void setFirstName(WebElement firstName) {
			this.firstName = firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public void setLastName(WebElement lastName) {
			this.lastName = lastName;
		}

		public WebElement getStatusSingle() {
			return statusSingle;
		}

		public void setStatusSingle(WebElement statusSingle) {
			this.statusSingle = statusSingle;
		}

		public WebElement getStatusMarried() {
			return statusMarried;
		}

		public void setStatusMarried(WebElement statusMarried) {
			this.statusMarried = statusMarried;
		}

		public WebElement getStatusDivorced() {
			return statusDivorced;
		}

		public void setStatusDivorced(WebElement statusDivorced) {
			this.statusDivorced = statusDivorced;
		}

		public WebElement getHobbyDance() {
			return hobbyDance;
		}

		public void setHobbyDance(WebElement hobbyDance) {
			this.hobbyDance = hobbyDance;
		}

		public WebElement getHobbyReading() {
			return hobbyReading;
		}

		public void setHobbyReading(WebElement hobbyReading) {
			this.hobbyReading = hobbyReading;
		}

		public WebElement getHobbyCricket() {
			return hobbyCricket;
		}

		public void setHobbyCricket(WebElement hobbyCricket) {
			this.hobbyCricket = hobbyCricket;
		}

		public WebElement getDropDownCountry() {
			return dropDownCountry;
		}

		public void setDropDownCountry(WebElement dropDownCountry) {
			this.dropDownCountry = dropDownCountry;
		}

		public WebElement getMonth() {
			return month;
		}

		public void setMonth(WebElement month) {
			this.month = month;
		}

		public WebElement getDate() {
			return date;
		}

		public void setDate(WebElement date) {
			this.date = date;
		}

		public WebElement getYear() {
			return year;
		}

		public void setYear(WebElement year) {
			this.year = year;
		}

		public WebElement getPhone() {
			return phone;
		}

		public void setPhone(WebElement phone) {
			this.phone = phone;
		}

		public WebElement getUserName() {
			return userName;
		}

		public void setUserName(WebElement userName) {
			this.userName = userName;
		}

		public WebElement getEmail() {
			return email;
		}

		public void setEmail(WebElement email) {
			this.email = email;
		}

		public WebElement getDesc() {
			return desc;
		}

		public void setDesc(WebElement desc) {
			this.desc = desc;
		}

		public WebElement getPw() {
			return pw;
		}

		public void setPw(WebElement pw) {
			this.pw = pw;
		}

		public WebElement getPwConfirm() {
			return pwConfirm;
		}

		public void setPwConfirm(WebElement pwConfirm) {
			this.pwConfirm = pwConfirm;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}

		public void setSubmitBtn(WebElement submitBtn) {
			this.submitBtn = submitBtn;
		}
		


		
	
}
