package exercises;

public class Terra implements Soare {
    public int atmosfera;

    public Terra(int atm) {
        atmosfera = atm;
    }

    Terra(Terra terraCopy) {
        terraCopy.atmosfera = this.atmosfera;
    }//https://www.geeksforgeeks.org/copy-constructor-in-java/

    public void luminaSolara() {
        System.out.println("Sunt metoda luminaSolara din clasa Terra");
    }

    public void functionOneFromTerra() {
        System.out.println("Sunt functionOneFromTerra");
    }

    public void functionTwoFromTerra() {
        System.out.println("Sunt functionTwoFromTerra");
    }
}
