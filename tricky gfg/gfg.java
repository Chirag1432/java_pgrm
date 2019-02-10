import java.io.*;

class First {
	private int x;
	public First(){
		this.x = 5;
	}
	public First(int x){
		this.x = x;
	}
	public static int CBSE (int x) {
		if (x < 100) 
		{   
		    System.out.println(x);
		    x = CBSE (x + 10);
		    System.out.println(x);
		}
		return (x-1);
	}
	
	public static void main (String[] args) {
		System.out.println(First.CBSE(60));
		First ob = new First();
	}
}

//ans 95