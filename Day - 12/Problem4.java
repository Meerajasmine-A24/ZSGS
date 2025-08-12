// Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times. 
// Use synchronization to avoid race conditions and display the final value.

class Counter{
	private int count=0;
	
	public  synchronized void increamentCount(){
		count++;
	}
	
	public int getCount(){
		return count;
	}
}

class Increament extends Thread{
	Counter c;
	public Increament(Counter c){
		this.c=c;
	}
	public void run(){
		for(int i=0;i<1000;i++){
			c.increamentCount();
		}
	}
}

public class Problem4{
	public static void main(String[]args){
		Counter c=new Counter();
		Increament i1=new Increament(c);
		Increament i2=new Increament(c);
		Increament i3=new Increament(c);
		i1.start();
		i2.start();
		i3.start();
		try{
			i1.join();
			i2.join();
			i3.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Counter : "+c.getCount());
	}
}

		
		

		
