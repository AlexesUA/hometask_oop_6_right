package ua.edu.cbs.lms.hometask_oop_6_2.task_2;

public enum Animals {
    BEAR(12),TURTLES(129),LEOPARD(5);


    private int age;

    Animals(int age){
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("This animal is %1$s, his %2$s years old.",name(),age);
    }
}
