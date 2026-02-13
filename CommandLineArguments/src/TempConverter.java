/*
 * Copyright (c) 2026 Austin Meyers
 * 
 * Permissions faonjgfxkugnf
 */
import java.util.Arrays;

/**
 * Methods to convert temperature from one system to another.
 * 
 * @author Austin Meyers
 * @author Other beings
 * @version 1.0
 * 
 */

public class TempConverter {
	/**
	 * The freezing temperature in celsius.
	 */
	public final double FREEZING_TEMP_CELSIUS = 0.0;
	/**
	 * The freezing temperature in fahrenheit.
	 */
	public final double FREEZING_TEMP_FAHRENHEIT = 32.0;
	
	/**
	 * This converts a temperature from fahrenheit to celsius.
	 * @param temperature in fahrenheit.
	 * @return temperature in celsius.
	 */
	public static double ConvertFahToCel(double input) {
		return((input - 32) * ( 5.0/9.0 ));
	}
	/**
	 * This converts a temperature from celsius to fahrenheit.
	 * @param temperature in celsius.
	 * @return temperature in fahrenheit.
	 */
	public static double ConvertCelToFah(double input) {
		return ((input) * (9.0/5.0)) + 32;
	}
}
