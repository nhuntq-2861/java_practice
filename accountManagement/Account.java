package accountManagement;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public void credit(int amount) {
		if (amount < 0) {
			System.out.println("Invalid params");
			return;
	}
		this.balance += amount;
			System.out.println("Credit successfully");
	}
	public void debit(int amount) {
		if (amount < 0) {
			System.out.println("Invalid params");
			return;
		}

		if (this.balance < amount) {
			System.out.println("Debit failed");
			return;
		}

		this.balance -= amount;
			System.out.println("Credit successfully");
	}
	public void transferTo(int amount, Account accountTo) {
		if (amount < 0) {
			System.out.println("Invalid params");
			return;
		}

		if (this.balance < amount) {
			System.out.println("Transfer failed");
			return;
		}

		this.balance -= amount;
		accountTo.balance += amount;
			System.out.println("Transfer successfully");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}