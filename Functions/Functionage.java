import java.util.*;
public class Functionage {
    public static Boolean Iselligible(int n){
        if (n > 18){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(Iselligible(n));
    }
}
