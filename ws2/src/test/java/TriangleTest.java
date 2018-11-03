import it.sevenbits.Triangle;
import it.sevenbits.TriangleException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void perimeter() throws TriangleException {
        Triangle triangle = new Triangle(3, 5, 7);
        assertEquals(15, triangle.perimeter());
    }

    @Test(expected = TriangleException.class)
    public void triangleExceptionTest() throws TriangleException {
        Triangle triangle = new Triangle(3, 2, 6);
    }
}