package Day3;

public class Comparison {
    public static void main(String[] args) {
        // Strings are stored in the string pool of the heap memory
        String name = "Ananta";
        String b = "Ananta";

        // name and b are pointing to the same object i.e "Ananta"
        // Equal operator checks the object on which the variable is pointing to
        System.out.println(name==b); // gives true


        // Using new keyword to create string creates string outside of the string pool.So there is no optimization.
        String name1 = new String("Ananta");
        String b1 = new String("Ananta");
        System.out.println(name1==b1);



    }
}
