package pratice.array.ex;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 학생 5명의 점수의 합과 평균을 구하라
		int[] students = new int[] {90, 80, 70, 60, 50};
		int total = 0;
		for (int student:students)
			total += student;

		double avg = (double) total/students.length;
		System.out.println("점수 총합:" + total);
		System.out.println("점수 평균:" + avg);
	}

}
