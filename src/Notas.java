import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        double NF = 0;
        String NP;
        double NTR;
        double NT;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce si la práctica es apta o no apto");
        NP = scanner.nextLine();
        System.out.println("Introduce la nota de los trabajos");
        NTR = scanner.nextDouble();
        System.out.println("Introduce la nots de la teoria");
        NT = scanner.nextDouble();

        if (NP.equals("No apto")){
            NF = 4;
        } else if (NP.equals("Apto")) {
            if (NT < 4.5){
                NF = NT;
            }else {
                NF = NT + NTR;
            }
        }if (NF >= 10){
            System.out.println("Nota final: Matricula de Honor");
        }else {
            System.out.println("Nota final: " + NF);
        }
    }
}
