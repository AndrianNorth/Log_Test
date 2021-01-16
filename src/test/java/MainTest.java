import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MainTest {

    private int[] out;
    private int[] in;
    Main main;

    public MainTest(int[] out, int[] in) {
        this.out = out;
        this.in = in;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}},
                {new int[]{1}, new int[]{1, 6, 3, 5, 4, 1}},
                {new int[]{6, 3, 5, 6, 1}, new int[]{4, 6, 3, 5, 6, 1}},
                {new int[]{7, 3, 2, 6, 3, 1}, new int[]{7, 3, 2, 6, 3, 1}}
        });
    }

    @Before
    public void init() {
        main = new Main();
    }

    @Test
    public void testCutAfterFour() {
        Assert.assertArrayEquals(out, main.cutAfterFour(in));
    }

}

