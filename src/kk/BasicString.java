package programers;

public class BasicString {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            char[] c = s.toCharArray();
            for(int i = 0; i < c.length; i++){
                System.out.println(c[i]);
                if(c[i] >= 65 && c[i] <= 122)
                    return false;
            }
        }else return false;
        return true;
    }

    public static void main(String[] args) {
        BasicString a = new BasicString();
        System.out.println(a.solution("1234"));
    }
}
