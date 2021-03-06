package Second;
import java.util.Scanner;
public class BOJ15649 {
    static boolean[] c=new boolean[10];
    static int[] a= new int[10];
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        go(0,n,m);
        System.out.println(sb.toString());

    }

    static void go(int index, int n, int m){
        if(index==m){
            for(int i=0;i<m;i++){
                sb.append(a[i]);
                if(i!=m-1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=n;i++){
            if(c[i]) continue;
            c[i]=true;
            a[index]=i;
            go(index+1,n,m);
            c[i]=false;
        }
    }
}

