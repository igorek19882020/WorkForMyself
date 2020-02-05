package Minsk.Samost.R.SevenFebr2020;

import java.util.stream.DoubleStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.speed = 250;
        bmw.color = "red";

        Car lada = new Car();
        lada.speed = 130;
        lada.color = "grey";

        bmw.show();
        lada.show();

        double time1 = bmw.time();
        double time2 = lada.time();

        System.out.println(time1);
        System.out.println(time2);


    }
}
