package testing;
import java.util.Scanner;

public class Conversion {
	
	public static String convert(double value,String fromUnit ,String toUnit) {
		double result=value;
		if (fromUnit==toUnit){
			return Double.toString(value);
		}
		if (fromUnit=="cm"){
			result=convertCmTo(value,toUnit);
		}
		if (fromUnit=="m") {
			result=convertMtrTo(value,toUnit);
		}
		if (fromUnit=="km") {
			result=convertKmTo(value,toUnit);
		}
		if (fromUnit=="gm") {
			result=convertGmTo(value,toUnit);
		}
		if (fromUnit=="kg") {
			result=convertKgTo(value,toUnit);
		}
		if (fromUnit=="c") {
			result=convertCelTo(value,toUnit);
		}
		if (fromUnit=="f") {
			result=convertFhtTo(value,toUnit);
		}
		if (fromUnit=="k") {
			result=convertKTo(value,toUnit);
		}
		return Double.toString(result);
	}
	
	
	
	public static double convertCmTo(double value, String toUnit)
	   {
		if (toUnit=="m") {
			return  value / 100;
		}
		if (toUnit=="km") {
			return value/100000;
		}
		return value;
	   }
	public static double convertMtrTo(double value, String toUnit)
	   {
		if (toUnit=="cm") {
			return  value * 100;
		}
		if (toUnit=="km") {
			return value/1000;
		}
		return value;
	   }
	public static double convertKmTo(double value, String toUnit)
	   {
		if (toUnit=="cm") {
			return  value * 100000;
		}
		if (toUnit=="m") {
			return value * 1000;
		}
		return value;
	   }
	public static double convertKgTo(double value, String toUnit)
	   {
		if (toUnit=="gm") {
			return  value * 1000;
		}
		return value;
	   }
	public static double convertGmTo(double value, String toUnit)
	   {
		if (toUnit=="kg") {
			return  value / 1000;
		}
		return value;
	   }
	public static double convertCelTo(double value, String toUnit)
	   {
		if (toUnit=="f") {
			return  value + 32;
		}
		if (toUnit=="k") {
			return value + 273;
		}
		return value;
	   }
	public static double convertFhtTo(double value, String toUnit)
	   {
		if (toUnit=="c") {
			return  value - 32;
		}
		if (toUnit=="k") {
			return value + 241;
		}
		return value;
	   }
	public static double convertKTo(double value, String toUnit)
	   {
		if (toUnit=="f") {
			return  value - 241;
		}
		if (toUnit=="c") {
			return value - 273;
		}
		return value;
	   }
	public static String compute(double valueOne,String unitOne, double valueTwo,String unitTwo, String toUnit, String operation) {
		double valueATo = Double.parseDouble(convert(valueOne,unitOne,toUnit));
		double valueBTo = Double.parseDouble(convert(valueTwo,unitTwo,toUnit));
		double result=0;
		if (operation=="+") {
			result= valueATo + valueBTo;
		}
		if (operation=="-") {
			result= valueATo - valueBTo;
		}
		return Double.toString(result);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(compute(1,"km",200,"cm","cm","+"));
		System.out.println(convert(1,"km","cm"));
	}
}

