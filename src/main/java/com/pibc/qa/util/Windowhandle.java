package com.pibc.qa.util;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

import com.pibc.qa.base.TestBase;

public class Windowhandle extends TestBase{
	
	private WebDriver driver;
	
	public Windowhandle(WebDriver driver) {
		this.driver=driver;
		  
	}
	
	public void handlewin() throws InterruptedException {
	Set<String> s1 = driver.getWindowHandles();
	String menuWindow=driver.getWindowHandle();
	s1.remove(menuWindow);
	
	Iterator<String> i1 = s1.iterator();
	String child=null;

	while (i1.hasNext()) {
		child=(String)i1.next();
		driver.switchTo().window(child);
		//perform action that you want to perform on child window
		}	
//	driver.switchTo().window(menuWindow); // switch back to parent window
	
	}
	
	
	public void handlewin1() {
		String parent = driver.getWindowHandle();
        Set<String> pops=driver.getWindowHandles();
        {
        Iterator<String> it =pops.iterator();
        while (it.hasNext()) {

            String popupHandle=it.next().toString();
            if(!popupHandle.contains(parent))
            {
            driver.switchTo().window(popupHandle);
            System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
            driver.close();
            }
        }
        }
        driver.switchTo().window(parent);
	}
	
	public void handlewin2() {
		String menuWindow=driver.getWindowHandle();	
		driver.switchTo().window(menuWindow);
		}
	
//	public void handlewin3(String ExpectedTitle,SoftAssert sa ) {
//	System.out.println("Expected Title=" + ExpectedTitle);
//		String mainWindow=driver.getWindowHandle();
//	 // It returns no. of windows opened by WebDriver and will return Set of Strings
//	 Set<String> set =driver.getWindowHandles();
//	 // Using Iterator to iterate with in windows
//	 Iterator<String> itr= set.iterator();
//	 while(itr.hasNext()){
//	 String childWindow=itr.next();
//	    // Compare whether the main windows is not equal to child window. If not equal, we will close.
//	 if(!mainWindow.equals(childWindow)){
//	 driver.switchTo().window(childWindow);
//	 String title=driver.switchTo().window(childWindow).getTitle();
//	 System.out.println("Actual Title= "+ driver.switchTo().window(childWindow).getTitle());
//	 sa.assertEquals(title, ExpectedTitle);
//	 driver.close();
//	 }
//	 }
//	 // This is to switch to the main window
//	 driver.switchTo().window(mainWindow);
//	 }
	
	
//	public void verifyPages(String key , SoftAssert sa) throws ParserConfigurationException {	
//		handlewin3(xmlFileReader.mapTitle.get(key),sa);
//	}

}



