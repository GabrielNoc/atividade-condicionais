import java.util.Scanner;

public class condicionais {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero1");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o numero2");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println(numero1 + " é maior");

        } else if (numero1 < numero2) {
            System.out.println(numero2 + " é maior");

        } else if (numero1 == numero2) {
            System.out.println(numero1 + " e " + numero2 + " são iguais.");
        }
        scanner.close();
            

    }
}
