import java.util.*;
class Mymain{
	public static void main(String[] args) {
		int[] a = {22,11,44,33,14};
		int[] b = new int[a.length];
		b[0] = a[0];
		System.out.print(b[0]+" ");
		for(int i=1;i<b.length;i++){
			b[i] = b[i-1] + a[i];
			System.out.print(b[i]+" ");
		}
	}
}