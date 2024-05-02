 class my1 implements Runnable 
{ 
 public void run() 
 { 
 try{ 
 
 System.out.println("Thread:"+Th read.currentThread().getId()); 
 	Thread.sleep(1000); 
   } 
 catch(Exception e) 
 { 
 	System.out.println(e); 
 } 
 } 
} 
class Vaishnavipatil
{ 
 public static void main(String args[]) 
 { 
 int n=10; 
  	 	for(int i=1;i<10;i++) 
 { 
 	Thread t1=new 
Thread(new my1());  	t1.start(); 
 
 System.out.println(t1.getState()); 
 } 
 } 
} 
