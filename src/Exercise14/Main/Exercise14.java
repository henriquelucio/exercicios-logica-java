package Exercise14.Main;

public class Exercise14 {
    private int valueA;
    private int valueB;
    private int tempValueA;
    private int tempValueB;

    public Exercise14(int valueA, int valueB){
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public void print(){
        System.out.println("\nThe original value of A is: " + valueA);
        System.out.println("The original value of B is: " + valueB);

        valueFlipper(valueA, valueB);

        System.out.println("The new value of A is: " + valueA);
        System.out.println("The new value of B is: " + valueB);
    }

    private void valueFlipper(int valueA, int valueB){
        tempValueA = valueA;
        tempValueB = valueB;

        System.out.println("\n...Flipping the values...\n");

        this.valueA = tempValueB;
        this.valueB = tempValueA;
    }
}
