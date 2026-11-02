import java.util.*;
public class FunctionCircle {
    public static Double GetCircumference(Double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println(GetCircumference(radius));
    }
}
