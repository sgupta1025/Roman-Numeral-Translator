package gupta.romanNumeralTranslator;

public class RomanNumeralTranslator {
	String result ="";
	public String Translate(int numToTranslate) {
		int arabicNumber = numToTranslate;
		if (numToTranslate < 1|| numToTranslate>=4000/*Gets too long otherwise*/) {
			return "Invalid Roman Numeral";
		}
		while(numToTranslate >=1000) {
			result+=("M");
			numToTranslate-=1000;
		}
		while(numToTranslate >=900) {
			result+=("CM");
			numToTranslate-=900;
		}
		while(numToTranslate >=500) {
			result+=("D");
			numToTranslate-=500;
		}
		while(numToTranslate >=400) {
			result+=("CD");
			numToTranslate-=400;
		}
		while(numToTranslate >=100) {
			result+=("C");
			numToTranslate-=100;
		}
		while(numToTranslate >=90) {
			result+=("XC");
			numToTranslate-=90;
		}
		while(numToTranslate >=50) {
			result+=("L");
			numToTranslate-=50;
		}
		while(numToTranslate >=40) {
			result+=("XL");
			numToTranslate-=40;
		}
		while(numToTranslate >=10) {
			result+=("X");
			numToTranslate-=10;
		}
		while(numToTranslate >=5) {
			result+=("V");
			numToTranslate-=5;
		}
		while(numToTranslate >=4) {
			result+=("IV");
			numToTranslate-=4;
		}
		while(numToTranslate >=1) {
			result+=("I");
			numToTranslate-=1;
		}
		return "Arabic Numeral: "+ arabicNumber +"\nRoman Numeral: " + result;
	}
}
