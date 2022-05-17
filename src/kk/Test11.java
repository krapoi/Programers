package Coding;

public class Test11 {
    public static void main(String[] args) {
        int[] n = {10,20,30,40,50,60,70,80,90,100};
        for(int i = n.length - 1; i >= 0; i--)
            System.out.print(n[i] + "  ");

        System.out.println();
        for(int i=1; i < n.length; i+=2)
            System.out.print(n[i] + "  ");

        System.out.println();

        String str = "Have a nice day";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
