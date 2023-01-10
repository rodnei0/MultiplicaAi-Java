import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual número voce deseja mutiplicar?");

        int number = input.nextInt();

        System.out.println();
        System.out.println("Tabela de multiplicaçao de " + number + ":");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }
        ;
    }
}
