/* Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items.. */

class Products{
	int max=5;
	int buffer=0; 
	public synchronized void increment(){
		try{
			while(buffer>=max){
				wait();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		buffer++;
		System.out.println("Item : "+buffer+" added by producer ");
		notify();
	}
	public synchronized void decrement(){
			try{
			while(buffer<=0){
				wait();
			}  
		}
		catch(Exception e){ 
			e.printStackTrace();
		}
		System.out.println("Item : "+buffer+" consumed by consumer ");
		buffer--;
		notify();
	}
}

class Producer extends Thread{
	Products p;
	public Producer(Products p){
		this.p=p;
	}
	public void run(){
		for(int i=0;i<5;i++){
		p.increment();
		}
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

class Consumer extends Thread{
	Products p;
	public Consumer(Products p){
		this.p=p;
	}
	public void run(){
		for(int i=0;i<5;i++){
		p.decrement();
		} 
		try{
			Thread.sleep(5000); 
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

public class Problem5{
	public static void main(String[]args){
		Products p=new Products();
		Producer pr=new Producer(p);
		Consumer c=new Consumer(p);
		pr.start();
		c.start();
	}
}



	
			

