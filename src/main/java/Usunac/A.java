package Usunac;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Usunac.Car;
class Car {
    public Car(String s, int n) {
        this.s = s;
        this.n = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return n == car.n &&
                Objects.equals(s, car.s);
    }

    @Override
    public int hashCode() {

        return Objects.hash(s, n);
    }

    String s;
    int n;
}

public class A {
    public static void main(String[] args) {
        System.out.println("A");

        List<String> lista = new ArrayList<String>();
        lista.add("Asia");
        lista.add("Basia");
        lista.add("Krzysiek");
        lista.add("Piotrek");


        lista.add(String.valueOf(new Car("Audi",1)));
        lista.add(String.valueOf(new Car("Opel",3)));
        lista.add(String.valueOf(new Car("BMW",5)));

        System.out.println(lista.indexOf("Audi"));

        Car car = new Car("BMW",5);
        System.out.println(lista.indexOf(car));


    }
}
