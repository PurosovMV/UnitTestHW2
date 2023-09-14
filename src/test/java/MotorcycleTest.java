import HW2.Motorcycle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorcycleTest {

    Motorcycle motorcycle = new Motorcycle("kawasaki", "Z1000", 2022);

    /* - Проверить, что объект Motorcycle создается с 2-мя колесами.*/

    @Test
    void MotorcycleWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /*- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    (используя метод testDrive()).*/

    @Test
    void testDriveMotorcycle(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    /*- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    мотоцикл останавливается (speed = 0).*/

    @Test
    void parkMotorcycle() {
        motorcycle.testDrive();
        //System.out.println(moto.getSpeed());
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}

