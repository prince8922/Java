
class Thread1 extends Thread 
{ 
 public void run() 
 { try{ 
 for(int i=0;i<10;i++) 
 { 
 System.out.println("hello"); 
 Thread.sleep(1000); 
 } 
 } 
 catch(InterruptedException e) 
 { 
 System.out.println("InterruptedException"); 
 } 
 }  
 public static void main(String args[]) 
 { 
 try{ 
 Thread1 t1 =new Thread1(); 
 Thread1 t2 =new Thread1(); 
 Thread1 t3 =new Thread1(); 
 t1.start(); 
 t2.start(); 
 t3.start(); 
 t1.join();  //one by one
 t2.join(); 
 t3.join(); 
 } 
 catch(Exception e){} 
 System.out.println("Good Bye..."); 
 } 
} 