import org.junit.Assert;
import org.junit.Test;


// Kiểm thử bằng giá trị biên mạnh
public class MaxSaltTest1 {
    @Test
    public void testID1() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", -1);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void testID2() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 0);
        Assert.assertEquals(output, "3 grams");
    }

    @Test
    public void testID3() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 1);
        Assert.assertEquals(output, "3 grams");
    }

    @Test
    public void testID4() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 9);
        Assert.assertEquals(output, "6.5 grams");
    }

    @Test
    public void testID5() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 17);
        Assert.assertEquals(output, "8 grams");
    }

    @Test
    public void testID6() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 18);
        Assert.assertEquals(output, "8 grams");
    }

    @Test
    public void testID7() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 19);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void testID8() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", -1);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void testID9() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 0);
        Assert.assertEquals(output, "3.5 grams");
    }

    @Test
    public void testID10() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 1);
        Assert.assertEquals(output, "3.5 grams");
    }

    @Test
    public void testID11() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 9);
        Assert.assertEquals(output, "7 grams");
    }

    @Test
    public void testID12() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 17);
        Assert.assertEquals(output, "7 grams");
    }

    @Test
    public void testID13() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 18);
        Assert.assertEquals(output, "7 grams");
    }

    @Test
    public void testID14() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 19);
        Assert.assertEquals(output, "Invalid Input");
    }
}
