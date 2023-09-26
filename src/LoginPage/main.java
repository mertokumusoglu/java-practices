package LoginPage;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String username, password;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Please enter username: ");
        username = sc.nextLine();
        System.out.printf("Please enter password: ");
        password = sc.nextLine();

        if (username.equals("mauroicardi") && password.equals("lionelmessi")) {
            System.out.println("başarıyla giriş yapıldı");
        }
        else if (!(password.equals("lionelmessi"))) {
            String btn, new_password;
            System.out.println("Girdiğiniz şifre yanlıştır. Şifreyi sıfırlamak isterseniz 'a' tuşuna basınız: ");
            btn = sc.nextLine();
            switch(btn) {
                case ("a"):
                case ("A"):
                    System.out.printf("yeni şifreniizi giriniz (eskisi ile aynı olmamalı): ");
                    new_password = sc.nextLine();
                    if (new_password.equals("lionelmessi")) {
                        System.out.println("Yeni şifreniz eskisi ile aynı olmamalı, lütfen yeni şifre giriniz.");
                    }
                    else {
                        System.out.println("Şifre oluşturuldu");
                    }
            }
        }
    }
}