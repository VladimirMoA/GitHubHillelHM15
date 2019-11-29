import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DrawTest {
    Draw draw;
    int[] array;

    @Before
    public void init() {
        array = new int[3];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
    }

    @Test
    public void drawTest() {
        assertTrue(draw.draw(array));
    }
}
