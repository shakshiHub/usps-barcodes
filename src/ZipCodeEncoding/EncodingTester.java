package ZipCodeEncoding;

	/**
	 * A Java application program for class ZipCodeEncoding.
	 * 
	 * Step 1: Enter your name for @author and the password for @version
	 * @author  Qi Yang
	 * @version 2022-12-12
	 */
	public class EncodingTester
	{
	    public static void main(String[] args)
	    {
	        // Testing method digitEncoding()
	        System.out.println("Result: " + Encoding.digitEncoding(0));
	        System.out.println("Expected: ||:::");
	        System.out.println("Result: " + Encoding.digitEncoding(8));
	        System.out.println("Expected: |::|:");
	        
	        // Testing method zipEncoding()
	        System.out.println("Result: " + Encoding.zipEncoding("95014"));
	        System.out.println("Expected: |:|:::|:|:||::::::||:|::|");
	        
	        // Testing method checksumDigitEncoding()
	        System.out.println("Result: " + Encoding.checksumDigitEncoding("94539"));
	        System.out.println("Expected: ||:::");

	        // Testing method getEncoding()
	        System.out.println("Result: " + Encoding.getEncoding("02138"));
	        System.out.println("Expected: |||:::::|:|:::||::||:|::|::||::|");
	    }
	}
