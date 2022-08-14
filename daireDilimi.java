import java.util.Scanner;

public class daireDilimi {
    public static void main(String[] args) {

        int r,aci;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yari capini giriniz :");
        r = input.nextInt();
        System.out.println("Daire diliminin acisini giriniz :");
        aci = input.nextInt();

        double alan = (pi * (r*r)*aci)/360;
        System.out.println("Daire Diliminin Alani :" + alan);
    }
}
