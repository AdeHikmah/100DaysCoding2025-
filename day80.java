public class day80 {
    public static void main(String[] args) {
        String [] lagu = {"Don't Wanna Cry", "HOT", "Lalali", "ASH", "SUPER"};
        
        System.out.println("Lagu favorit : " + lagu[0]);
        System.out.println("Lagu terakhir : " + lagu[4]);
        
        System.out.println("Saya bosan dengan " + lagu[1] + " Ganti jadi Kidult");
        lagu[1] = "Kidult";
        
        System.out.println("Lagu ke-2 sekarang : " + lagu[1]);
        
        System.out.println("Total lagu : " + lagu.length);
    }
    
}
