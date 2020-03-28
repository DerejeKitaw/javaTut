package introduction;

public class DataTypeShort {

	public static void main(String[] args) {
		// Short
		short age = 23;
		System.out.println(age); // 23
		System.out.println(Short.MAX_VALUE); // 32_767
		System.out.println(Short.MIN_VALUE); // --32_768

		// Short myAge = 32_768; // can not convert short to int

		int availbleCarsINUSA = 23_498_765;
		short myCar = (short) availbleCarsINUSA; // (when we cast `int` value should be with in `short` range)
		System.out.println("myCar :" + myCar); // return myCar :-28659 - wrong

		int availbleCars = 126;
		byte myNewCar = (byte) availbleCars;
		System.out.println("myNewCar :" + myNewCar); // return myNewCar :126
	}

}
