public class Output {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
            
            System.out.print(i + ". ");

         
            if (i == 1) {
                System.out.println("Saya senang");
            } else if (i % 3 == 0) {
                System.out.println("Masukan angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println("Saya anak moklet");
            } else {
                System.out.println("Saya anak wikusama");
            }
        }
    }
}