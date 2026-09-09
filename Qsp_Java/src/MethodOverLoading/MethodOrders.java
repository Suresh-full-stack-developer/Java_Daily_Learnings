package MethodOverLoading;

public class MethodOrders {
	static void orders(int num,String s) {
		System.out.println("Welcome to \u001b[90m Java \u001b[0m Ocean");
	}
	static void orders(String s,int num) {
		System.out.println("Welcome to \u001b[91m Java \u001b[0m Ocean");
	}
	static void orders(int num,String s,char ch) {
		System.out.println("Welcome to \u001b[96m Java \u001b[0m Ocean");
	}
	static void orders(int num,char ch,String s) {
		System.out.println("Welcome to \u001b[92m Java \u001b[0m Ocean");
	}
	static void orders(char ch,String s,int num) {
		System.out.println("Welcome to \u001b[97m Java \u001b[0m Ocean");
	}
	
	
	public static void main(String[] args) {
		
		orders(4,"Suresh",'A');
		orders(2,'A',"Suresh");
		orders(5,"Suresh");
		orders("Suresh",5);
		
	}

}
