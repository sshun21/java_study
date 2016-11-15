package mobile;

public class BankAccount {
	private int balance = 100;
	public int getBalance() {
		return balance;
	}
	public synchronized void withDraw(int amount) {
		balance -= amount; 
	}
	public void add(int money) { 
		balance += money;
		System.out.println("���� : " + balance + " " + money + " ��ŭ �Ա�\n"); 
		}
	public synchronized void delete(int money) {
		balance -= money; System.out.println("���� : " +balance + " " + money + " ��ŭ ���\n"); 
		}
}
