package exercises;

public class Implementare {
    public static void main(String[] args) {
        Mercur mercur = new Mercur(10);
        Terra terra = new Terra(5);

        mercur.functionOneFromMercur();
        mercur.functionTwoFromMercur();
        mercur.luminaSolara();
        System.out.println(mercur.temperatura);
        System.out.println();

        terra.functionOneFromTerra();
        terra.functionTwoFromTerra();
        terra.luminaSolara();
        System.out.println(terra.atmosfera);

        System.out.println("Obiectele copiate: \n");

        System.out.println("Obiectul mercur copiat:");
        Mercur mercurCopy = mercur;
        mercurCopy.temperatura = mercur.temperatura*2;
        mercurCopy.functionOneFromMercur();
        mercurCopy.functionTwoFromMercur();
        mercurCopy.luminaSolara();
        System.out.println(mercurCopy.temperatura);

        System.out.println();

        System.out.println("Obiectul terra copiat:");
        Terra terraCopy = terra;
        terraCopy.atmosfera = terra.atmosfera*2;
        terraCopy.functionOneFromTerra();
        terraCopy.functionTwoFromTerra();
        terraCopy.luminaSolara();
        System.out.println(terraCopy.atmosfera);
    }
}
