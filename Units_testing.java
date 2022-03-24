package testing;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Units_testing {
		@BeforeClass
		public static void beforeclass() {
			System.out.println("Before class");
		}
		@Before
		public void before() {
			System.out.println("Before");
		}
		
		@Test
	    public void test() {
			Conversion converter = new Conversion();
			assertEquals("1.0",converter.convert(1,"cm","cm"));
			assertEquals("100.0",converter.convert(1,"m","cm"));
			assertEquals("0.001",converter.convert(100,"cm","km"));
			assertEquals("1.0",converter.convert(1,"gm","gm"));
			assertEquals("100.0",converter.convert(0.1,"kg","gm"));
			assertEquals("32.0",converter.convert(0,"c","f"));
			assertEquals("-273.0",converter.convert(0,"k","c"));
			assertEquals("100200.0",converter.compute(1,"km",200,"cm","cm","+"));
			assertEquals("2.0",converter.compute(1,"m",100,"cm","m","+"));
			assertEquals("0.5",converter.compute(1,"m",50,"cm","m","-"));
			assertEquals("1900.0",converter.compute(2000,"cm",1,"m","cm","-"));
			assertEquals("1010.0",converter.compute(10,"gm",1,"kg","gm","+"));
			assertEquals("1.0",converter.compute(1.5,"kg",500,"gm","kg","-"));
			System.out.println("test case verify");
	    }
		
		@After
		public void after() {
			System.out.println("After");
		}
		@AfterClass
		public static void afterclass() {
			System.out.println("After class");
		}
}
