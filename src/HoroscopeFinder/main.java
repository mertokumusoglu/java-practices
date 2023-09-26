package HoroscopeFinder;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String month;
        int day;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Lütfen hangi ayda doğduğunuzu giriniz: ");
        month = sc.nextLine();

        if(month.equals("Ocak") || month.equals("ocak") || month.equals("OCAK")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 21) {
                System.out.printf("Oğlak burcusunuz");
            }
            else {
                System.out.printf("Kova burcusunuz");
            }
        }
        else if(month.equals("Şubat") || month.equals("şubat") || month.equals("ŞUBAT")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 19) {
                System.out.printf("Kova burcusunuz");
            }
            else {
                System.out.printf("Balık burcusunuz");
            }
        }
        else if(month.equals("Mart") || month.equals("mart") || month.equals("MART")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 20) {
                System.out.printf("Balık burcusunuz");
            }
            else {
                System.out.printf("Koç burcusunuz");
            }
        }
        else if(month.equals("Nisan") || month.equals("nisan") || month.equals("NİSAN")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 20) {
                System.out.printf("Koç burcusunuz");
            }
            else {
                System.out.printf("Boğa burcusunuz");
            }
        }
        else if(month.equals("Mayıs") || month.equals("mayıs") || month.equals("MAYIS")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 21) {
                System.out.printf("Boğa burcusunuz");
            }
            else {
                System.out.printf("İkizler burcusunuz");
            }
        }
        else if(month.equals("Haziran") || month.equals("haziran") || month.equals("HAZİRAN")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 22) {
                System.out.printf("İkizler burcusunuz");
            }
            else {
                System.out.printf("Yengeç burcusunuz");
            }
        }
        else if(month.equals("Temmuz") || month.equals("temmuz") || month.equals("TEMMUZ")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 22) {
                System.out.printf("Yengeç burcusunuz");
            }
            else {
                System.out.printf("Aslan burcusunuz");
            }
        }
        else if(month.equals("Ağustos") || month.equals("ağustos") || month.equals("AĞUSTOS")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 22) {
                System.out.printf("Aslan burcusunuz");
            }
            else {
                System.out.printf("Başak burcusunuz");
            }
        }
        else if(month.equals("Eylül") || month.equals("eylül") || month.equals("EYLÜL")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 22) {
                System.out.printf("Başak burcusunuz");
            }
            else {
                System.out.printf("Terazi burcusunuz");
            }
        }
        else if(month.equals("Ekim") || month.equals("ekim") || month.equals("EKİM")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 22) {
                System.out.printf("Terazi burcusunuz");
            }
            else {
                System.out.printf("Akrep burcusunuz");
            }
        }
        else if(month.equals("Kasım") || month.equals("kasım") || month.equals("Kasım")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 21) {
                System.out.printf("Akrep burcusunuz");
            }
            else {
                System.out.printf("Yay burcusunuz");
            }
        }
        else if(month.equals("Aralık") || month.equals("aralık") || month.equals("ARALIK")) {

            System.out.printf("Lütfen hangi günde doğdunuzu giriniz: ");
            day = sc.nextInt();
            if (day <= 21) {
                System.out.printf("Yay burcusunuz");
            }
            else {
                System.out.printf("Ocak burcusunuz");
            }
        }
    }
}
