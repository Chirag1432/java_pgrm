import java.util.*;
class Mymain{
	public static void main(String[] args) {
		String text = "abcbcglx";
		String pattern = "bcgdl";
		Mymain ob = new Mymain();//manipulated
		System.out.println(Mymain.isPatternPresent(text,pattern));
	}
	public static boolean isPatternPresent(String text, String pattern){
		if(text.contains(pattern))
			return true;
		else
			return false;
	}
}