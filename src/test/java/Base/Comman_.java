package Base;

import org.apache.commons.lang.RandomStringUtils;

public class Comman_ {
	
	public static String randomStringGenerator()
	{
		String email=RandomStringUtils.randomAlphanumeric(5)+"@gmail.com";
		return email;
	}
	
	

}
