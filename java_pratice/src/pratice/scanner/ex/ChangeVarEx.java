package pratice.scanner.ex;

public class ChangeVarEx {

	public static void main(String[] args) {
		/* 변수 a=10이 들어있고, b=20이 들어있다.
		 *  변수 a의 값과 변수 b의 값을 서로 바꾸어라.
		 *  다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드를 작성하면 된다.*/
		
		int a = 10;
		int b = 20;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
