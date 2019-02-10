import java.util.*;
class Mymain{
	public static void main(String[] args) {
		String s1 = "hello how@ a@re you hello !";
		String s2 = "hello";
		String a[] = s1.split("o");

		System.out.println(a);
		for(String x:a)
			System.out.print(x);

	}
}