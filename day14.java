public class day14 {
    public static void main(String[] args) {
        // String yang akan diubah
        String suho = "1";
        String xiumin = "99";
        String baekhyun = "4";
        String chen = "21";
        String chanyeol = "61.9";
        String kyungsoo = "12.15";
        String kai = "true";

        // Konversi ke 6 tipe data angka
        byte exoByte = Byte.parseByte(suho);
        short exoShort = Short.parseShort(xiumin);
        int exoInt = Integer.parseInt(baekhyun);
        long exoLong = Long.parseLong(chen);
        float exoFloat = Float.parseFloat(chanyeol);
        double exoDouble = Double.parseDouble(kyungsoo);

        // Konversi ke tipe data kondisi
        boolean exoBoolean = Boolean.parseBoolean(kai);

        // Cetak hasil
        System.out.println("Byte   : " + exoByte);
        System.out.println("Short  : " + exoShort);
        System.out.println("Int    : " + exoInt);
        System.out.println("Long   : " + exoLong);
        System.out.println("Float  : " + exoFloat);
        System.out.println("Double : " + exoDouble);
        System.out.println("Boolean: " + exoBoolean);
    }
}
