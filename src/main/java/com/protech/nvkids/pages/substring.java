package com.protech.nvkids.pages;

import org.testng.annotations.Test;

public class substring {
	
	
	@Test
	public void method1() {
		String s = "rg.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()='Search123']\"} (Session info: chrome=75.0.3770.142) Fo";

		
		int a =s.indexOf("Exception:");
		int b= s.lastIndexOf("Exception:");
		System.out.println(s.substring(0,a+10));
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
