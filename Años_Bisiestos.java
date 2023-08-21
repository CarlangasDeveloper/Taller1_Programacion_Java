import java.util.Scanner;
public class Años_Bisiestos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---Años Bisiestos---");
        System.out.println("Ingrese un año para saber si es bisiesto o no: ");
        int año = sc.nextInt();

        if (año >= 1582) {
            if (año % 400 == 0) {
                System.out.println("El año " + año + " SI es bisiesto");
            } else {
                System.out.println("El año " + año + " NO es bisiesto");
            }
        }
        else {
            if(año % 4 == 0){
                System.out.println("El año "+año+" SI es bisiesto");
            }
            else {
                System.out.println("El año " + año + " NO es bisiesto");
            }
        }
    }
}

