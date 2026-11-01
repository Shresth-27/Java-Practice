import java.util.*;
public class Functionmultiplyreturn {
    public static int Calculateproduct(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();

        System.out.println("product of 2 numbers is:"+ Calculateproduct(a,b));
    }
}
