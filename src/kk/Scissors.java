package programers;

public class Scissors {
    public String solution(String s, int n) {
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < s.length(); j++){
                if(arr[j] == ' ') continue;
                else if(arr[j] == 'z' || arr[j] == 'Z') arr[j] -= 25;
                arr[j] += 1;
            }
        }
        String answer = new String(arr);
        return answer;
    }
}
