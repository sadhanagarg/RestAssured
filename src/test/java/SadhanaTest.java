import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SadhanaTest {
@Test
	void test()
	{
		Response result=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(result + "");
		System.out.println(result.getBody() + "");
		System.out.println(result.getStatusCode() + "");
		System.out.println(result.getTime() + "");
		System.out.println(result.getHeader("content-type") + "");
		
		Assert.assertEquals(result.getStatusCode(), 200);
	}
	
	
}
