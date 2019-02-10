import java.util.*;
class Mymain{
	public boolean i;
	public Mymain(){
		if(i==true)
			System.out.println("sunday");
		else
			System.out.println("mon");
		i = true;
	}
	{
		if(i==true)
			System.out.println("tue");
		else
			System.out.println("wed");
		i=true;
	}

	// int x = 10,y = 11;
	// public Mymain(){
	// 	System.out.println("inside const");
	// }
	// {
	// 	System.out.println("hello");
	// }
	// public void fun(){
	// 	x = 100;
	// 	y = 111;
	// }
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		// int n = myscan.nextInt();
		// int x = myscan.nextInt();//no such element exception
		// System.out.println(n+" "+x);
		//int a = 07; OCTAL
		//System.out.println(a);
		Mymain ob = new Mymain();
		if(ob.i == true)
			System.out.println("Thrusday");
		else
			System.out.println("friday");
		/*System.out.println("inside main");
		System.out.println(ob.x+" "+ob.y);
		ob.fun();
		System.out.println(ob.x+" "+ob.y);*/
		//String s = "melody";
		//ob.circularString(s);
	}

/*	public void circularString(String s){
		String s1 = s + s;
		String s2 ="";
		int max = 999;
		int count = 1999;
		String target = "ldym";
		String word = "";
/*		String start = target.charAt(0);
		String end = target.charAt(3);*/
/*		for(int i=0;i<s.length();i++){
			s2=s1.substring(i,i+6);
			System.out.println(s2);
			int index1 = target.indexOf(target.charAt(0));
			int index2 = target.indexOf(target.charAt(3));
			if(index2<index1){
				continue;
			}
			if((s2.contains('l'))&&(s2.contains('m'))){
				for(int j=index1;j<=index2;j++){
					word = word + s2.charAt(j);
					if(j==index2){
						for(int p=0;p<word.length();p++){
							if(word.contains(p)){
								count++;
								continue;
							}
							else{
							count = 1999;	
							break;
						}
						}
					}
				}
			}else{
				if(i==5)
					System.out.println("exit with -1");
			}
			if(count<max){
				max = count;
			}
			s2="";
		}
		System.out.println(max);
	}*/

}