
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


public UrlValidatorTest(String testName) {
super(testName);
}



public void testManualTest()
{ 
	System.out.println("running manual test");
	
	UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	assertTrue(urlValidator.isValid("http://www.google.com"));
	assertTrue(urlValidator.isValid("file://www.google.com"));
}


public void testYourFirstPartition()
{
   //This partition will test for a null string value
   UrlValidator urlVal = new UrlValidator();
   String nullURL = null;
   assertFalse(urlVal.isValid(nullURL));
}

public void testYourSecondPartition(){
   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
   String testUrl = "http:/www.google.com/";//invalid scheme
   assertFalse(urlVal.isValid(testUrl));
}

public void testYourThirdPartition(){
   String[] schemes = {"http://", "ftp://", "h3t://"};
   String testUrl = "http://www.google.com/";//valid schemes
   String testUrl2 = "h3t://www.google.com/";//valid schemes
   UrlValidator urlVal = new UrlValidator(schemes);
   assertTrue(urlVal.isValid(testUrl));//found bug here
   assertTrue(urlVal.isValid(testUrl2));//found bug here
}

public void testYourFourthPartition(){
   String[] schemes = {"http://", "ftp://", "h3t://"};
   String testUrl = "http:/www.google.com/";//invalid schemes
   String testUrl2 = "://www.google.com/";//invalid schemes
   String testUrl3 = "f3t://www.google.com/";//invalid schemes
   UrlValidator urlVal = new UrlValidator(schemes);
   assertFalse(urlVal.isValid(testUrl));
   assertFalse(urlVal.isValid(testUrl2));
   assertFalse(urlVal.isValid(testUrl3));
}

//You need to create more test cases for your Partitions if you need to 

public void testIsValid()
{
	System.out.println("running programming based test");
	UrlValidator urlValidator = new UrlValidator();
	String[] inputs = {"http://www.google.com", "ftp://www.google.com"};
	for (int x = 0; x < inputs.length; x++){
		assertTrue(urlValidator.isValid(inputs[x]));
	}
}



}
