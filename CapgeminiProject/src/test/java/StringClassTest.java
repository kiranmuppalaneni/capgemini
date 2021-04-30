import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

// Which you should not do.
//@Ignore
public class StringClassTest {

	@Test
	public void stringLengthTest() {
		String str = "Hello World";
		int actual = str.length();
		int expected = 11;
		// comparing the actual with expected result is called as assertion
		Assert.assertEquals(expected, actual);
	}
	

	@Test
	public void stringchatAtpositiveTest() {
		String str = "Hello World";
		char actual = str.charAt(4);
		char expected = 'o';
		// comparing the actual with expected result is called as assertion
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void stringchatAtmorepositiveTest() {
		String str = "Hello World";
		char actual = str.charAt(14);
	}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void stringchatAtnegativeTest() {
		String str = "Hello World";
		char actual = str.charAt(-10);
	}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void stringchatAtemptyTest() {
		String str = "";
		char actual = str.charAt(0);
	}
	
	@Test(expected=StringIndexOutOfBoundsException.class,timeout=1000)
	@Ignore
	public void stringcharAtNullTest() {
		String str = null;
		char actual = str.charAt(0);
	}
}
