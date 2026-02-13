	/**
	 * Tests the conversion methods.
	 * @param args command-line arguments
	 */
public class Driver {


	
	public static void main(String[] args) {
		
		if(args.length < 2) {
			System.out.println("Usage: ");
			System.out.println("\t-f to convert to fahrenheit");
			System.out.println("\t-c to convert to celsius");
			System.exit(-5);
		}
		double answer = 0.0;
		if(args[0].equals("-f")) {
			answer = TempConverter.ConvertCelToFah(Double.parseDouble(args[1]));
			System.out.println("The fahrenheit value is " + answer);
		}
		else if(args[0].equals("-c")) {
			answer = TempConverter.ConvertFahToCel(Double.parseDouble(args[1]));
			System.out.println("The celsius value is " + answer);
		}
		else {
			System.out.println("Unrecognized option: " + args[0]);
		}

	}

}
