import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The correct checksum are generated from http://onlinemd5.com/
 * @author zhaoxuelin
 *
 */

// 1-10
public class MD5Test1 {
	private final MD5 md5 = new MD5();

	// text = null 0 byte 0 bits
	@Test(expected = NullPointerException.class)
	public void MD5Test1() {
		String text = null;
		String correctChecksum = "";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	// text = "" 0 byte 0 bits
	@Test
	public void MD5Test2() {
		String text = "";
		String correctChecksum = "D41D8CD98F00B204E9800998ECF8427E";

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

	// text 1 byte 8 bits
	@Test
	public void MD5Test4() {
		String text = "a";
		String correctChecksum = "0CC175B9C0F1B6A831C399E269772661";

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

	// text 64 bytes 512 bits
	@Test
	public void MD5Test6() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaaa";
		String correctChecksum = "3EA4CC15BB88511AA109716DC4CDA0C6";

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

	// text 64-8 bytes 512-64 bits
	@Test
	public void MD5Test8() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaa";
		String correctChecksum = "37427B28EB7CDD2D9B80D7926F9A201B";

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
	@Test
	public void MD5Test10() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaa";
		String correctChecksum = "4F4C438035E0623EA37409D565F6ABC9";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

}
