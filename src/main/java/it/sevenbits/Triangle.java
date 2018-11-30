package it.sevenbits;

import it.sevenbits.exceptions.TriangleException;

/**
 *
 */
public class Triangle implements Polygon {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    /**
     * constructor Triangle
     */
    private Triangle() {
    }

    /**
     * @param firstSide  first side
     * @param secondSide second side
     * @param thirdSide  third side
     * @throws TriangleException exception
     */
    public Triangle(final int firstSide, final int secondSide, final int thirdSide) throws TriangleException {
        if (((firstSide + secondSide) <= thirdSide) ||
                ((firstSide + thirdSide) <= secondSide) || ((thirdSide + secondSide) <= firstSide)) {
            throw new TriangleException("the triangle does not exist");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    /**
     * @return sb.toString
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("first side = ").append(firstSide).append("\n").append("second side = ").append(secondSide).append("\n").append("third side = ").append(thirdSide);
        return sb.toString();
    }

    /**
     * @return perimeter
     */
    @Override
    public int perimeter() {
        return firstSide + secondSide + thirdSide;
    }
}