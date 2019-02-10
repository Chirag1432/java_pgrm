import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		String s1 = "aabcdffsaasbcfsd";

		for(int i=0;i<s1.length();i++){
			if(hm.containsKey(s1.charAt(i)))
				hm.put(s1.charAt(i), hm.get(s1.charAt(i))+1);
			else
				hm.put(s1.charAt(i), 1);
		}

		for(Map.Entry entry : hm.entrySet())
			System.out.println(entry.getKey()+"->"+entry.getValue());

	}
}