package AtmProject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, password;

        int right = 3;
        int balance = 1500;
        int select;
        int price;
        while (right > 0) {
            System.out.printf("Kullanıcı adınızı giriniz: ");
            userName = sc.nextLine();
            System.out.printf("Şifrenizi giriniz: ");
            password = sc.nextLine();

            if(userName.equals("lyth") && password.equals("123456")) {
                System.out.println("Banka sistemimize hoşgeldiniz!");
                do {
                System.out.println("1 - Para yatırma\n" +
                        "2 - Para çekme\n" +
                        "3 - Bakiye sorgula\n" +
                        "4 - Çıkış yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                select = sc.nextInt();
                    switch (select) {
                        case 1:
                        System.out.printf("Yatırmak istediğiniz para miktarını giriniz: ");
                        price = sc.nextInt();
                        balance += price;
                        System.out.println("Mevcut bakiyeniz: " + balance);
                        break;

                        case 2:
                        System.out.printf("Çekmek istediğiniz para miktarını giriniz: ");
                        price = sc.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiyeniz yetersiz.");
                        }
                        else {
                        balance -= price;
                        System.out.println("Mevcut bakiyeniz: " + balance);
                        }
                        break;

                        case 3:
                        System.out.println("Mevcut bakiyeniz: " + balance);
                        break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Lütfen tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
