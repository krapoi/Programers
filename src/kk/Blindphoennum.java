package programers;

public class Blindphoennum {
    public String solution(String phone_number) {

        StringBuilder ans = new StringBuilder(phone_number);
        for(int i = 0; i < phone_number.length() - 4; i ++){
            ans.setCharAt(i,'*');
        }
        String answer = ans.toString();
        return answer;
    }
}
