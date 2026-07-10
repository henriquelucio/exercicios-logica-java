package Exercise12.Main;

//  12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

// Tabela de Código de Condições de Pagamento

// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.math.BigDecimal;

public class Exercise12 {
    public static void print(BigDecimal value, int paymentCode){
        PaymentType paymentType = PaymentType.returnPaymentType(paymentCode);
        BigDecimal valueAfterTax = paymentType.taxCalculator(value);

        System.out.println("\nThe payment method choose is: " + paymentType.getMessageType());
        System.out.println("The value of product before tax is: " + value);
        System.out.println("The value of product after tax is: " + valueAfterTax);
    }
}
