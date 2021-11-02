import org.junit.Assert;
import org.junit.Test;

// Kiểm thử dòng điều khiển với độ đo C2
public class MaxSaltTest3 {
    @Test
    public void testID1() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", -1);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void testID2() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 1);
        Assert.assertEquals(output, "3 grams");
    }

    @Test
    public void testID3() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 4);
        Assert.assertEquals(output, "4 grams");
    }

    @Test
    public void testID4() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 6);
        Assert.assertEquals(output, "5 grams");
    }

    @Test
    public void testID5() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 10);
        Assert.assertEquals(output, "6.5 grams");
    }

    @Test
    public void testID6() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("M", 13);
        Assert.assertEquals(output, "8 grams");
    }

    @Test
    public void testID7() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 20);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void testID8() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 2);
        Assert.assertEquals(output, "3.5 grams");
    }

    @Test
    public void testID9() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 4);
        Assert.assertEquals(output, "4.5 grams");
    }

    @Test
    public void testID10() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 7);
        Assert.assertEquals(output, "5.5 grams");
    }

    @Test
    public void testID11() {
        MaxSalt test = new MaxSalt();
        String output = test.maxAmountOfSalt("F", 16);
        Assert.assertEquals(output, "7 grams");
    }
}
