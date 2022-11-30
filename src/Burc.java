import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int day, month;
        String burc = null;
        String monthStr = null;
        Boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Gün : ");
        day = input.nextInt();

        System.out.print("Ay : ");
        month = input.nextInt();

        if(month > 0 && month < 13) {
            if (month == 1) {
                monthStr = "Ocak";
                if(day <= 21 ) {
                    burc = "Oğlak";
                }
                else {
                    burc = "Kova";
                }
            }
            if (month == 2) {
                monthStr = "Şubat";
                if(day <= 19) {
                    burc = "Kova";
                }
                else {
                    burc = "Balık";
                }
            }
            if (month == 3) {
                monthStr = "Mart";
                if(day <= 20) {
                    burc = "Kova";
                }
                else {
                    burc = "Koç";
                }
            }
            if (month == 4) {
                monthStr = "Nisan";
                if(day <= 20) {
                    burc = "Koç";
                }
                else {
                    burc = "Boğa";
                }
            }
            if (month == 5) {
                monthStr = "Mayıs";
                if(day <= 21) {
                    burc = "Boğa";
                }
                else {
                    burc = "İkizler";
                }
            }
            if (month == 6) {
                monthStr = "Haziran";
                if(day <= 22) {
                    burc = "İkizler";
                }
                else {
                    burc = "Yengeç";
                }
            }
            if (month == 7) {
                monthStr = "Temmuz";
                if(day <= 22) {
                    burc = "Yengeç";
                }
                else {
                    burc = "Aslan";
                }
            }
            if (month == 8) {
                monthStr = "Ağustos";
                if(day <= 22) {
                    burc = "Aslan";
                }
                else {
                    burc = "Başak";
                }
            }
            if (month == 9) {
                monthStr = "Eylül";
                if(day <= 22) {
                    burc = "Başak";
                }
                else {
                    burc = "Terazi";
                }
            }
            if (month == 10) {
                monthStr = "Ekim";
                if(day <= 22) {
                    burc = "Terazi";
                }
                else {
                    burc = "Akrep";
                }
            }
            if (month == 11) {
                monthStr = "Kasım";
                if(day <= 21) {
                    burc = "Akrep";
                }
                else {
                    burc = "Yay";
                }
            }
            if (month == 12) {
                monthStr = "Aralık";
                if(day <= 21) {
                    burc = "Yay";
                }
                else {
                    burc = "Oğlak";
                }
            }
        }
        else {
            isError = true;

        }

        if(monthStr != null) {
            System.out.println("Doğum Tarihi : " + day + " " + monthStr  );
            System.out.println("Burcunuz : " + burc);
        }
        else {
            System.out.println("Hatalı Giriş");


        }

    }
}
