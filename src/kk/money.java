package programers;

public class money {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long save = 0;
        long mul = 1;
        for(long i = 0; i < count; i++){
            save += price * mul;
            mul++;
            System.out.println(mul);
        }

        if(money - save >= 0){
            return 0;
        }else{
            save -= money;
            return save;
        }
    }

    public static void main(String[] args) {
        money m = new money();
        System.out.println(m.solution(3,20,4));
    }
}
