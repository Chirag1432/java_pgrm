import java.util.*;
class Mymain{
	public static void main(String[] args) {
		String s1 = "chirag, anuj, raama, chetan";
		
		String s[] = s1.split(",");
		for(String str:s)
			System.out.println(str);
	}
}