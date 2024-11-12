package pac1;

import org.testng.annotations.Test;

public class Check1_Test {
    @Test
    public void contactcheck_Test() {
    	String URL = System.getProperty("url");
    	String BROWSER = System.getProperty("browser");
    	String USERNAME = System.getProperty("username");
    	String PASSWORD = System.getProperty("password");
    	System.out.println(URL);
    	System.out.println(BROWSER);
    	System.out.println(USERNAME);
    	System.out.println(PASSWORD);
    	System.out.println("Test-1");
    }
    @Test
    public void contactcheck2_Test() {
    	System.out.println("Test-2");
    }
}
