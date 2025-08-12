/* 2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks. */

class TaskRunner implements Runnable{
	public void run(){
		System.out.println("Task Runner 1 ");
		try{
			for(int i=1;i<=10;i++){ 
				System.out.println("Message on Thread 1 : "+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}	
}
class TaskRunner2 implements Runnable{
	public void run(){
		System.out.println("Task Runner 2");
		try{
			for(int i=1;i<=10;i++){ 
				System.out.println("Message on Thread 2 : "+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}	
}


public class Problem2{
	public static void main(String[]args){
		TaskRunner t1=new TaskRunner();
		TaskRunner2 t2=new TaskRunner2();
		Thread thread=new Thread(t1);
		Thread thread2=new Thread(t2);
		thread.start();
		thread2.start(); 
		
	}
}

	