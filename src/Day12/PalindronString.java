package Day12;

public class PalindronString {
    public static void main(String[] args) {
        String mom = "MOM";
        String nn = "HHHHaaaaa";
        System.out.println(check(mom));
        System.out.println(check(nn));
        System.out.println(check2(mom));
        System.out.println(check2(nn));

    }
   static boolean check(String str){
        str = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str);
        int builderLength = stringBuilder.length();
        for (int i=0;i<=(builderLength-1)/2;i++){
            char temp = stringBuilder.charAt(i);
            stringBuilder.setCharAt(i, stringBuilder.charAt(builderLength-1-i));
            stringBuilder.setCharAt(builderLength-1-i, temp);
        }
        return  stringBuilder.toString().equals(str);
    }
    // Another method
    static boolean check2(String str){
        str = str.toLowerCase();
       int stringLength = str.length();
       for (int i=0;i<=(stringLength-1)/2;i++){
           if (str.charAt(i)!=str.charAt(stringLength-1-i)){
               return  false;
           }
       }
       return  true;
    }
}
