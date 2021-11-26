package dataTypes;

public class IntType {

	int x1 = 2147483647;
//	int x2 = 2147483648; //Max is 2147483647, The literal 2147483648 of type int is out of range
	int x3 = -2147483647;
	int x4 = -2147483648;
//	int x5 = -2147483649; //Max is -2147483648, The literal 2147483649 of type int is out of range 
//	int x6 = 2147483647l; //Can't convert from long to int, The literal 2147483649 of type int is out of range 
}
