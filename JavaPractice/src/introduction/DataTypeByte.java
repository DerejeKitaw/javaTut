package introduction;

import java.util.Date;

// https://howtodoinjava.com/java/basics/primitive-data-types-in-java/
public class DataTypeByte {

	public static void main(String[] args) {
		// byte
		byte age = 20;
		System.out.println(Byte.MAX_VALUE); // 127
		System.out.println(Byte.MIN_VALUE); // -127
		System.out.println(age);

		byte numberOfCars = 23;
		int availbleCars = numberOfCars;

		// int availbleCarsINUSA = 234_98765;
		// byte myCar = (byte) availbleCarsINUSA;
		// System.out.println(myCar);
		
		int availbleCarsINUSA = 126;
		byte myCar = (byte) availbleCarsINUSA;
		System.out.println(myCar);
	}

}
