package TrySomethingNew;

public class StaticInnerClass {

    static  class Inner{
        static {
            System.out.println("Hello Inner");
        }

    }

    class Inner2{
        static {
            System.out.println("Hello inner 2");
        }

    }

    public static void main(String[] args) {
        //StaticInnerClass.Inner inner = new Inner();
        //StaticInnerClass.Inner inner3 = new Inner();
        new Inner();
    }
}



