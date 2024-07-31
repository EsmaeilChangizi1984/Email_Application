package Email;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String alternateEmail;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength=10;

	public email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+this.password);
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.department+".com";
		
	}

	private String setDepartment() {
		System.out.print("Enter Department Number : \n1 for Sales\n2 for Development\n3 for Accounting\0 for none. ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			return "Sales";
		case 2:
			return "Development";
		case 3:
			return "Accounting";
		default:
			return "";
		}
	}
	/////////////

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!$&";
		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	/////////////
	
	public void setPasswordCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	///////////
	
	public void setAlternateEmail(String email) {
		this.alternateEmail = email;
	}
	//////////
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getPassswordCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getchengePassword() {return password;}
	
	public String userInfo() {
		return "Name "+firstName+" "+lastName+"\nEmail: "+email+"\nMail Capacity :"+mailboxCapacity;
	}
	
	

}
