import java.util.*;
// 수의 갯수 : N
// 합을 구해야 하는 횟수 : M



public class Main {
    public static final int MAX = 100000; // 10의 5승
    public static int[] arr = new int[MAX + 1]; // 값을 담을 1차원 배열
    public static int[] sumArr = new int[MAX + 1]; // 누적합을 기록할 1차원 배열
    public static ArrayList<Integer> arrList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            sumArr[i] = sumArr[i- 1] + arr[i];
        }
        // 배열의 원소 입력

        for(int i = 0; i < m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arrList.add(sumArr[end] - sumArr[start - 1]);
        }

        for(int e : arrList)
            System.out.println(e);
    }
}
