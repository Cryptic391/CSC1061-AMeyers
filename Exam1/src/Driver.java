
public class Driver {

	public static void main(String[] args) {
		CheckingAccount checking = new CheckingAccount(1111, 2000, 200);
		checking.setAnnualInterestRate(.5);
		checking.withdraw(2100);
		checking.deposit(3000);
		
		System.out.println(checking);
		
		SavingsAccount saving = new SavingsAccount(1100, 500, 200);
		saving.setAnnualInterestRate(1.0);
		saving.withdraw(300);
		
		System.out.println(saving);
		
		CheckingAccount checking2 = new CheckingAccount("George" ,2222, 1000, 200);
		checking2.setAnnualInterestRate(1.5);
		checking2.deposit(30);
		checking2.deposit(40);
		checking2.deposit(50);
		checking2.withdraw(5);
		checking2.withdraw(4);
		checking2.withdraw(2);
		
		System.out.println(checking2);

	}

}
