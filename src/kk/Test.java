package Coding;

public class Test {
    public static void main(String[] args) {
        String name = "강호동";
        float kor = 85;
        float eng = 73;
        float mat = 68;
        float result = (kor + mat + eng) / 3;
        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(mat);
        System.out.println((kor + mat + eng));
        System.out.printf("평균 : %.2f점\n",(double)(kor+eng+mat)/3);

    }
}
