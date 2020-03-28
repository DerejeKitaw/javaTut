### Data Types

> 1 Primitive type
> 2 Reference type

## Primitive Data Type

> Byte

```java
byte age=20;
System.out.println(Byte.MAX_VALUE); //127
System.out.println(Byte.MIN_VALUE); //-127
System.out.println(age);
```

> Can not change integer to byte

```java
int availbleCarsINUSA = 234_98765;
byte myCar =availbleCarsINUSA;
```

> doesn't give error but different(wrong) out put

```java
int availbleCarsINUSA = 234_98765;
byte myCar = (byte) availbleCarsINUSA; // (when we cast `int` value should be with in `long` range)
System.out.println(myCar); // return 13 - wrong
```

>

```java
int availbleCarsINUSA = 126;
byte myCar = (byte) availbleCarsINUSA;
System.out.println(myCar); // return 126
```

> short

```java
// Short
short age = 23;
System.out.println(age); // 23
System.out.println(Short.MAX_VALUE); // 32_767
System.out.println(Short.MIN_VALUE); // --32_768

// Short myAge = 32_768; // can not convert short to int

int availbleCarsINUSA = 23_498_765;
short myCar = (short) availbleCarsINUSA; // (when we explicit cast `int` value should be with in `short` range)
System.out.println("myCar :" + myCar); // return myCar :-28659 - wrong

int availbleCars = 126;
byte myNewCar = (byte) availbleCars;
System.out.println("myNewCar :" + myNewCar); // return myNewCar :126

```
