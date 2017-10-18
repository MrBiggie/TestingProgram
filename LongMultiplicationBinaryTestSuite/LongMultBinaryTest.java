import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LongMultBinaryTest {
	private final LongMultBinary lmb = new LongMultBinary();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void longMultBinTest01() {
		String a = "-5";
		String b = "10";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void longMultBinTest02() {
		String a = "-3";
		String b = "-8";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest03() {
		String a = "0";
		String b = "0";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest04() {
		String a = "0";
		String b = "1";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest05() {
		String a = "1";
		String b = "1";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest06() {
		String a = "0";
		String b = "2147483647";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest07() {
		String a = "1";
		String b = "2147483647";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest08() {
		String a = "2147483647";
		String b = "2147483647";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest09() {
		String a = "0";
		String b = "2147483648";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest10() {
		String a = "1";
		String b = "2147483648";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest11() {
		String a = "2147483647";
		String b = "2147483648";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest12() {
		String a = "2147483648";
		String b = "2147483648";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest13() {
		String a = "9223372036854775807";
		String b = "1";
		Long m = Long.parseLong(a)*Long.parseLong(b);
		assertEquals(this.lmb.doMult(a, b), m.toString());
	}
	
	@Test
	public void longMultBinTest14() {
		String a = "9223372036854775807";
		String b = "2147483647";
		BigInteger m1 = new BigInteger(a);
		BigInteger m2 = new BigInteger(b);
		assertEquals(this.lmb.doMult(a, b), m1.multiply(m2).toString());
	}
	
	@Test
	public void longMultBinTest15() {
		String a = "9223372036854775808";
		String b = "9223372036854775808";
		BigInteger m1 = new BigInteger(a);
		BigInteger m2 = new BigInteger(b);
		assertEquals(this.lmb.doMult(a, b), m1.multiply(m2).toString());
	}

}


































