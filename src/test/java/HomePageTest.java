import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	HomePageObjects hp;
	int random = new Random().nextInt(50000);
	String email = "Testq" + random + "@gmail.com";
	 public HomePageTest() {
		// TODO Auto-generated constructor stub
	hp = new HomePageObjects();	
	}
	
	@Test
	public void VerifyBtns(){
		Assert.assertTrue(hp.elementFound(hp.womenbtn()));
	}
	@Test
	public void VerifySubMsg(){
		hp.SetEmail(email);
	}

}
