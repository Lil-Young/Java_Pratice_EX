package pratice.method.ex;

import java.util.Scanner;

public class MethodEx4 {

	public static void main(String[] args) {
		/* ------------------------------------
		 * 1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료
		 * ------------------------------------
		 * 선택: 1
		 * 입금액을 입력하세요: 10000
		 * 10000원을 입금하였습니다. 현재 잔액: 10000원
		 * ------------------------------------
		 * 1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료
		 * ------------------------------------
		 * 선택: 2
		 * 출금액을 입력하세요: 8000
		 * 8000원을 출금하였습니다. 현재 잔액: 2000원
		 * ------------------------------------
		 * 1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료
		 * ------------------------------------
		 * 선택: 3
		 * 현재 잔액: 2000원
		 * ------------------------------------
		 * 1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료
		 * ------------------------------------
		 * 선택: 4
		 * 시스템을 종료합니다.
		 * ** 출금할 돈이 안되는 경우 "000원을 출금하려 했으나 잔액이 부족합니다." **
		 */
		int balance = 0;
		int menu;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
			System.out.print("------------------------------------\n선택:"); 
			menu = scanner.nextInt();
			scanner.nextLine();
			if(menu==1) {
				System.out.print("입금액을 입력하세요: ");
				int amount = scanner.nextInt();
				balance = deposit(balance, amount);
			}
			else if(menu==2) {
				System.out.print("출금액을 입력하세요: ");
				int amount = scanner.nextInt();
				balance = withdraw(balance, amount);
			}
			else if(menu==3) {
				show(balance);
			}
			else if(menu==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}
	public static int deposit(int balance, int amount) {
		balance+=amount;
		System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
		return balance;
	}
	public static int withdraw(int balance, int amount) {
		if(amount > balance) {
			System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
		}
		else {
			balance-=amount;
			System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
		}
		return balance;
	}
	public static void show(int balance) {
		System.out.println("현재 잔액: " + balance + "원");
	}
	

}
