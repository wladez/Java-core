package homework.oop;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 14.10.2017.
 */
public class AtomicBoatTest {
    @Test
    public void startBoat() {
        AtomicBoat boat = new AtomicBoat("Petr I");
        boat.startBoat();
    }

}