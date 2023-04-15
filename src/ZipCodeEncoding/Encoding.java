package ZipCodeEncoding;

public class Encoding {
	//class that encompasses methods to produce USPS bar encodings for 5 digit zip codes
	//ex: zipcode of 95014 has a bar encoding of ||:|:::|:|:||::::::||:|::|:::|||
	
	//2-D int array where each row corresponds to a digit
	//ex: digit 3 corresponds to row 3 (which is represented by 00110)
	public static final int[][] DIGIT_CODE_TABLE = { { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 1, 0, 1 },
			{ 0, 0, 1, 1, 0 }, { 0, 1, 0, 0, 1 }, { 0, 1, 0, 1, 0 }, { 0, 1, 1, 0, 0 }, { 1, 0, 0, 0, 1 },
			{ 1, 0, 0, 1, 0 }, { 1, 0, 1, 0, 0 } };

	public static final int DECIMAL_BASE = 10;

	public static String digitEncoding(int digit) { //static method, digit parameter, returns bar encoding of digit
		String s = "";
		for (int num : DIGIT_CODE_TABLE[digit]) // for each num in specified digit row
		{
			if (num == 0) { //if number is 0 add colon to string
				s += ":";
			} else { //else add bar to string
				s += "|";
			}
		}
		return s; //return digit bar encoding
	}

	public static String zipEncoding(String zipcode) {//static method, string parameter of 5-digit zipcode 
													  //returns bar encoding of the 5 digits of the zipcode
		String s = "";
		for (int i = 0; i < zipcode.length(); i++) //for each char in the zipcode string
		{
			s += digitEncoding((zipcode.charAt(i)) - '0'); //call digitEncoding for each char(digit) and add to string
													       //use ASCII to convert char to integer
		}
		return s; //return bar encoding of the 5 digits of zipcode
	}

	public static String checksumDigitEncoding(String zipcode) {//static method, string parameter of 5-digit zipcode
																//returns bar encoding of checksum digit
		int total = 0;
		int checksum = 0;
		String s = "";

		for (int i = 0; i < zipcode.length(); i++) {
			total += zipcode.charAt(i) - '0'; //char will become int value
			                                  //sum each digit of zipcode
		}

		if (total % 10 == 0) { //if sum evenly divides by 10, checksum = 0
			checksum = 0;
		} else {
			checksum = (10 - (total % 10)); //else checksum = remainder of division
		}

		return s += digitEncoding(checksum); //return digitEncoding for the checksum value
	}

	public static String getEncoding(String zipcode) {//static method, string parameter of 5-digit zipcode
													  //returns bar encoding of 5 digit zipcode, checksum digit
													  //encompassed by bars ||
		return "|" + zipEncoding(zipcode) + checksumDigitEncoding(zipcode) + "|";
	}
}
