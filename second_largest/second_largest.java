import java.util.*;
class Mymain{
	public static void main(String[] args) {
		int[] a = {0,0,2,3};
		int max, second_max;
		if(a[0]>a[1]){
			max = a[0];
			second_max = a[1];
		}else{
			second_max = a[0];
			max = a[1];
		}
		int temp;
		for(int i=2;i<a.length;i++){
			if(a[i]>max){
				temp = a[i];
				second_max = max;
				max = temp;
			}else if(second_max<a[i]){
				second_max = a[i];
			}
		}

		System.out.println("Second Largest Number:"+second_max);

	}
}