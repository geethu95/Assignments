package Assignments.Assignments;

import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;

public class Assert extends Assignment {
	String pagesource, expsource = "Bootstrap";

	@Test
	public void basicCommands() {
		pagesource = driver.getPageSource();
		System.out.println(pagesource);
		assertTrue(pagesource.contains(expsource));
	}

}
