package Utility;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "data")
	public Object[][] testData(Method m) {
		Object[][] obj = null;

		if (m.getName().equals("loginPage")) {
			obj = new Object[1][2];
			obj[0][0] = "user@phptravels.com";
			obj[0][1] = "demouser";
		}

		if (m.getName().equals("planToVisit")) {
			obj = new Object[1][2];
			obj[0][0] = "user@phptravels.com";
			obj[0][1] = "demouser";
		}
		if (m.getName().equals("signUp")) {
			obj = new Object[1][5];
			obj[0][0] = "Tilak";
			obj[0][1] = "Raj";
			obj[0][2] = "8989568956";
			obj[0][3] = "abcs@gmail.com";
			obj[0][4]= "abcs@gmail.com"; 
//			obj[0][5]= "Agent";

		}
		
		if (m.getName().equals("getOffers")) {
			obj = new Object[1][2];
			obj[0][0] = "user@phptravels.com";
			obj[0][1] = "demouser";
		}
		if (m.getName().equals("xyz")) {
			obj = new Object[1][4];
			obj[0][0] = "Tilak";
			obj[0][1] = "Raj";
			obj[0][2] = "8989568956";
			

		}
		return obj;
	}
}
