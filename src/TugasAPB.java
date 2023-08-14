import java.util.Scanner;

public class TugasAPB {
    public static void main(String[] args) {
        //Segitiga//

        System.out.println("Sisi1= ");
        Scanner input = new Scanner(System.in);
        int sisi1 = input.nextInt();
        System.out.println("Sisi2= ");
        int sisi2 = input.nextInt();
        System.out.println("Sisi3 = ");
        int sisi3 = input.nextInt();

        int s = (sisi1+sisi2+sisi3)/2;
        double luas = Math.sqrt(s*(s-sisi1)*(s-sisi2)*(s-sisi3));

        System.out.println("Jawaban = " +luas);

        //Lingkaran//
        System.out.println("diameter= ");
        Scanner input = new Scanner(System.in);
        int diameter = input.nextInt();

        double Keliling = Math.PI*diameter;

        System.out.println(Keliling);

    }
}
