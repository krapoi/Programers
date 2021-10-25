package programers;

public class SqrtPow {
    public long solution(long n) {
        long s = (long) Math.sqrt(n);
        if(n == Math.pow(s,2))
            return (long) Math.pow(s+1,2);

        return -1;
    }







}
