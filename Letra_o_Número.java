import java.util.Scanner;
public class Letra_o_Número {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---LETRA O NÚMERO---");
        System.out.println("Ingrese el caracter para identificar si es una letra mayuscula o minuscula o si es un número");
        System.out.print("Caracter: ");
        char caracter = sc.next().charAt(0);

        if (caracter >= 'A' && caracter <= 'Ñ') {
            System.out.println("La letra "+caracter+" es mayúscula");
        } else if (caracter >= 'a' && caracter <= 'ñ') {
            System.out.println("La letra "+caracter+" es minúscula");
        } else if (caracter >= '0' && caracter <= '9') {
            System.out.println("Es un número");
        } else {
            System.out.println(+caracter+" no es ni una letra ni un número.");
        }
    }
}
