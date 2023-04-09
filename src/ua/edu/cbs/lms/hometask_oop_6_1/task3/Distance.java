package ua.edu.cbs.lms.hometask_oop_6_1.task3;

public class Distance {
    double distance;

    public Distance(double distance){
        this.distance = distance;
    }

    public void print(){
        System.out.println("Distance = " + distance);
    }



    public static class Converter{
        public static double convertFromMetersToKilometers(double distance){
            return distance/1000;
        }

        public static double convertFromKilometersToMiles(double distance){
            return distance/1000 * 0.621371;
        }

        public static double convertFromKilometersToFeet(double distance){
            return distance/1000 * 3280.839895;
        }
    }

}
