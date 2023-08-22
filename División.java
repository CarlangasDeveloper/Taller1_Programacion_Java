import java.util.Scanner;
public class División {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---DIVISIÓN---");
        System.out.println("Ingrese dos números enteros para calcular la división y saber si es exacta o no");
        System.out.print("Ingrese Dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese Divisor: ");
        int divisor = sc.nextInt();

        int residuo = dividendo % divisor;
        int cociente = dividendo / divisor;

        if (residuo > 0){
            System.out.println("La división entre "+dividendo+" y "+divisor+" NO es exacta");
        }
        else {
            System.out.println("La división entre "+dividendo+" y "+divisor+" SI es exacta");
        }

        System.out.println("El cociente de la división es: "+cociente);
        System.out.println("El residuo de la division es: "+residuo);
    }
}
