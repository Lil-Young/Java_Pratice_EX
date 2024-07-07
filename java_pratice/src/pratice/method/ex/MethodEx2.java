package pratice.method.ex;

public class MethodEx2 {

	public static void main(String[] args) {
		print(3, "Hello world!");
		print(5, "Hello java");
		print(7, "Hello, python");
	}
	public static void print(int T, String message) {
		for(int i=0; i<T; i++) {
			System.out.println(message);
		}
	}
}
