package it.sevenbits;

/**
 *
 */
public class Quadrilateral implements Polygon {
    private int firstSide;
    private int secondSide;
    private int thirdSide;
    private int fourthSide;

    /**
     * constructor Quadrilateral
     */
    private Quadrilateral() {
    }

    /**
     * @param firstSide  first side
     * @param secondSide second side
     * @param thirdSide  third side
     * @param fourthSide fourth side
     */
    public Quadrilateral(final int firstSide, final int secondSide, final int thirdSide, final int fourthSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }

    /**
     * @return sb.toString
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("first side = ").append(firstSide).append("\n").append("second side = ").append(secondSide)
                .append("\n").append("third side = ").append(thirdSide).append("\n").append("fourth side = ").append(fourthSide);
        return sb.toString();
    }

    /**
     * @return perimeter
     */
    @Override
    public int perimeter() {
        return firstSide + secondSide + thirdSide + fourthSide;
    }
}