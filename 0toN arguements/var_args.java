import java.util.*;
class Mymain{
	public static void main(String[] args) {
		System.out.println("Hello");
		var_args(2,3,4,5,'C');
	}
	public static void var_args(Object... X){
		for(Object a : X)
			System.out.println(a);
	} 
}