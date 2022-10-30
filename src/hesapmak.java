import java.util.Scanner;

public class hesapmak {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("bir sayı giriniz= ");
        int a= dat.nextInt();
        System.out.println("bir sayı giriniz= ");
        int b= dat.nextInt();


        System.out.println("Toplama -1- \nÇıkarma-2- \nÇarpma-3- \nBölme-4-");
        int secim=dat.nextInt();

        switch (secim) {
            case 1:
                System.out.println((a + b));
                break;
            case 2:
                System.out.println((a - b));
                break;
            case 3:
                System.out.println((a * b));
                break;
            case 4:
                if(b==0) System.out.println("bir sayı sıfıra bölünemez");
                else System.out.println((a / b));
                break;

            default:
                System.out.println("hatalı seçim");
        }



    }

}
