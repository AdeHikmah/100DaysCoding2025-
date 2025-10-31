public class day54 {
    public static void main(String[] args) {
        for (char huruf = 'A'; huruf <= 'H'; huruf++) {
            if(huruf == 'C' || huruf == 'E'){
                continue; //skip atau lewati huruf C atau E
            }
            System.out.println(huruf);
        }
    }
    
}
