// variables

class Variables{
	static int staticVar=10;
	int instanceVar=98;
	final int finalVar=25;
	
	void displayVariables(){
		int localVar=8723;
		System.out.println("The static Variable was :" + staticVar);
		System.out.println("The Instance Variable was :" + instanceVar);
		System.out.println("The Final Variable was :" + finalVar);
		System.out.println("The local Variable was :" + localVar);

        if(true){
              int blockVar=2124;
              System.out.println("The Block Variable was :" + blockVar);
        }
    }		
		
		
}
public class Problem1{

public static void main(String[]args){
      Variables var=new Variables();
	  Variables var2=new Variables();
	  var2.instanceVar=23;
	  var.displayVariables();
	  var2.displayVariables();
}
}
