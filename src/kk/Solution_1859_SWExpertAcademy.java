package Coding;
import java.util.Scanner;

public class Solution_1859_SWExpertAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = 0;
        long sum = 0;

        int cnt = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < cnt; i++){
            int count = sc.nextInt();
            sc.nextLine();
            String[] data = sc.nextLine().split(" ");
            int max = max(data,0);
            for(int j = 0; j < count; j++){
                if(max == Integer.parseInt(data[j])){
                    if(j == count - 1 && sum == 0)
                        break;
                    else {
                        data[j] = "0";
                        money += max * sum;
                        max = max(data, j);
                        sum = 0;
                    }
                }else {
                    money -= Integer.parseInt(data[j]);
                    sum++;
                }
            }
            System.out.println("#" + (i+1) + " " + money);
            money = 0;
        }


    }

    public static int max(String[] str,int n){
        int m = 0;
        for (int i = n; i < str.length; i++) {
            if (m < Integer.parseInt(str[i]))
                m = Integer.parseInt(str[i]);
        }
        return m;
    }


}
