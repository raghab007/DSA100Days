package Day3;

public class Palindrome {
    // abcdcba.reverse() == abcdcba ==> Example of palindrome



    public static void main(String[] args) {
//        System.out.println(isPalindrome("abcdcba"));
//        System.out.println(isPalindrome("mom"));
//        System.out.println(isPalindrome("Raghab"));
//        System.out.println(isPalindrome1("mom"));
        System.out.println(isPalindrom3("MOm"));
        System.out.println(isPalindrom3("Raghab"));
    }

    // My method
    public static boolean isPalindrome(String string){
        string = string.toLowerCase();
        String newString = "";
        int stringLength = string.length()-1;
        for (int i=stringLength;i>=0;i--){
            newString = newString+string.charAt(i);
        }

        return newString.equals(string);

    }


    // By me
    public static boolean isPalindrome1(String string){
        int stringLenght = (string.length()%2==0)?(string.length()/2):((string.length()-1)/2);
        System.out.println(stringLenght);
        for (int i=0;i<stringLenght;i++){
            int  j = string.length()-1;
            if(string.charAt(i)!=string.charAt(j)){

                return false;

            }

            j=j-1;

        }
        return  true;

    }

    public static  boolean isPalindrom3(String str){
        if (str.length()==0 || str==null){

            return true;

        }
        str = str.toLowerCase();
        for (int i=0;i<str.length()/2;i++){
            int j  =  str.length()-1;
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }


}
