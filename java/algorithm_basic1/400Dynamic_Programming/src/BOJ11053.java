import java.util.Scanner;

public class BOJ11053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        int d[] = new int[n + 1];
        int ans=d[1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            d[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j >= 1; j--) {
                if (a[i] > a[j] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                }
            }
        }
        for(int i=1;i<=n;i++){
            if(ans<d[i])
                ans=d[i];
        }
        System.out.println(ans);

    }
}
