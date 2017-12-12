public class CarDriver {
    public static void main(String[] args){
        Car myCar = new Car();
        Car hisCar = new Car("Grey", 150, 2.0, "Honda");
        Car herCar = new Car("White", 300, 3.0, "Nissan");
        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        myCar.setColor("White");myCar.setHorsePower(550);myCar.setEngineSize(4.5);
        hisCar.setColor("Red");hisCar.setHorsePower(750);hisCar.setEngineSize(5.0);
        herCar.setColor("Pink");herCar.setHorsePower(400);herCar.setEngineSize(3.4);

        System.out.println("My Car: " + myCar.getColor()+ " " + myCar.getHorsePower());
        System.out.println("His Car: " + hisCar.getColor()+ " " + hisCar.getHorsePower());
        System.out.println("Her Car: " + herCar.getColor()+ " " + herCar.getHorsePower());
    }
}
