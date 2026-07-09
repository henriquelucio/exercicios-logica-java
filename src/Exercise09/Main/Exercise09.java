package Exercise09.Main;

// 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:

// Fórmula do IMC = peso/(altura)²

// Tabela Condições IMC:
// Abaixo de 18,5   | Abaixo do peso
// Entre 18,6 e 24,9 | Peso ideal (parabéns)
// Entre 25,0 e 29,9 | Levemente acima do peso
// Entre 30,0 e 34,9 | Obesidade grau I
// Entre 35,0 e 39,9 | Obesidade grau II (severa)
// Maior ou igual a 40 | Obesidade grau III (mórbida)

public class Exercise09 {
    private double height;
    private double weight;
    private double calculationResult;
    private String BMIMessage;

    public Exercise09(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public void print(){
        calculationResult = Calculator.BMICalculator(height, weight);
        BMIMessage = TypeBMI.typeBMIOnResult(calculationResult);;
        System.out.println("Your result is: " + calculationResult + "\n" + BMIMessage);
    }
}
