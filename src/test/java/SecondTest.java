//import org.junit.*;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//@RunWith(Parameterized.class)
//public class SecondTest {
//
//    private boolean have;
//    private int[] in;
//    Main main;
//
//    public SecondTest(boolean have, int[] in) {
//        this.have = have;
//        this.in = in;
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][]{
//                {true, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}},
//                {true, new int[]{1, 6, 3, 5, 4, 1}},
//                {false, new int[]{5, 6, 3, 5, 6, 1}},
//                {false, new int[]{7, 3, 2, 6, 3, 4}}
//        });
//    }
//
//    @Before
//    public void init() {
//        main = new Main();
//    }
//
//    @Test
//    public void testOneorFour() {
//        Assert.assertEquals(have, main.oneOrFour(in));
//    }
//}
