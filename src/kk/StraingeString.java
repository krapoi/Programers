package programers;



public class StraingeString {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strings = s.split(" ", -1);

        for(int i = 0; i < strings.length; i++){
            char[] ch = strings[i].toCharArray();
            for(int j = 0; j < ch.length; j++){
                if(j % 2 == 0 || j == 0){
                    ch[j] = Character.toUpperCase(ch[j]);
                }else
                    ch[j] = Character.toLowerCase(ch[j]);
            }
            for(int k = 0; k < ch.length; k++){
                answer.append(ch[k]);
            }

            answer.append(' ');
        }
        answer.delete(answer.length()-1, answer.length());
        return answer.toString();
    }

    public static void main(String[] args) {
        StraingeString s= new StraingeString();
        System.out.println(s.solution("try hello world"));
    }
}
