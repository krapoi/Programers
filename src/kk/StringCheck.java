package programers;

public class StringCheck {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a == 'p' || a == 'P'){
                p++;
            }else if(a == 'y' || a == 'Y')
                y++;
        }

        if(p != y)
            answer = false;


        return answer;
    }
}
