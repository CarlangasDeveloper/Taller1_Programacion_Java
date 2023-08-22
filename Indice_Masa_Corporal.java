import java.util.Scanner;
public class Indice_Masa_Corporal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---RIESGO ENFERMEDADES CORONARIAS---");
        System.out.print("Ingrese su estatura en metros (Utiliza la coma en vez del punto): ");
        float estatura = sc.nextFloat();

        System.out.print("Ingrese su peso en kilos (Utiliza la coma en vez del punto): ");
        float peso = sc.nextFloat();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        float masa = peso / (estatura * estatura);

        if (edad >= 45) {
            if (masa >= 22.0) {
                System.out.println("Riesgo de sufrir enfermedades coronarias ALTO");
            } else {
                System.out.println("Riesgo de sufrir enfermedades coronarias MEDIO");
            }
        }
        else {
            if (masa >= 22.0) {
                System.out.println("Riesgo de sufrir enfermedades coronarias MEDIO");
            } else {
                System.out.println("Riesgo de sufrir enfermedades coronarias BAJO");
            }
        }
    }
}
