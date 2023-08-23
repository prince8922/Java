/*Immutable Object and Class
class name :final
member var.:final  can't change values in class
parameterised Constructer is used*/
 
 final class Demo
 {
	 final int a;
	 final String m;
	 Demo(int a,String m)  //perameter rise Constructer
	 {
		 this.a=a;
		 this.m=m;
	 }
	 void show()
	 {
		 System.out.println("a="+a);
		 System.out.println("m="+m);
	 }
 }
 class ImmutableDemo
 {
	 public static void main(String args[])
	 {
		 Demo d1=new Demo(15,"prince");
		 d1.show();
		 //d1.a=15;  //in immutable not change variable of final class of all are final variable
	 }
 }