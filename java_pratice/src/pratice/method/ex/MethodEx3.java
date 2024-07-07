package pratice.method.ex;

public class MethodEx3 {

	public static void main(String[] args) {
		// 입금(deposit)과 출금(withdraw)을 메서드로 만들어서 리펙토링해보자
		int balance = 10000;
		balance = deposit(balance, 2000);
		balance = deposit(balance, 2000);
		balance = withdraw(balance, 3000);
	}
	public static int deposit(int balance, int depositAmount) {
		balance+=depositAmount;
		System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
		return balance;
	}
	
	public static int withdraw(int balance, int withdrawAmount) {
		if(balance >= withdrawAmount) {
			balance-=withdrawAmount;
			System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
		}else {
			System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
		}
		return balance;
		
	}
	
	
}
