package pratice.method.ex;

public class MethodEx1 {

	public static void main(String[] args) {
		double avg = sum(1, 2, 3);
		System.out.println("평균값: " + avg);
		
		avg = sum(15, 25, 35);
		System.out.println("평균값: " + avg);
		
	}
	
	public static double sum(int a, int b, int c) {
		int sum = a+b+c;
		return sum / 3.0;
	}
	
}
