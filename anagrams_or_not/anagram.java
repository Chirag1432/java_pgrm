import java.util.*;
class Anagrams{
	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
	}
	static void isAnagram(String str1, String str2){
		String s1 = str1.replaceAll("\\s","");
		String s2 = str1.replaceAll("\\s","");
		boolean status = true;
		if(s1.length()!=s2.length()){
			status = false;
		}else{
			char[] a = s1.toLowerCase().toCharArray();
			char[] b = s2.toLowerCase().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			status = Arrays.equals(a,b);
		}
		if(status)
			System.out.println(str1+" "+str2+"-> Angrams");
		else
			System.out.println(str1+" "+str2+"-> Not Angrams");

	}
}