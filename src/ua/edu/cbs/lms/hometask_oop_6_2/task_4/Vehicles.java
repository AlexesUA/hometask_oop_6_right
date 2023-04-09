package ua.edu.cbs.lms.hometask_oop_6_2.task_4;

public enum Vehicles {
    Audi(2000,AutoColors.DragonRed),
    Subaru(1400,AutoColors.SkyBlue),
    Renault(2300,AutoColors.SnowWhite),
    Lexus(10000,AutoColors.LightPurple);

    private int price;
    private AutoColors colour;

    Vehicles (int price, AutoColors color){
        this.price = price;
        this.colour = color;
    }

    public AutoColors getColor(){
        return colour;
    }

    @Override
    public String toString() {
        return String.format("Auto %1$s, colour %2$s price %3$s.",name(),colour,price);
    }
}
