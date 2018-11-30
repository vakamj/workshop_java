package it.sevenbits;

import it.sevenbits.exceptions.TriangleException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class PolygonFactory {
    /**
     * @param firstSide  first side
     * @param secondSide second side
     * @param thirdSide  third side
     * @return triangle
     * @throws TriangleException exceptions
     */
    public Triangle getTriangle(final int firstSide, final int secondSide, final int thirdSide) throws TriangleException {
        return new Triangle(firstSide, secondSide, thirdSide);
    }

    /**
     * @param firstSide  first side
     * @param secondSide second side
     * @param thirdSide  third side
     * @param fourthSide fourth side
     * @return quadrilateral
     */
    public Quadrilateral getQuadrilateral(final int firstSide, final int secondSide, final int thirdSide, final int fourthSide) {
        return new Quadrilateral(firstSide, secondSide, thirdSide, fourthSide);
    }

    /**
     * @param file file
     * @return triangle, quadrilateral
     * @throws IOException       exceptions
     * @throws TriangleException exceptions
     */
    public List getPolygonsFromFile(final File file) throws IOException, TriangleException {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            if (!br.ready()) {
                throw new IOException("file not found");
            }
            String line;
            List<String> list = new ArrayList<>();
            List<Polygon> polygons = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                for (String segment : line.split(" ")) {
                    list.add(segment);
                }
                switch (list.size()) {
                    case 3:
                        Polygon triangle = getTriangle(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)));
                        polygons.add(triangle);
                        list.clear();
                        break;
                    case 4:
                        Polygon quadrilateral = getQuadrilateral(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3)));
                        polygons.add(quadrilateral);
                        list.clear();
                        break;
                    default:
                        System.out.println("such a polygon does not exist");
                        break;
                }
            }
            return polygons;
        }
    }
}