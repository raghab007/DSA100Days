package enumsExample;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday, Thursday,Friday, Saturday,Sunday;
        // These Enum Constants
        // Public static and final
        // since its final  you cannot create child enums
        //type is Week

        Week(){

            System.out.println("Constructor called for :"+this);

        }

    }

    public static void main(String[] args) {
        Week week;
        week  =  Week.Friday;
        System.out.println(week.ordinal());

        for (Week day:Week.values()){
            System.out.println(day);
        }
    }
}
