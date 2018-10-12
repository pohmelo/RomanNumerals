import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	@Test
	public void testIXCMRepetitions(){
		RomanNumerals roman = new RomanNumerals();
		assertEquals(0, roman.convertToInteger("IIII"));
		assertEquals(0, roman.convertToInteger("XXXX"));
		assertEquals(0, roman.convertToInteger("CCCC"));
		assertEquals(0, roman.convertToInteger("IMMMM"));
		assertEquals(3, roman.convertToInteger("III"));
	}
	
	@Test
	public void testVLDRepetitions(){
		RomanNumerals roman = new RomanNumerals();
		assertEquals(0, roman.convertToInteger("VV"));
		assertEquals(0, roman.convertToInteger("LL"));
		assertEquals(0, roman.convertToInteger("DD"));
		assertEquals(500, roman.convertToInteger("D"));
	}
	
	@Test
	public void test1Substractions(){
		RomanNumerals roman = new RomanNumerals();
		assertEquals(4, roman.convertToInteger("IV"));
		assertEquals(9, roman.convertToInteger("IX"));
		assertEquals(0, roman.convertToInteger("DD"));
		assertEquals(500, roman.convertToInteger("D"));
	}
	
	@Test
	public void test2Substractions(){
		RomanNumerals roman = new RomanNumerals();
		assertEquals(0, roman.convertToInteger("IIV"));
		assertEquals(0, roman.convertToInteger("IIIX"));
	}
	
	@Test
	public void test3Substractions(){
		RomanNumerals roman = new RomanNumerals();
		assertFalse(roman.convertToInteger("VX") == 5);
		assertFalse(roman.convertToInteger("LD") == 450);
		assertFalse(roman.convertToInteger("DM") == 500);
		assertFalse(roman.convertToInteger("VL") == 45);
	}
	
	@Test
	public void testExtras(){
		RomanNumerals roman = new RomanNumerals();
		assertEquals(0, roman.convertToInteger("IIII"));
		assertEquals(1, roman.convertToInteger("I"));
		assertEquals(2, roman.convertToInteger("II"));
		assertEquals(3, roman.convertToInteger("III"));
		assertEquals(4, roman.convertToInteger("IV"));
		assertEquals(5, roman.convertToInteger("V"));
		assertEquals(6, roman.convertToInteger("VI"));
		assertEquals(7, roman.convertToInteger("VII"));
		assertEquals(8, roman.convertToInteger("VIII"));
		assertEquals(9, roman.convertToInteger("IX"));
		assertEquals(10, roman.convertToInteger("X"));
		assertEquals(20, roman.convertToInteger("XX"));
		assertEquals(30, roman.convertToInteger("XXX"));
		assertEquals(40, roman.convertToInteger("XL"));
		assertEquals(50, roman.convertToInteger("L"));
		assertEquals(60, roman.convertToInteger("LX"));
		assertEquals(70, roman.convertToInteger("LXX"));
		assertEquals(80, roman.convertToInteger("LXXX"));
		assertEquals(90, roman.convertToInteger("XC"));
		assertEquals(100, roman.convertToInteger("C"));
		assertEquals(200, roman.convertToInteger("CC"));
		assertEquals(300, roman.convertToInteger("CCC"));
		assertEquals(400, roman.convertToInteger("CD"));
		assertEquals(500, roman.convertToInteger("D"));
		assertEquals(600, roman.convertToInteger("DC"));
		assertEquals(700, roman.convertToInteger("DCC"));
		assertEquals(800, roman.convertToInteger("DCCC"));
		assertEquals(900, roman.convertToInteger("CM"));
		assertEquals(1000, roman.convertToInteger("M"));
		assertEquals(1984, roman.convertToInteger("MCMLXXXIV"));
		assertEquals(2014, roman.convertToInteger("MMXIV"));
	}
}
