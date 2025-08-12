/* . Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20.
 Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...). */
 
 class Printer{
	 int num=1;
	 int max=20;
	
	 public synchronized void printOdd(){
		 while(num<=max){
				try{
					if(num%2==0){
						wait();
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
	         if(num<=max){
				System.out.print(num+" ");
				num++;
				notify();
			 }		
		 }
	 }
	 
	 public synchronized void printEven(){
		 while(num<=max){
			 try{
				 if(num%2==1){
					 wait();
				 }
			 }
			 catch(Exception e){
				 e.printStackTrace();
			 }
			 if(num<=max){
				 System.out.print(num+" ");
				 num++;
				 notify();
		 }
	 } 
	 }
 }
 
 class OddThread extends Thread{
	 Printer printer;
	 OddThread(Printer printer){ 
		 this.printer=printer;
	 }
	 public void run(){
		 printer.printOdd();
	 }
 }
 
 class EvenThread extends Thread{
	 Printer printer;
	 EvenThread(Printer printer){
		 this.printer=printer;
	 }
	 public void run(){
		 printer.printEven();
	 }
 }
 
public class Problem3{
	 public static void main(String[]args){
		Printer p=new Printer();
		EvenThread e=new EvenThread(p);
		OddThread o=new OddThread(p);
		e.start();
		o.start(); 
	 }
 }
		  
		  
	 
 
 
 
	 