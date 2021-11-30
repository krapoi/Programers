package programers;

public class prime {
    public static void main(String[] args) {
        prime p = new prime();
        System.out.println(p.prime(7));
    }


    public boolean prime(int a) {
        boolean isPrime = false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = true;
                break;
            }
        }
        return isPrime;
    }
}
