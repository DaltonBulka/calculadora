package aplicacao.primeiro;

import java.util.Scanner;

public class Primeiro {
    public void executaExercicio() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numeroUm = scanner.nextDouble();

        System.out.println("Digite um operador (+ - * /): ");
        String operador = scanner.next();

        while (!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/")) {
            System.out.println("Operador digitado esta incorreto!");
            System.out.println("Digite novamente um operador correspondente (+ - * /): ");
            operador = scanner.next();
        }
        System.out.println("Digite o segundo numero: ");
        double numeroDois = scanner.nextDouble();

        while (operador == "/" && numeroDois == 0) {
            System.out.println("\nDivisão por zero");
            System.out.println("Digite o segundo numero: ");
            numeroDois = scanner.nextDouble();

        }
        double resutado = 0;


        switch (operador) {
            case "+":
                resutado = numeroUm + numeroDois;
                break;
            case "-":
                resutado = numeroUm - numeroDois;
                break;
            case "*":
                resutado = numeroUm * numeroDois;
                break;
            case "/":
                resutado = numeroUm / numeroDois;
                break;
        }
        System.out.println(" " + numeroUm + " " + operador + " " + numeroDois + " = " + resutado);

    }

}

