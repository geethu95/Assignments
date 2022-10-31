package Assignments.Assignments;

public class BCommands extends Assignment {
	String actualTitle,actualURL,pagesource;
	
	public void basicCommands() {
		actualTitle=driver.getTitle();		//to get the page title
		actualURL=driver.getCurrentUrl();  // to get current page url
		pagesource=driver.getPageSource();   //to get page source
	}

	public static void main(String[] args) {
		BCommands obj= new BCommands();
		obj.initializeBrowser();
		obj.basicCommands();

	}

}
