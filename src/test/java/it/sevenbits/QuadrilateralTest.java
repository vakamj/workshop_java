package it.sevenbits;

import it.sevenbits.Polygon;
import it.sevenbits.PolygonFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadrilateralTest {

    @Test
    public void perimeter() {
        PolygonFactory factory = new PolygonFactory();
        Polygon polygon = factory.getQuadrilateral(3, 5, 7, 5);
        assertEquals(20, polygon.perimeter());
    }
}