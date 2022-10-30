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
        double sonuc=0;

        switch (secim) {
            case 1:
                sonuc = a + b;
            break;
            case 2:
                sonuc = a - b;
            break;
            case 3:
                sonuc = a * b;
            break;
            case 4:
                sonuc = a / b;
            break;
        }
            System.out.println(sonuc);


    }

}
