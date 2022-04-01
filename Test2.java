abstract class Test1 
{ 
	abstract int m1(int a,int b); 
	abstract boolean m2(char ch); 
} 


class Test2 extends Test1 
{
	int m1(int a,int b) 
{ 
	System.out.println("m1 method"); 
	System.out.println(a); 
	System.out.println(b); 
	return 100; 
} 
	boolean m2(char ch) 
{ 
	System.out.println("m2 method"); 
	System.out.println(ch); 
	return true; 
} 
public static void main(String[] args) 
{ 
	Test2 t=new Test2(); 
	int a=t.m1(100,200); 
	System.out.println(a); 
	boolean b=t.m2('c'); 
	System.out.println(b); 
} 
};