package exercises;

public class Mercur implements Soare {
    public int temperatura;

    public Mercur(int temp) {
        temperatura = temp;
    }

    Mercur(Mercur mercurCopy) {
        mercurCopy.temperatura = this.temperatura;
    } //https://www.geeksforgeeks.org/copy-constructor-in-java/

    public void luminaSolara() {
        System.out.println("Sunt metoda luminaSolara din clasa Mercur");
    }

    public void functionOneFromMercur() {
        System.out.println("Sunt functionOneFromMercur");
    }

    public void functionTwoFromMercur() {
        System.out.println("Sunt functionTwoFromMercur");
    }
}
