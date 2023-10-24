public class ColorExample {
    // ! Custom enum representing colors with RGB values
    public enum Color {
        RED(150, 0, 0),
        GREEN(0, 150, 0),
        BLUE(0, 0, 150),
        YELLOW(150, 150, 0),
        CYAN(0, 150, 150),
        WHITE(150, 0, 150);

        private int red;
        private int green;
        private int blue;

        Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

       
        public void displayRGB() {
            System.out.println(this.name() + " - R: " + red + ", G: " + green + ", B: " + blue);
        }
    }

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            color.displayRGB();
        }
    }
}
