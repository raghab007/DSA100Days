package TrySomethingNew;

public class Main {
    int a;
    public static void main(String[] args) {

        Animal animal = new Animal() {
            int a  = 10;
            @Override
            public String walk() {
                this.a  =20;
                 return "Wakling";
            }
        };
        System.out.println(animal.walk());


        Animal animal1 = ()->{
           // a = 10;
            return  "Heelo";
        };

        System.out.println(animal1.walk());
    }

}
