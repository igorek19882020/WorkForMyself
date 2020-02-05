package Minsk.Samost.R.SevenFebr2020;

import java.util.Scanner;

public class Car {
     int speed;
    String color;



public void show (){
    System.out.println("Speed - "+ speed +" Color - "+color);
}

public double time(){
    double length=0 ;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter length ");
    if(sc.hasNextDouble()){
         length = sc.nextDouble();}
    else{
        System.out.println("Error");
    }
    return length/speed;
    }
}

