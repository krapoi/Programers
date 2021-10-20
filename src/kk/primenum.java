package programers;


public class primenum {

   /* public int solution(int n) {
        Boolean[] prime = new Boolean[n + 1];
        int answer = 0;

        //소수이면 true, 소수가 아니라면 false 를 반환
        prime[0] = prime[1] = false;//0 과 1은 소수가 아님

        for(int i=2; i<=n; i+=1) {
            prime[i] = true;
        }

        for(int i = 2; i < Math.sqrt(n); i++){ // for(int i = 0; i*i < n; i++) 과 같음 곱하기는 효율성을 떨어트림
            if(prime[i]){// prime 이 소수라면 == prime = false 라면
                for(int j = 2*i; j <= n; j+=i) //에라토스텔레스의 체에 의해 소수의 배수 전부 제외
                    prime[j] = false;
            }
        }

        for(int i=0; i< prime.length;i++){
            if(prime[i])
                answer++;
        }

        return answer;
    }*/

    public int solution(int n){
        int[] prime = new int[n + 1];
        int answer = 0;

        prime[0] = prime[1] = 0;

        for(int i = 2; i <=n; i++) prime[i] = i;

        for(int i = 2; i < n;i++){
            if(prime[i] == 0) continue;
            for(int j = 2*i; j <=n; j+=i) prime[j] = 0;
        }

        for(int i = 0; i <prime.length; i++)
            if (prime[i] != 0) answer++;

        return answer;
    }


    public static void main(String[] args) {
        primenum n = new primenum();
        System.out.println(n.solution(10));
    }

}
