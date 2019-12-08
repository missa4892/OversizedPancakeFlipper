import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlipperTest {

    @Test
    public void shouldReturnOneWhenArraySizeIsFlipperSize() throws Exception {
        Belt belt = new Belt(new char[] {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 10);

        int result = Flipper.flip(belt);
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnNegativeOneWhenImpossibleToFlipAll() throws Exception {
        Belt belt = new Belt(new char[] {'-', '-', '-', '-', '-', '-', '-', '-', '-', '+'}, 10);

        int result = Flipper.flip(belt);
        assertEquals(-1, result);
    }


}