import java.util.*;
public class Functionpower {
    public static int Getpower(int x, int n){
        int Power = 1;
        for ( int i=0; i<n; i++){
            Power = Power * x;
        }
        return Power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(Getpower(x, n));
    }
}
