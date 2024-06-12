package Day3;

public class Performance {
    public static void main(String[] args) {
        String alphabets = "";
        for (int i=0;i<26;i++){
            alphabets=alphabets+((char)('a'+i));
        }

        System.out.println(alphabets);
    }
}
