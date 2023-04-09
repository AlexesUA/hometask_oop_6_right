package ua.edu.cbs.lms.hometask_oop_6_2.task_4;

public class Main {
    public static void main(String[] args) {
        for (Vehicles vehicle: Vehicles.values()){
            System.out.println(vehicle);
            System.out.println("Colour only: " + vehicle.getColor());
        }
    }
}
