package pratice.array.ex;
import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
		int[] arr = new int[5];
		System.out.println("5개의 정수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
//			int n = scanner.nextInt();
//			arr[i] = n;
			arr[i] = scanner.nextInt();
		}
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]);
			if (j < arr.length - 1) {
				System.out.print(", ");
			}
		}
	}

}
