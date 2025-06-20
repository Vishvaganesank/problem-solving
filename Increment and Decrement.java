package variable;

public class Var {
	public static void main(String[] args) {
		int a=5;
		int b;
		System.out.println(a);
		b=a++;
		System.out.println(a);
		System.out.println(b);
		b=++a;
		System.out.println(a);
		System.out.println(b);
		b=a--;
		System.out.println(a);
		System.out.println(b);
		b=--a;
		System.out.println(a);
		System.out.println(b);
}
}
