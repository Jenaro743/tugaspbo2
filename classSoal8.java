package tugaspbo_2_mohamadagip;

public class classSoal8 {
    public static void main(String[] args) {
        double kecepatanCahaya = 300000; // km/s
        double jarakBumiBulan = 384400; // km
        double jarakBumiMatahari = 150000000; // km
        
        double waktuBulan = jarakBumiBulan / kecepatanCahaya;
        double waktuMatahari = jarakBumiMatahari / kecepatanCahaya;
        
        System.out.println("Waktu tempuh cahaya Ke Bulan = " + waktuBulan + " detik");
        System.out.println("Waktu tempuh cahaya ke Matahari = " + waktuMatahari + " detik");

    
    }
}
