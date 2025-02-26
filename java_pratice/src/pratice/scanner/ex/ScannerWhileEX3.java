package pratice.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEX3 {

	public static void main(String[] args) {
		// 사용자로부터 여러 개의 숫자를 입력받고, 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요. 사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정합니다.
		// 모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum과 평균 average를 출력하세요. 평균은 소수점 아래까지 계산해야 합니다.
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int cnt = 0;
		int num = 0;
		System.out.println("숫자를 입력하세요: ");
		while((num = scanner.nextInt()) != -1) {
			cnt++;
			total += num;
		}
		System.out.println("입력한 숫자들의 합계: " + total);
		double avg = (double) total / cnt;
		System.out.println("입력한 숫자들의 평균: " + avg);
		
	}

}
