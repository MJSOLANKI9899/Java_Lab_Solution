import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int nst=1;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            if(i<n) nst++;
            else nst--;
            System.out.println("");
        }
        sc.close();
    }
}
