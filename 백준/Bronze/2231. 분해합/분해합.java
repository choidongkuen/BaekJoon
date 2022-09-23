import java.util.Scanner;

// 주어지는 수 n의 최소 생성자
public class Main {
    public static int MAX_VALUE = 1000000; // 10의 6승
    public static int n; // 주어지는 자연수 n(n의 최소 생성자를 찾아야 함)

    public static int getPartsum(int x){

        if(x < 10)
            return x;

        return getPartsum(x / 10) + x % 10;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= MAX_VALUE; i++){
            if(i + getPartsum(i) == n){
                result = i;
                break;
            }
        }

        System.out.println(result);

    }
}