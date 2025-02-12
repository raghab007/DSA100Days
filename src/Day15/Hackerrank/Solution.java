package Day15.Hackerrank;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0;j<n;j++){
                int output = a;
                for(int k=0;k<=j;k++){
                    output = output+ (int) (b* (Math.pow(2, k)));

                }
                System.out.print(output+" ");
            }
            System.out.println();

        }
        in.close();
    }
}