package Day15.Hackerrank;

import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    static boolean isBalanced(String s)
    {
        char small1 = '(';
        char small2 = ')';
        char curly1 = '{';
        char curly2 = '}';
        int smallLeftCount =  0;
        int smallRightCount = 0;
        int curlyLeftCount = 0;
        int curlyRightCount = 0;

        for (char c : s.toCharArray()) {
                if (c==small1) {
                    smallLeftCount++;
                }else if (c==small2) {
                    smallRightCount++;
                }else if (c==curly1) {
                    curlyLeftCount++;

                }else if (c==curly2) {
                    curlyRightCount++;
                }
        }

        return smallLeftCount==smallRightCount && curlyRightCount==curlyLeftCount;

    }

}

class Solution2 {

    public static void main(String[] args) {
        Parser parser = new Parser();


        Scanner in = new Scanner(System.in);
        System.out.println(Integer.parseInt(in.next()));
        while (in.hasNext()) {
            System.out.println(Parser.isBalanced(in.next()));
        }

      
        in.close();
    }
}

