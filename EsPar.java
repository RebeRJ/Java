import java.util.Scanner;

public class EsPar {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte un numero entero: ");
        int numero = teclado.nextInt();
        if(numero % 2 == 0){
            System.out.println("ES PAR");
        }
        else{
            System.out.println("ES IMPAR");
        }
    }
}
