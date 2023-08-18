package tech.asmussen.vicehel;

/**
 * This class represents a dimension.
 */
public class Dimension {
    private double length;
    private double width;
    private double height;

    /**
     * Constructor for the Dimension class.
     *
     * @param length - The length of the dimension.
     * @param width  - The width of the dimension.
     * @param height - The height of the dimension.
     */
    public Dimension(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the length of the dimension.
     *
     * @return The length of the dimension.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the dimension.
     *
     * @param length - The length of the dimension.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Returns the width of the dimension.
     *
     * @return The width of the dimension.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the dimension.
     *
     * @param width - The width of the dimension.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the height of the dimension.
     *
     * @return The height of the dimension.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the dimension.
     *
     * @param height - The height of the dimension.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("%.2f x %.2f x %.2f", length, width, height);
    }
}
