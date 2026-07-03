package Exercise04.Main;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class Exercise04 {
    private int number;

    public Exercise04(int number){
        this.number = number;
    }

    public void printer(){
        System.out.println("The number provided is: " + number);
        System.out.println("The previous number is: " + (number-1));
        System.out.println("The following number is: " + (number+1));
    }
}
