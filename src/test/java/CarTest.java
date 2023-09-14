import HW2.Car;
import HW2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car = new Car("Ford", "Explorer", 2023);


    /*- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
        (используя оператор instanceof).*/

    @Test
    void instanceOf() {
        assertThat(car instanceof Vehicle);
    }

    /*- Проверить, что объект Car создается с 4-мя колесами.*/

    @Test
    void WheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /*- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).*/

    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /*- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    машина останавливается (speed = 0).*/

    @Test
    void parkCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
