import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1GET {
	@Test
	void test_01() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res + "");
		System.out.println(res.getBody() + "");
		System.out.println(res.getStatusCode() + "");
		System.out.println(res.getTime() + "");
		System.out.println(res.getHeader("content-type") + "");
		
		Assert.assertEquals(res.getStatusCode(), 201);
	}
	
	@Test
	void test_02() {
		
	}
}
