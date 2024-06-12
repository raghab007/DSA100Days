package Day1;

public class LinearSearchInString{
    public static void main(String[] args) {
        java.lang.String name = "Raghab";
        char a  = 'w';
        System.out.println(search(name,a));


    }


    static  boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i=0;i<str.length();i++){
            char element = str.charAt(i);
            if(element==target){
                return true;
            }
        }
        return false;

    }

}
