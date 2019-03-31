package us;

interface MojInterface {
    void wyswietlTest();
}

abstract class KlasaAbstrakcyjna {
    abstract void showText();
    int b = 22;
}

public class Klasa {
    public static void main(String[] args) {
        MojInterface mojInterface = new MojInterface() {
            @Override
            public void wyswietlTest() {
                System.out.println("ABC");
            }
        };
        mojInterface.wyswietlTest();

        MojInterface mojInterface1 = new MojInterface() {
            @Override
            public void wyswietlTest() {
                System.out.println("a");
            }
        };
        KlasaAbstrakcyjna klasaAbstrakcyjna = new KlasaAbstrakcyjna() {
            @Override
            void showText() {
                System.out.println("Klasa Abstrakcyjna");
            }
        };
        klasaAbstrakcyjna.b =  33;
        klasaAbstrakcyjna.b = klasaAbstrakcyjna.b  + klasaAbstrakcyjna.b;
        System.out.println(klasaAbstrakcyjna.b);
        klasaAbstrakcyjna.showText();
        System.out.println(mojInterface.getClass());
        Klasa klasa = new Klasa();
        klasa.azs("abc");

        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("a");
            }
        };
    }
    public void azs(String... args){
        System.out.println(args);
    }
}


