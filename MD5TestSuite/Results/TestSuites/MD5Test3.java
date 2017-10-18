import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The correct checksum are generated from http://onlinemd5.com/
 * @author zhaoxuelin
 *
 */

// 2 4 6 8 10 12 14
public class MD5Test3 {
	private final MD5 md5 = new MD5();

	// text = "" 0 byte 0 bits
	@Test
	public void MD5Test2() {
		String text = "";
		String correctChecksum = "D41D8CD98F00B204E9800998ECF8427E";

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

	// text 64 bytes 512 bits
	@Test
	public void MD5Test6() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaaa";
		String correctChecksum = "3EA4CC15BB88511AA109716DC4CDA0C6";

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

	

	// text 64-8-1 bytes 512-64-8 bits
	@Test
	public void MD5Test10() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaa";
		String correctChecksum = "4F4C438035E0623EA37409D565F6ABC9";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

	// text 128-1 bytes 2*512-8 bits
	@Test
	public void MD5Test12() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaa";
		String correctChecksum = "AFE12DD7EB499E2D91D0D58595C7AA79";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}

	

	// text 128-8+1 bytes 2*512-64+8 bits
	@Test
	public void MD5Test14() {
		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaaaa";
		String correctChecksum = "E9BF0294CB4E01E188748BDA7320B8B1";

		String checksum = md5.strDisplay(text);
		assertEquals(checksum, "0x" + correctChecksum);
	}


}
