/* . Can we override private method, constructor, static method, final method? Illustrate with an example. */
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }

    private void privateMethod() {
        System.out.println("Private method in Parent");
    }

    static void staticMethod() {
        System.out.println("Static method in Parent");
    }

     final void finalMethod() {
        System.out.println("Final method in Parent");
    } 

    void callMethods() {
        privateMethod();
        staticMethod();
        finalMethod();
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }

   public  void privateMethod() {
        System.out.println("Private method in Child");
    }

    static void staticMethod() {
        System.out.println("Static method in Child");
    }

    void finalMethod() {
        System.out.println("Trying to override final method");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.privateMethod();
        Child.staticMethod();
        c.callMethods();
    }
}
