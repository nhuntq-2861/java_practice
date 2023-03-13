package accountManagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account("001", "Nguyen A", 100000);
		Account account2 = new Account("002", "Nguyen B", 20000);
		
		System.out.println("Balance of account1 is: " + account1.getBalance());
		System.out.println("Balance of account2 is: " + account2.getBalance());
		System.out.println("Add 2.000 to account1");
		account1.credit(2000);
		
		System.out.println("Balance of account1 after adding money: " + account1.getBalance());
		System.out.println("Debit 10.000 to account1");
		account1.debit(10000);
		
		System.out.println("Balance of account1 after debiting money: " + account1.getBalance());
		System.out.println("Add 10.000 to account2:");
		account2.credit(10000);
		
		System.out.println("Balance of account2 after adding money: " + account2.getBalance());
		System.out.println("account2 transfer to account1 100");
		account2.transferTo(100,account1);
		
		System.out.println("Balance of account1 after transfer money: " + account1.getBalance());
		System.out.println("Balance of account2 after transfer money: " + account2.getBalance());
	}

}
