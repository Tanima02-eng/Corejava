package app.demo;

/*Program 6-Write  a  program  to  assign  the  current  thread  to  t1.  Change  the  name  of  the  thread  to  MyThread.  Display  the  changed  name  of  the  thread.  

   Also  it  should  display  the  current  time.  Put  the  thread  to  sleep  for  10  seconds  and  

   display  the  time  again.
   
   */


	import java.io.*;

	class ThreadName extends Thread  

	{ 

	    ThreadName(String name) 

	    { 
	    	super(name); 

	    } 

	} 

	public class Threaddisplay 

	{ 

	    public static void main (String[] args)  

	    { 

	        ThreadName t1 = new ThreadName("Thread1");  

	        System.out.println("Thread 1: " + t1.getName()); 

	        t1.start(); 

	        long start = System.currentTimeMillis();

	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        System.out.println("current time in ms = "+start);

	        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));

	        

	     }

	        

	    }

