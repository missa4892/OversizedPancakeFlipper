import java.util.Arrays;

public class Belt {

    char[] pancakes;
    int flipperSize;

    public Belt(char[] pancakes, int flipperSize) {
        this.pancakes = pancakes;
        this.flipperSize = flipperSize;
    }

    public char[] getPancakes() {
        return pancakes;
    }

    public void setPancakes(char[] pancakes) {
        this.pancakes = pancakes;
    }

    public int getFlipperSize() {
        return flipperSize;
    }

    public void setFlipperSize(int flipperSize) {
        this.flipperSize = flipperSize;
    }
}
