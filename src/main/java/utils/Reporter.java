package utils;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class Reporter {
	
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentTest logger;
	
	public String testcaseName, testcaseDec, author, category;
	public static  String excelFileName;
	
	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(false); 
		
		extent   = new ExtentReports();		
		extent.attachReporter(reporter);
	}
	
    //@BeforeClass
	public void report() throws IOException {
		test = extent.createTest(testcaseName, testcaseDec);
	    test.assignAuthor(author);
	    test.assignCategory(category);  
	}
	
	@BeforeTest
	public void Deleteimages() 
	{
	File file = new File("./../reports/images");      
    String[] myFiles;    
        if(file.isDirectory()){
            myFiles = file.list();
            for (int i=0; i<myFiles.length; i++) {
                File myFile = new File(file, myFiles[i]); 
                myFile.delete();
            }
            }
         }
    
    public abstract long takeSnap();
	
	public void reportStep(String desc,String status,boolean bSnap)
	{
		MediaEntityModelProvider img=null;
		if(bSnap && !status.equalsIgnoreCase("INFO"))
		{
			long snapNumber=100000L;
			snapNumber=takeSnap();
			try
			{
				img=MediaEntityBuilder.createScreenCaptureFromPath("./../reports/images/"+snapNumber+".jpg").build();
			}
			catch(IOException e)
			{
				
			}
		}
		if(status.equalsIgnoreCase("pass"))
		{
			test.pass(desc,img);
			
		}
		else if(status.equalsIgnoreCase("fail"))
		{
			System.out.println("reached fail block");
			test.fail(desc,img);
		}
		else if(status.equalsIgnoreCase("INFO"))
		{
			test.pass(desc);
		}
	}
	
	public void reportStep(String desc,String status)
	{
		System.out.println("reached report block");
		reportStep(desc,status,true);
	}
    
    @AfterSuite
    public void stopReport() {
    	extent.flush();
    }
}














