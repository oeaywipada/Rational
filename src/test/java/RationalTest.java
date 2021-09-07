import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test //annotation
    public void testAdd() {
        Rational x = new Rational();
        // 1/2 + 1/4 = 3/4
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testAdd2() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 1;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 1;
        x.add(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testMutiply() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testDevide() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        x.divide(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testEquals(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        x.equals(y);
        Assert.assertTrue(x.equals(y));
    }

    @Test
    public void testCompare() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertEquals(1, x.compareTo(y));
    }

    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Assert.assertEquals("3/2", x.toString());
    }
}
