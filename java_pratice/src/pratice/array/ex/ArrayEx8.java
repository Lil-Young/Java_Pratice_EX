package pratice.array.ex;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {
		// 사용자로부터 4명의 학생의 국어, 수학, 영어 점수를 입력 받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
		// 2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생의 수를 입력하세요:");
		int T = scanner.nextInt();
		
		int[][] arr = new int[T][3];
		int[] total = new int[T];
		double[] avg = new double[T];
		String[] title = {"국어", "영어", "수학"};
		for(int i=0; i<T; i++) {
			System.out.println(i+1 + "번 학생의 성적을 입력하세요:");
			for(int j=0; j<3; j++) {
				System.out.print(title[j] + " 점수:");
				arr[i][j] = scanner.nextInt();
				total[i] += arr[i][j];
			}
		}
		
		for(int i=0; i<total.length; i++) {
			avg[i] = (double) total[i] / 3;
		}
		
		for(int i=0; i<total.length; i++) {
			System.out.println(i+1 + "번 학생의 총점: " + total[i] + ", 평균: " + avg[i]);
		}
	}

}
