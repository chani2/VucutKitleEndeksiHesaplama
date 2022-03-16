import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        double  boy,boy2, kg, index;


        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz");
        kg = input.nextInt();
        index= kg / (boy * boy);
        System.out.print("VUcut kitle indeksiniz:" + index);

























    }
}
