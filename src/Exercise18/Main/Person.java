package Exercise18.Main;

// 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

public class Person {
    private String name;
    private int height;
    private int growthFactorInCentimeters;

    public Person(String name, int height, int growthFactorInCentimeters){
        this.name = name;
        this.height = height;
        this.growthFactorInCentimeters = growthFactorInCentimeters;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setGrowthFactorInCentimeters(int growthFactorInCentimeters){
        this.growthFactorInCentimeters = growthFactorInCentimeters;
    }

    public int getGrowthFactorInCentimeters(){
        return growthFactorInCentimeters;
    }
}
