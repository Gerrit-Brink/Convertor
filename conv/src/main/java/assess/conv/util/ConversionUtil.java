package assess.conv.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ConversionUtil {
	public static final MathContext MATH_CONTEXT 					= new MathContext(5, RoundingMode.HALF_UP);
	private static final BigDecimal KELVIN_CELCIUS_OFFSET 			= new BigDecimal("273.15");
	private static final BigDecimal KILOMOETERS_TO_MILES_CONVERSION = new BigDecimal("1.609");
	
	public static void main(String[] args){
		System.out.println("KelvinToCelcius = " + KelvinToCelcius(new BigDecimal(1)));
		System.out.println("CelciusToKelvin = " + CelciusToKelvin(new BigDecimal(1)));
		System.out.println("MilesToKilometers = " + MilesToKilometers(new BigDecimal(1)));
		System.out.println("KilometersToMiles = " + KilometersToMiles(new BigDecimal(1)));
	}
	
	public static BigDecimal KelvinToCelcius(BigDecimal kelvin){
		return kelvin.subtract(KELVIN_CELCIUS_OFFSET, MATH_CONTEXT);
	}
	
	public static BigDecimal CelciusToKelvin(BigDecimal celcius){
		return celcius.add(KELVIN_CELCIUS_OFFSET, MATH_CONTEXT);
	}
	
	public static BigDecimal MilesToKilometers(BigDecimal miles){
		return miles.multiply(KILOMOETERS_TO_MILES_CONVERSION, MATH_CONTEXT);
	}
	
	public static BigDecimal KilometersToMiles(BigDecimal kilometers){
		return kilometers.divide(KILOMOETERS_TO_MILES_CONVERSION, MATH_CONTEXT);
	}
}
