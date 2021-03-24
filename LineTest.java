import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void TestLinePoint() {
        assertEquals(40,Line.linePoint(2,4,5));
        assertNotEquals(10,Line.linePoint(2,4,5));
    }

    @Test
    public void calculate() {
        int[] arr = {6, 3, 5, 10, 2, 7, 1, 8};

        Line.calculate(2,arr,3);
        for (int i = 0; i < arr.length - 1; i++)
            assertTrue(arr[i] <= arr[i + 1]);

        assertEquals(arr[0], Line.calculate(2,arr,3));
        assertEquals(arr[1], Line.calculate(2,arr,3));

    }
}