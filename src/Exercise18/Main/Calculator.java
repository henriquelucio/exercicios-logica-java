package Exercise18.Main;

public class Calculator {

    public void calculateYearsToGetHigher(Person person1, Person person2){
        int count = 0;
        while(person1.getHeight() >= person2.getHeight()){
            count++;
            System.out.println("\nYear: " + count);

            person1.setHeight(person1.getHeight()+person1.getGrowthFactorInCentimeters());
            person2.setHeight(person2.getHeight()+person2.getGrowthFactorInCentimeters());
            System.out.println(person1.getName() + " height: " + person1.getHeight());
            System.out.println(person2.getName() + " height: " + person2.getHeight());
        }
        System.out.println("\nIt took " + count + " years.");
    }
}
