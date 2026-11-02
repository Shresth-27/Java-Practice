import java.util.*;
public class Functionaverage {
    public static void Calculateaverage(Double a, Double b, Double c){
        double avg = (a + b + c)/3.0;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Calculateaverage(a, b, c);
    }
}