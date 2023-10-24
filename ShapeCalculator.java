public class ShapeCalculator {
    public enum Shape {
        CIRCLE(3.0),  // The value in parentheses represents a default dimension (e.g., radius, side length, base)
        SQUARE(4.0),
        TRIANGLE(3.0);

        private double defaultDimension;

        Shape(double defaultDimension) {
            this.defaultDimension = defaultDimension;
        }

        public double calculateArea(double dimension) {
            switch (this) {
                case CIRCLE:
                    return Math.PI * dimension * dimension;
                case SQUARE:
                    return dimension * dimension;
                case TRIANGLE:
                    return (Math.sqrt(3) / 4) * dimension * dimension;
                default:
                    return 0.0;
            }
        }

        public double calculatePerimeter(double dimension) {
            switch (this) {
                case CIRCLE:
                    return 2 * Math.PI * dimension;
                case SQUARE:
                    return 4 * dimension;
                case TRIANGLE:
                    return 3 * dimension;
                default:
                    return 0.0;
            }
        }
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            double dimension = shape.defaultDimension; // You can change this to any desired dimension

            double area = shape.calculateArea(dimension);
            double perimeter = shape.calculatePerimeter(dimension);

            System.out.println("Shape: " + shape.name());
            System.out.println("Dimension: " + dimension);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();
        }
    }
}
