import java.io.*;
class Abc
{
public static void show() //throws Exception
{
System.out.println("inside Abc show(overriden_mtd)");
}

public void display(){
show();
System.out.println("inside Dispaly method");	
}

}

class Pqr extends Abc
{
public static void show() //throws IOException
{
System.out.println("inside Pqr show(overriding_mtd)");
}

}

class Mymain
{
public static void main(String[] chirag)
{
Pqr ob = new Pqr();
ob.show();
/*Abc ob1 = new Abc();
ob1.show();
ob1 = ob;
ob.show();*/
/*Abc ob1 = new Pqr();
ob1.show();
ob1.display();*/
}
}