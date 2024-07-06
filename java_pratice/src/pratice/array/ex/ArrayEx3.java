package pratice.array.ex;
import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 배열을 역순으로 출력하라.
		int[] arr = new int[5];
		System.out.println("5개의 정수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int j=arr.length-1; j>=0; j--) {
			System.out.print(arr[j]);
			if (j > 0) {
				System.out.print(", ");
			}
		}
	}

}
