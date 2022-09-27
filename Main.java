import model.*;
import service.CarService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.addCar(new Cars("Mercedes", "CMD213", new Wheels(), new Motor(), new TypeOfCar(), new Battery(), new TypeOfGearBox(), new TypeOfFuel(),
                List.of(new Person("Vasea", "Vazis")), new Light(ColorOfLight.WHITE, 123.5), 12, 43, 23.5));

        carService.addCar(new Cars("BMW", "CMD213", new Wheels(), new Motor(), new TypeOfCar(), new Battery(), new TypeOfGearBox(), new TypeOfFuel(),
                List.of(new Person("Vasea", "Vazis")), new Light(ColorOfLight.WHITE, 123.5), 12, 43, 23.5));

        carService.showCars();
    }
}