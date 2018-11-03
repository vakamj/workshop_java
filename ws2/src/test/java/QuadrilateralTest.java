import it.sevenbits.Quadrilateral;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadrilateralTest {

    @Test
    public void perimeter() {
        Quadrilateral quadrilateral = new Quadrilateral(3, 5, 7, 5);
        assertEquals(20, quadrilateral.perimeter());
    }
}