package mobile;

public class testMain {
	public static BankAccount account = new BankAccount();
	public static void main(String[] args) {
		
		Thread depositMan = new Thread() {
			public void run(){
				for(int i=0; i<10; i++)
				{
					account.add(10);
					try {
						Thread.sleep((int)(Math.random()*1000));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.toString();
					}
				}
			}
		};
		
		Thread withdrawMan = new Thread() { 
			public void run(){
				for(int i=0; i<10; i++)
				{
					account.delete(10);	
					try {
						Thread.sleep((int)(Math.random()*1000));
						if (account.getBalance()<0)
							throw new Exception();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.toString();
					}
				}
			}
		}; 
		depositMan.start(); 
		withdrawMan.start();
	}

}
