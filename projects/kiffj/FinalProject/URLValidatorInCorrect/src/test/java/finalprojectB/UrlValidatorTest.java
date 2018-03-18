
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

}

public void testYourSecondPartition(){ 

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
