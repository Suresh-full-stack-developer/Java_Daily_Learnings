package MethodOverLoading;

public class MethodVarArgs {

	static void varargs(int... num) {
		System.out.println("We can pass \u001b[95m multiple values \u001b[0m in method overloading by using \u001b[92m VarArgs \u001b[0m");
	}

	public static void main(String[] args) {
		varargs(1, 2, 3); // Directly calling
		int arr[] = { 1, 2, 3, 4, 5, 6, };
		varargs(arr);
		
		MethodVarArgs m=new MethodVarArgs();  //With the help of object reference
		 m.varargs();


		MethodVarArgs.varargs(1, 2, 3, 4, 5); // Class name as reference
	}

}
