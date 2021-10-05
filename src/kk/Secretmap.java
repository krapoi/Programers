package kk;

public class Secretmap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] ar1 = new int[n];

        for (int i = 0; i < n; i++) {
            ar1[i] = arr1[i] | arr2[i];
        }
        for(int i = 0; i < ar1.length; i++){
            String binary = Integer.toBinaryString(ar1[i]);
            if(binary.length() < n){
                int cha = n - binary.length(); // 루프문에서 메소드 호출하면 가끔가다 ㅄ됨
                for(int j = 0; j < cha; j++){
                    binary = "0" + binary;
                }
            }
            binary = binary.replaceAll("1", "#");
            binary = binary.replaceAll("0", " ");
            answer[i] = binary;
        }

        return answer;
    }
}
