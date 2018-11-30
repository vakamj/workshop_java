package it.sevenbits;

import it.sevenbits.Polygon;
import it.sevenbits.PolygonFactory;
import it.sevenbits.exceptions.TriangleException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void perimeter() throws TriangleException {
        PolygonFactory factory = new PolygonFactory();
        Polygon polygon = factory.getTriangle(3, 5, 7);
        assertEquals(15, polygon.perimeter());
    }

    @Test(expected = TriangleException.class)
    public void triangleExceptionTest() throws TriangleException {
        PolygonFactory factory = new PolygonFactory();
        Polygon polygon = factory.getTriangle(3, 2, 6);

    }
}