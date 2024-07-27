package TrySomethingNew;
// Just trying some random things in the java...//
public class Hello {

    static int a=5 ;
   static int b=10;

    public static void main(String[] args) {
      change();
        System.out.println(a);
        System.out.println(addTwoNumbers(a, b));
        Hello hello = new Hello();
        hello.change1(555);
        System.out.println(a);
    }

    static int addTwoNumbers(int a , int b){
        int sum = a+b;
        return sum;
    }

    static  void change(){
        // The static variable can be used in the static methods
        a = 10;
    };

    void change1(int change){
        a = change;

    }
}
