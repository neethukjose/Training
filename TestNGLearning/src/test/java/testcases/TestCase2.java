package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void validateTitle() {
		String actual_Title="abc";
		String expected_value="no";
		
		Assert.assertEquals(actual_Title, expected_value);
	}



}
