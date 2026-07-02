package Exercicio02.Main;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class Exercicio02 {
    private int getRemainder(int number){
        return number % 2;
    }

    public void printer(int number){
        int result = getRemainder(number);
        if(result == 0){
            System.out.println("The number " + number + " is even");
        }else{
            System.out.println("The number " + number + " is odd");
        }

        if(number > 0){
            System.out.println("The number " + number + " is positive");
        }else if(number < 0){
            System.out.println("The number " + number + " is negative");
        }else{
            System.out.println("The number " + number + " is zero");
        }
    }
}
