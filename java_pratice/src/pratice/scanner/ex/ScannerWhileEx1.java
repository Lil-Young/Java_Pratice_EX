package pratice.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

	public static void main(String[] args) {
		// 사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요. 사용자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
			String name = scanner.nextLine();
			if(name.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("나이를 입력하세요: ");
			int age = scanner.nextInt(); // 10을 입력하면, "10\n"로 입력되는데 nextInt는 개행은 냅두고 10만 가져온다.
			scanner.nextLine(); // nextInt를 사용한 후, 남아있는 개행문자를 제거하기 위함(남아있는 \n을 읽어줌)
			System.out.println("입력한 이름: " + name + ", 나이: " + age);
		}
	}

}
