
public class Hello {
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Kese hai aap log");
		int a = 10;
		int b = 20;
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0)
				System.out.println(i);
		}
		System.out.println("Using Function");
		int ans = multiply(21, 9);
		System.out.println(ans);
		
		System.out.println("Fibonacci Series");
		int no1 = 0, no2 = 1, res;
		for(int i = 0; i < 10; i++) {
			res = no1 + no2;
			System.out.print(res + " ");
			no1 = no2;
			no2 = res;
		}
	}
	
	

}
