package Exercicio03.Main;

public class SumOperation implements MathOperation{
    @Override
    public int executeOperation(int valueA, int valueB) {
        return valueA + valueB;
    }
}
