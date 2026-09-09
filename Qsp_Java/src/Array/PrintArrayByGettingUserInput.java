package Array;

import java.util.Scanner;

public class PrintArrayByGettingUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name[] = new String[5];
		System.out.println("Enter the name1:");
		name[0] = sc.nextLine();

		System.out.println("Enter the name2:");
		name[1] = sc.nextLine();

		System.out.println("Enter the name3:");
		name[2] = sc.nextLine();

		System.out.println("Enter the name4:");
		name[3] = sc.nextLine();

		System.out.println("Enter the name5:");
		name[4] = sc.nextLine();

		System.out.println("--------------------------");
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);

	}

}
