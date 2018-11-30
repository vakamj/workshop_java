package it.sevenbits;

import it.sevenbits.exceptions.TriangleException;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PolygonFactoryTest {

    @Test
    public void getTriangle() throws TriangleException {
        Polygon triangle = new Triangle(3, 4, 5);
        PolygonFactory factory = new PolygonFactory();
        assertEquals(triangle.getClass(), factory.getTriangle(5, 4, 7).getClass());
    }

    @Test
    public void getQuadrilateral() {
        Polygon quadrilateral = new Quadrilateral(2, 3, 4, 5);
        PolygonFactory factory = new PolygonFactory();
        assertEquals(quadrilateral.getClass(), factory.getQuadrilateral(2, 4, 6, 8).getClass());
    }

    @Test
    public void getTriangleFromFile() throws TriangleException, IOException {
        List<Polygon> list = new ArrayList<>();
        PolygonFactory factory = new PolygonFactory();
        Polygon triangle = new Triangle(3, 4, 5);
        list = factory.getPolygonsFromFile(new File("src/test/java/resources/triangle.txt"));
        assertEquals(Triangle.class, list.get(0).getClass());
    }

    @Test
    public void getQuadrilateralFromFile() throws TriangleException, IOException {
        List<Polygon> list = new ArrayList<>();
        PolygonFactory factory = new PolygonFactory();
        Polygon quadrilateral = new Quadrilateral(3, 4, 5, 6);
        list = factory.getPolygonsFromFile(new File("src/test/java/resources/quadrilateral.txt"));
        assertEquals(Quadrilateral.class, list.get(0).getClass());
    }

    @Test(expected = IOException.class)
    public void getEmptyFile() throws TriangleException, IOException {
        List<Polygon> list = new ArrayList<>();
        PolygonFactory factory = new PolygonFactory();
        list = factory.getPolygonsFromFile(new File("src/test/java/resources/emptyFile.txt"));
    }

    @Test
    public void getTriangleAndQuadrilateralFromFile() throws TriangleException, IOException {
        List<Polygon> list = new ArrayList<>();
        PolygonFactory factory = new PolygonFactory();
        Polygon triangle = new Triangle(3, 4, 5);
        Polygon quadrilateral = new Quadrilateral(3, 4, 5, 6);
        list = factory.getPolygonsFromFile(new File("src/test/java/resources/severalFigures.txt"));
        assertEquals(Triangle.class, list.get(0).getClass());
        assertEquals(Quadrilateral.class, list.get(1).getClass());
    }

}