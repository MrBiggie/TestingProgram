import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The correct checksum are generated from http://onlinemd5.com/
 * @author zhaoxuelin
 *
 */

// 1 3 5 7 9 11 13 15
public class MD5Test2 {
	private final MD5 md5 = new MD5();

	// text = null 0 byte 0 bits
	@Test(expected = NullPointerException.class)
	public void MD5Test1() {
		String text = null;
		String correctChecksum = "";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

	// text = " " 1byte 8 bits
	@Test
	public void MD5Test3() {
		String text = " ";
		String correctChecksum = "7215EE9C7D9DC229D2921A40E899EC5F";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

	// text  2 bytes 16 bits
	@Test
	public void MD5Test5() {
		String text = "ab";
		String correctChecksum = "187EF4436122D1CC2F40DC2B92F0EBA0";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

	// text 64-1 bytes 512-8 bits
	@Test
	public void MD5Test7() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaa";
		String correctChecksum = "B0803BCF8060BBF7958C181B68F2F485";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

	// text 64-8+1 bytes 512-64+8 bits
	@Test
	public void MD5Test9() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaa";
		String correctChecksum = "3FA18EC53DE1B93F69DBE40C5D14193D";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	// text 64-8-1 bytes 512-64-8 bits
	

	// text 128 bytes 2*512 bits
	@Test
	public void MD5Test11() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaaa";
		String correctChecksum = "167481A33CB41E506DC0CBA4640B98D2";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

	// text 128-8 bytes 2*512-64 bits
	@Test
	public void MD5Test13() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaa";
		String correctChecksum = "92EDE868B9EBC27642B46DB930E93C1D";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

	// text 128-8-1 bytes 2*512-64-8 bits
	@Test
	public void MD5Test15() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaa";
		String correctChecksum = "00465D38B1846E420D029A2418B1DA64";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

}
