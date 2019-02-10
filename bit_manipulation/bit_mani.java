import java.util.*;
class Mymain{
	public static void main(String[] args) {
		int n = 2;
		String str = "";
		int mod;
		while(n!=0){
			mod = n%2;
			System.out.print(mod);
			str = str + (int)mod;
			n=n/2;
		} 
		String s = "";
		for(int i=str.length()-1;i>=0;i--){
			s = s + str.charAt(i);
		}
		System.out.println("\n"+s);

	}
}