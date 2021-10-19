package programers;

public class middlenum {
    //zxcvb
    public String solution(String s) {
        String answer = "";
        String v1 = "";
        String v2 = "";
        if(s.length() % 2 == 0){
           v1 = String.valueOf(s.charAt(s.length() / 2));
           v2 = String.valueOf(s.charAt(s.length() / 2 - 1));
           answer = v1.concat(v2);
        }else
           answer = String.valueOf(s.charAt(s.length() / 2));

        return answer;
    }
}
