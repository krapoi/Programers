package Coding;

import java.util.Scanner;

public class Test8 {
public static int pow(int x, int y){
    if(y==0)
        return 1;
    return x * pow(x,y-1);
}

    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int test = sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();

            System.out.println("#" + test_case + " " + pow(x,y));

        }
    }

}
