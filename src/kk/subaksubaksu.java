package programers;

public class subaksubaksu {
    public String solution(int n) {
        boolean checked = false;
        String answer = "";
        for(int i = 0; i < n; i++){
            if(!checked){
                answer = answer.concat("수");
                checked = true;
            }else if(checked){
                answer = answer.concat("박");
                checked = false;
            }
        }
        return answer;
    }
}
