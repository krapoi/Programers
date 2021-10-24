package programers;

public class Hashardnum {
    public boolean solution(int x) {

        int n = 0;
        int num = x;
        while(x != 0){
            n += x % 10;
            x /= 10;
        }
        System.out.println(n);

        if( num % n == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Hashardnum h = new Hashardnum();
        System.out.println(h.solution(10));
        System.out.println(h.solution(12));
        System.out.println(h.solution(11));
        System.out.println(h.solution(13));
    }


}
