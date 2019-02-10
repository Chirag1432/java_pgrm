import java.util.*;
class Mymain{
	public static void main(String[] args) {
		String s1 = "hello hello hii i i am am chirag chirag gup gupta";
		String s2 = "chirag";
		/*String s3 = "Chirag";
		if(s2.equals(s3)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}*/
		//System.out.println("hii");
		int res = Frequency_of_words(s1,s2);
		System.out.println(res);
	}
	public static int Frequency_of_words(String s1, String s2){
		String word = "";
		s1 = s1 + " ";//last of string
		int count = 0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=' '){

				word = word + s1.charAt(i);
			}
			else{
				System.out.println(word+" "+s2);		
				if(word.equals(s2))
					count++;
				word= "";
			}
		//System.out.println(count);		 
		}
		return count;
	}
}