package ua.edu.cbs.lms.hometask_oop_6_1.task3;

public class Main {
    public static void main(String[] args) {


        Distance distance = new Distance(1000);

        distance.print();

        System.out.println("In kilometers = " + Distance.Converter.convertFromMetersToKilometers(distance.distance));
        System.out.println("In miles = " + Distance.Converter.convertFromKilometersToMiles(distance.distance));
        System.out.println("In feet = " + Distance.Converter.convertFromKilometersToFeet(distance.distance));
    }
}
