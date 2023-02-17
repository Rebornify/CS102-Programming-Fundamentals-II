public class WebColor {
    private int red;
    private int green;
    private int blue;

    public WebColor(int red, int green, int blue) {
        if (red < 0 || red > 255) {
            throw new IllegalArgumentException("red is invalid");
        }
        if (green < 0 || green > 255) {
            throw new IllegalArgumentException("green is invalid");
        }
        if (blue < 0 || blue > 255) {
            throw new IllegalArgumentException("blue is invalid");
        }

        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public WebColor(String hexString) {
        if (!hexString.startsWith("#") || hexString.length() != 7) {
            throw new IllegalArgumentException("invalid hexstring");
        }

        try {
            red = Integer.parseInt(hexString.substring(1, 3), 16);
            green = Integer.parseInt(hexString.substring(3, 5), 16);
            blue = Integer.parseInt(hexString.substring(5), 16);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("invalid hexstring");
        }
    }

    private String getHex(int color) {
        String result = Integer.toHexString(color);

        if (result.length() == 1) {
            result = "0" + result;
        }

        return result.toUpperCase();
    }

    public WebColor add(WebColor another) {
        int newRed = (red * another.red) / 255;
        int newGreen = (green * another.green) / 255;
        int newBlue = (blue * another.blue) / 255;

        return new WebColor(newRed, newGreen, newBlue);
    }

    public String toHexString() {
        return "#" + getHex(red) + getHex(green) + getHex(blue);
    }

    public String toString() {
        return String.format("%d:%d:%d", red, green, blue);
    }
}
