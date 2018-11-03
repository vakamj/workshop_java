package it.sevenbits;

/**
 *
 */
public final class Main {
    /**
     * main constructor
     */
    private Main() {
    }

    /**
     * @param args standard input arguments
     * @throws TriangleException exception for triangle
     */
    public static void main(final String[] args) throws TriangleException {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        System.out.println("Perimeter triangle = " + triangle.perimeter());
        Quadrilateral quadrilateral = new Quadrilateral(1, 2, 3, 4);
        System.out.println(quadrilateral.toString());
        System.out.println("Perimeter quadrilateral = " + quadrilateral.perimeter());
    }
}

