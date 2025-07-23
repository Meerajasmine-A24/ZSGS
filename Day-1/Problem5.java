class ExecutionOrder {

    static {
        System.out.println("Static block executed.");
    }

    {
        System.out.println("Initializer block executed.");
    }

    ExecutionOrder() {
        System.out.println("Constructor executed.");
    }
	
	}
	public class Problem5{

    public static void main(String[] args) {
        System.out.println("Main method started.");

        ExecutionOrder obj1 = new ExecutionOrder();
        ExecutionOrder obj2 = new ExecutionOrder();

        System.out.println("Main method ended.");
    }
}
