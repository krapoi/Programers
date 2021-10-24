package programers;

public class colass {
    public int solution(long num) {
        int answer = 0;
        int check = 500;

        while(true){
            if(num == 1)
                return answer;
            if(answer >= 500)
                break;
            if(num % 2 == 0){
                num /= 2;
                answer++;
            }else{
                num *= 3;
                num += 1;
                answer++;
            }

        }


        return -1;
    }


    public static void main(String[] args) {
        colass c = new colass();
        System.out.println(c.solution(626331));
    }
}
