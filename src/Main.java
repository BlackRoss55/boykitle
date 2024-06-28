import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float b, k, e;
        System.out.print("Boyunuzu giriniz: ");
        b = sc.nextFloat();
        System.out.print("Kilonuzu giriniz: ");
        k = sc.nextFloat();

        e = k/(b*b);
        System.out.print("Vücut kitle endeksiniz: "+ e);
    }
}