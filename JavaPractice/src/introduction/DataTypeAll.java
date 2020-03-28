package introduction;

import java.util.Date;

// https://howtodoinjava.com/java/basics/primitive-data-types-in-java/
public class DataTypeAll {

	public static void main(String[] args) {
		// byte(127) -> short(32_768)- >int(2_147_483_647) ->
		// Long(9_223_372_036_854_775_807)

		// int numberOfInfectedCornova = 2147483649; // out of range
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
		int age = 30;
		long MyAge = age; // Implicit casting

		long numberOfCars = 23;
		int availbleCars = (int) numberOfCars; // explicit casting - big to small

		// 897498778409- any number java consider it as Integer
		// 8974957045.89 - any decimal number java consider it as double
		
		long numberOfCarsManufactured = 9_223_372_036_854_775_807L; // Out of int range require L
		long numberOfCarsManufacturedToday = 9_223; // With out L
		int availbleCarsForSale = (int) numberOfCarsManufactured; // explicit casting - big to small
		System.out.println("availbleCarsForSale :" + availbleCarsForSale);

		byte numberOfComputer = 12;
		int numberOfMyComputer = numberOfComputer;

		int numberOfPeople = 21;
		byte numberOfTrainer = (byte) numberOfPeople;// explicit casting - big to small

	}

}
