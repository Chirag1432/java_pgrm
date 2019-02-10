import java.util.*;
//compile time error when we assign value to final in other than declaration statement 
class Mymain{
	public static void main(String[] args) {
		System.out.println(fun()); //Compile Time Error Void Type not allowed in SOP
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		System.out.println(s1.charAt(0)+" "+s1.charAt(2));
        if(s1.charAt(0)=='E')
        	System.out.println("YES");
   	}
	public static int fun(){
		int x = 0;
		//System.out.println("Hi");
		return ++x;
	}
}