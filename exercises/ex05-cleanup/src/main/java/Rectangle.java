/** A rectangle with a width and height that can be scaled. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param width the initial width
   * @param height the initial height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Calculates the area of this rectangle.
   *
   * @return width multiplied by height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales both dimensions by the given factor.
   *
   * @param factor the multiplier applied to width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares this rectangle's area with another rectangle's area.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a strictly larger area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
