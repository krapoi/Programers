package programers;


public class SelectKim {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return answer = "김서방은 " + (i) + "에있다";
            }
        }
        return "";
    }

    public static void main(String[] args) {
        SelectKim s = new SelectKim();
        String[] k = {"a","d","a","s","c","asda","vxzv","Kim"};
        System.out.println(s.solution(k));

    }
}
