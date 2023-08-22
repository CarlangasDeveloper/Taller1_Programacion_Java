import java.time.LocalDate;
import java.util.Scanner;

public class Edad {
    public static void main (String[] args){
        LocalDate currentDate = LocalDate.now();
        int dia_actual = currentDate.getDayOfMonth();
        int mes_actual = currentDate.getMonthValue();
        int año_actual = currentDate.getYear();
        Scanner sc = new Scanner(System.in);

        System.out.println("---EDAD---");
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Dia: ");
        int dia_nacimiento = sc.nextInt();
        System.out.print("Mes: ");
        int mes_nacimiento = sc.nextInt();
        System.out.print("Año: ");
        int año_nacimiento = sc.nextInt();

        int edad = año_actual - año_nacimiento;

        if (mes_actual < mes_nacimiento || (mes_actual == mes_nacimiento && dia_actual < dia_nacimiento)) {

            edad = edad - 1;
        }

        System.out.println("Su edad es: " + edad + " años");

    }
}
