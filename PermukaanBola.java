import java.util.Scanner;
public class PermukaanBola {
    public static double PermukaanBola(double jariJari){
        return 4 * Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Masukan jari-jari bola");     
        double jariJari = s.nextDouble();
        double luasPermukaan = PermukaanBola(jariJari);
        System.out.println("Luas permukaan bola adalah :"+luasPermukaan);

        s.close();
    }
        
    }

     