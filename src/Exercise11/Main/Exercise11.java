package Exercise11.Main;

// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

public class Exercise11 {

    public static void print(String name, double[] gradesArray){
        System.out.println("The student name is: " + name);
        double averageGrade = Math.round(AverageCalculator.averageGradeCalculator(gradesArray)*10.0)/10.0;
        System.out.println("The average grade is: " + averageGrade);
        System.out.println("The student is " + Validator.isStudentApproved(averageGrade));
    }
}
