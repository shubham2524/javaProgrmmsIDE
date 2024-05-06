package oopConceptDurgaSir;

import java.util.Scanner;

//hidding of data,so that outside person can't access our internal data directly
//,after validation outside person can access our internal data .
//ex-after providing valid username and password we can login to our gmail account
public class dataHiding {
	static String username1 = "shubham";
	static int password1 = 6789;
	private int AccountBalance = 567890;

	public int getAccountBalance() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter username ");
		String username = sc.nextLine();
		if (username.equals(username1)) {
			System.out.println("enter password");
			int password = sc.nextInt();
			if (password == password1) {
				//System.out.println(AccountBalance);

			} else {
				System.err.println("invalid password");
			}

		} else {
			System.err.println("invalid username");
		}

		return AccountBalance;
	}

}
