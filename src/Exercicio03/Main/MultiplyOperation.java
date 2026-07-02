package Exercicio03.Main;

public class MultiplyOperation implements MathOperation{
    @Override
    public int executeOperation(int valueA, int valueB) {
        return valueA * valueB;
    }

    @Override
    public String getDescription() {
        return "Multiply";
    }
}
