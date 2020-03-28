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

