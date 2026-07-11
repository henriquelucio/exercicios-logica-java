package Exercise13.Main;

//  13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Exercise13 {
    private String name;
    private int age;
    private boolean isLegalAge;

    public Exercise13(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        isLegalAge = AgeValidator.legalAgeValidator(age);
        System.out.println("\nThe person name is: " + name);
        System.out.println("The person age is: " + age);
        if(isLegalAge){
            System.out.println("The person is at legal age");
        }else{
            System.out.println("The person is not at legal age");
        }
    }
}
