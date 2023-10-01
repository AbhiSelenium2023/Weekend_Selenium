package TestNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_1 
{
    @Test
    public void test1()
    {
    	Reporter.log("Hello",true);//true is mandatory to get output in console
    }
	
	
	
}
