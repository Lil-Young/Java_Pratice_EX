package pratice.array.ex;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자. 실행 결과 예시를 참고하자.
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력받을 숫자의 개수를 입력하세요: ");
		int T = scanner.nextInt();
		int[] arr = new int[T];
		
		System.out.println(T + "개의 정수를 입력하세요:");
		for(int i=0; i<T; i++) {
			arr[i] = scanner.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<T; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("가장 작은 정수: " + min);
		System.out.println("가장 작은 정수: " + max);
		
	}

}
