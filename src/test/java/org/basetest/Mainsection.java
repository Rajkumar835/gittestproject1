package org.basetest;
import java.io.IOException;

import org.basetest.Baseclassexercise;
public class Mainsection extends Baseclassexercise {

	public static void main(String[] args) throws IOException{
		launchBrowser("Firefox");
		launchUrl("demo");
		//launchUrl("http://gmail.com/");
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		implicitWait(12);
		 maximize();
		 ScreenShot();
		javascriptexecutor(currentUrl, null); 
		moveToElement(null);
		getAttribute(null);

	}

	
		
		
	}


