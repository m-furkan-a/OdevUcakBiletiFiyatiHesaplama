import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int km , yas , yt;
	    double tutar, indirimlitutar=0 , yasindirimi=0 , biletindirimi=0 , toplamtutar=0;

	    System.out.print("Mesafeyi km türünden giriniz : ");
	    km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön 2=> Gidiş-Dönüş) : ");
        yt = input.nextInt();

        if (km > 0 && yas >0) {
             tutar = km * 0.10;

             if (yas < 12){
                 yasindirimi = tutar * 0.50 ;
                 indirimlitutar = tutar - yasindirimi;
            }
            else if (yas < 24){
                yasindirimi = tutar * 0.10 ;
                indirimlitutar = tutar - yasindirimi;
            }
            else if (yas >= 65){
                yasindirimi = tutar * 0.30 ;
                indirimlitutar = tutar - yasindirimi;
            }
            else {
                 indirimlitutar = tutar;
                 toplamtutar = tutar;
             }
            if (yt==2){
                biletindirimi = indirimlitutar * 0.20;
                toplamtutar = (indirimlitutar - biletindirimi) * 2;
                System.out.print("Toplam Tutar : " + toplamtutar);
            }else if (yt==1){
                System.out.print("Toplam Tutar : " + toplamtutar);
            }
            else {
                System.out.print("Hatalı Veri Girdiniz...");
            }
        }
        else {
            System.out.print("Hatalı Veri Girdiniz...");
        }
    }
}
