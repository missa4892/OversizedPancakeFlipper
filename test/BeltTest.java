import org.junit.Assert;
import org.junit.Test;

public class BeltTest {

    @Test
    public void createBeltShouldCreateBeltWithSingleDigitAsFlipperSize() throws Exception {

        String inputStr = "++- 2";
        Belt resultingBelt = BeltCreator.createBelt(inputStr);

        Assert.assertEquals(resultingBelt.getFlipperSize(), 2);
        Assert.assertArrayEquals(resultingBelt.getPancakes(), new char[]{'+', '+', '-'});

    }

    @Test
    public void createBeltShouldCreateBeltWithDoubleDigitAsFlipperSize() throws Exception {

        String inputStr = "++- 10";
        Belt resultingBelt = BeltCreator.createBelt(inputStr);

        Assert.assertEquals(resultingBelt.getFlipperSize(), 10);
        Assert.assertArrayEquals(resultingBelt.getPancakes(), new char[]{'+', '+', '-'});

    }

}