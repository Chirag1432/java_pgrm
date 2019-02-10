import java.util.*;
//here static not allowed Compile Time error
/*static */class Mymain{
	public static void main(String args[])throws Exception {
		System.out.println("this is erronous");
		try{
			throw new Error("this is user defined fatal error");
		}
		catch(Error e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("i will always execute");
		}

		Scanner myscan = new Scanner(System.in);
		System.out.println("hii");
		System.out.println(System.in.available());//print 0
		myscan.close();
		System.out.println("hello");
		System.out.println(System.in.available());//run time error because of line number 19

	}
}