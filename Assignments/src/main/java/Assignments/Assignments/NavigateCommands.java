package Assignments.Assignments;

public class NavigateCommands extends Assignment{
	public void navigate() {
	driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh(); 
	}
	public static void main(String[] args) {
		NavigateCommands obj= new NavigateCommands();
		obj.initializeBrowser();
		obj.navigate();
	}
}
