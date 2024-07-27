package TrySomethingNew;

public class Person {
    String name;

    int age;

    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class  Address{

        static   int postalCode = 977;
        String district;

        String country;
    }

    public static void main(String[] args) {
        Person person = new Person("Raghab",20);
        Person.Address address = person. new Address();
        System.out.println(address.postalCode);
        Person person1 = new Person("Aastha", 21);
        Person.Address address1 = person1.new Address();
        address1.postalCode = 988;
        System.out.println(address1.postalCode);
        System.out.println(address.postalCode);
        Person.Address address2 = person.new Address();
        

    }
}
