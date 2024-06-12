package Day3;

public class SB {
    public static void main(String[] args) {
        // Strings are immutable but StringBuilders are mutable in java
        // New String should be created to add String in the String object but we can add new String in the same StringBuilder object
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<26;i++){
            char ch =(char) ('a'+i);
            builder.append(ch);

        }
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
        String name = builder.toString();
        System.out.println(builder);
        System.out.println(name);
    }
}
