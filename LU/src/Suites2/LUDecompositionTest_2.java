package Suites2;

import org.junit.*;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class LUDecompositionTest_2 {

    private final LUDecomposition LU = new LUDecomposition();

    //Method for getting the rounded value of double
    static double[][][] format(double[][][] m) {
        double[][][] temp = m;
        DecimalFormat df = new DecimalFormat("#.0");
        for (int i = 0; i < m.length; i++) {
            double[][] a = m[i];
            for (int j = 0; j < a.length; j++) {
                double[] b = a[j];
                for (int k = 0; k < b.length; k++) {
                    if (!Double.isNaN(b[k]) && !Double.isInfinite(b[k])) {
                        b[k] = Double.valueOf((df.format(b[k])));
                    }
                }
            }
        }
        return temp;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test(expected = AssertionError.class)
    public void LUDecomposeTest01() {
        double[][] Matrix = {{3.0, 1.0, 0.0}, {0.0, 3.0, 3.0}};
        double[][] L = {{1.0, 0.0}, {0.0, 1.0}};
        double[][] U = {{3.0, 1.0, 0.0}, {0.0, 3.0, 3.0}};
        double[][] P = {{1.0, 0.0}, {0.0, 1.0}};
        double[][][] l = new double[][][]{L, U, P};
        assertEquals(format(LU.lu(Matrix)), new double[][][]{L, U, P});
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void LUDecomposeTest02() {
        double[][] Matrix = {{12.3, 3.2, 4.2, 9.0}, {7.2, 4.1, 9.0, 2.0}, {6.4, 3.2, 7.0}};
        double[][] L = {{1.0, 0.0, 0.0}, {0.5, Double.NaN, 0.0}, {0.8, Double.NaN, Double.NaN}};
        double[][] U = {{4.0, 8.0, 12.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, Double.NaN}};
        double[][] P = {{0.0, 0.0, 1.0}, {1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}};
        double[][][] l = new double[][][]{L, U, P};
        assertEquals(new double[][][]{L, U, P}, format(LU.lu(Matrix)));
    }


}
