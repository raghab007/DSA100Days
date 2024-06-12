package TrySomethingNew;

public class Car {
    String company;

    int price;



    public Car(String company, int price){
        System.out.println("before initialization");
        System.out.println(this);
        this.company = company;
        this.price = price;
        System.out.println("after initialization");
        System.out.println(this);


    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 10000000);
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", price=" + price +
                '}';
    }




}
