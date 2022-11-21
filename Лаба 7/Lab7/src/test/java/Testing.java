import org.example.IncorrectFileNameException;
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Testing {
    @Test
    public void TestSum() throws Exception {
        assertEquals(4,Main.calculate(2,2,'+'),0);
    }
    @Test
    public void TestDifference() throws Exception {
        assertEquals(3,Main.calculate(5,2,'-'),0);
    }
    @Test
    public void TestDivision() throws Exception {
        assertEquals(1,Main.calculate(2,2,'/'),0);
    }
    @Test
    public void TestMultiplication() throws Exception {
        assertEquals(12,Main.calculate(6,2,'*'),0);
    }
    public void TestSumWithNumpointer() throws Exception {
        assertEquals(2.7,Main.calculate(2.5,2,'+'),0);
    }
    @Test
    public void TestDifferenceWithNumpointer() throws Exception {
        assertEquals(3.5,Main.calculate(5.5,2,'-'),0);
    }
    @Test
    public void TestDivisionWithNumpointer() throws Exception {
        assertEquals(1.25,Main.calculate(2.5,2,'/'),0);
    }
    @Test
    public void TestMultiplicationWithNumpointer() throws Exception {
        assertEquals(6.25,Main.calculate(2.5,2.5,'*'),0);
    }
    @Test
    public void TestIncorrectOperation() throws Exception {
        assertThrows(Exception.class, ()->{Main.calculate(2,7,'$');});
    }
    @Test
    public void TestDivisionByZero() throws Exception
    {
        assertThrows(Exception.class, ()->{Main.calculate(2,0,'/');});
    }
}

