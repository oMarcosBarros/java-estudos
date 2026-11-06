package Task;

import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        String nome;
        int anoFormatura;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite o ano em que irá se formar: ");
        anoFormatura = teclado.nextInt();
        System.out.println("Parabéns " + nome + " voce irá se formar em " + anoFormatura);
        teclado.close();


    }
}
