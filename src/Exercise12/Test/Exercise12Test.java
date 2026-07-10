package Exercise12.Test;

//  12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

// Tabela de Código de Condições de Pagamento

// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import Exercise12.Main.Exercise12;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise12Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProvide the an product value and the payment type, the program will calculate the final value based on:\n");
        System.out.println("Payment '1': upfront with cash or 'Pix' receives 15% discount");
        System.out.println("Payment '2': upfront with credit card receives 10% discount");
        System.out.println("Payment '3': in installments, up to 2 months, no discounts or tax at the product");
        System.out.println("Payment '4': in installments, 3 months or more, receives 10% of fees");

        System.out.println("\nProvide the product value:");
        BigDecimal value = input.nextBigDecimal();

        System.out.println("\nProvide the payment type (choose between 1 to 4 numbers as show above:");
        int paymentType = input.nextInt();

        Exercise12.print(value, paymentType);
    }
}
