package MethodOverLoading;

public class MethodVarArgsRules {
	
	// Method VarArgs should be use only one  in the method
	
	static void varargs(int...num) {
		System.out.println("Hii\u001b[92m Java\u001b[0m Developer");
	}
	
	// Method VarArgs must be last in the parameters
	
//	static void varargs(int...num,String s) {  // if its first means show error
//		System.out.println("Hii \u001b[92m Java \\u001b[0m Developer");
//	}
	
	
	static void varargs(String s,int...num) {
		System.out.println("Hii\u001b[95m Java\u001b[0m Developer");
	}
	
	static void varargs(char ch,String s,int...num) {
		System.out.println("Hii\u001b[94m Java\u001b[0m Developer");
	}
	
	public static void main(String[] args) {
		varargs('A',"Suresh",5); //directly calling
		System.out.println("------------------------");
		
		int num=143;
		String s="Suresh";
		char ch='B';
		// Object reference
		MethodVarArgsRules vr=new MethodVarArgsRules();
		vr.varargs(s,num );
		
		System.out.println("------------------------");
		
		// VarArgs can accept the 0 parameters as well as multiple parameters
		
		varargs(); //zero parameters
		
		System.out.println("------------------------");
		
		varargs("Suresh",143); //multiple parameters
		
	}

}
