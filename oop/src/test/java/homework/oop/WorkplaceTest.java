package homework.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Владислав on 14.10.2017.
 */
public class WorkplaceTest {
    @Test
    public void getSummaryPrice() {
        Workplace workplace = new Workplace();
        workplace.addStationery(new Pen(200, "pen"));
        workplace.addStationery(new Pen(150, "pen"));
        assertThat(350, is(workplace.getSummaryPrice()));
    }

}