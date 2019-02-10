// author : z!dd!
import java.util.*;
class Mymain{
	public static void main(String[] args) {
		String text = "abxabcabcaby";
		String pattern = "abcabyd";
		//Step 1 To make array of pattern 
		//Array shows length of Suffix which is same as Prefix
		int[] b = make_array(pattern);
		for(int x : b)
			System.out.print(x+" "); 
		
		//boolean c = kmp(text, pattern, b);
		System.out.println(kmp(text, pattern, b));
	}

	public static int[] make_array(String s){
		int[] a = new int[s.length()];
		a[0] = 0;
		int j = 0;
		//first time in life no increment condition in for loop
		for(int i=1;i<s.length();){
			//matches
			if(s.charAt(i) == s.charAt(j)){
				a[i] = 1 + j;
				i++;
				j++;
			}else{//mismatches
				if(j!=0)
					j = a[j-1];
				else{
					a[i] = 0;
					i++;
				}	 
			}
		}
		return a;		
	}

	public static boolean kmp(String t, String p, int[] a){

		int i=0;
		int j=0;
		while((i<t.length())&&(j<p.length())){
			if(t.charAt(i)==p.charAt(j)){
				i++;
				j++;
			}else{
				if(j!=0)
					j=a[j-1];
				else{
					i++;
				}
			}
		}
		if(j==p.length())
			return true;
	return false;
	}
}