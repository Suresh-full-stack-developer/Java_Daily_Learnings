package Encapsulation;

public class BankExample {

	long accountNo;
	String name;
	int age;
	long cNo;
	int amount;
	String userName = "Demo";
	String Pass = "12345";

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
		int count = 0;
		while (accountNo > 0) {
			long digit = accountNo % 10;
			count++;
			accountNo /= 10;
		}

		if (count >= 11) {
			System.out.println("Your account is verified");
		} else {
			System.out.println("Invalid accountNo");
		}
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setName(String name) {
		this.name = name;
		if (name.length() >= 4) {
			System.out.println("Name Set Successfully");
		} else {
			System.out.println("Please Enter the Proper Name");
		}
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
		if (age > 0 && age <= 100) {
			System.out.println("Age Set Successfully");
		} else {
			System.out.println("Enter the proper age");
		}
	}

	public int getAge() {
		return age;
	}

	public void setcNo(long cNo) {
		long temp = cNo;
		int count = 0;
		while (cNo > 9) {
			long digit = cNo % 10;
			cNo /= 10;
			count++;
		}
		count += 1;

		if (count == 10 && cNo == 6 || cNo == 7 || cNo == 8 || cNo == 9) {
			this.cNo = temp;
			System.out.println("Contact Number Set Successfully");
		} else {
			System.out.println("Please enter the valid Contact Number");
		}

	}

	public long getcNo() {
		return cNo;
	}

	public void setAmount(int amount, String name, String Password) {
		if (userName.equals(name) && Pass.equals(Password))
			if (amount > 0) {
				this.amount += amount;
				System.out.println("Amount add successfully");
			} else {
				System.out.println("You are not the authorized person");
			}
	}

	public int getAmount() {
		return amount;
	}

	public static void main(String[] args) {

	}

}
