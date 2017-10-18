package Fault4;

import org.junit.*;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class LUDecompositionTest_5 {

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

    @Test
    public void LUDecomposeTest01() {
        double[][] Matrix = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        double[][] L = {{1.0, 0.0, 0.0}, {0.1, 1.0, 0.0}, {0.6, 0.5, Double.NaN}};
        double[][] U = {{7.7, 8.8, 9.9}, {0.0, 0.9, 1.9}, {0.0, 0.0, 0.0}};
        double[][] P = {{0.0, 0.0, 1.0}, {1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}};
        double[][][] l = new double[][][]{L, U, P};
        assertEquals(format(LU.lu(Matrix)), new double[][][]{L, U, P});
    }


    @Test
    public void LUDecomposeTest02() {
        double[][] Matrix = {{0.0, 3.0, 4.0}, {0.0, 2.0, 5.0}, {0.0, 2.0, 14.0}};
        double[][] L = {{Double.NaN, 0.0, 0.0}, {Double.NaN, Double.NaN, 0.0}, {Double.NaN, Double.NaN, Double.NaN}};
        double[][] U = {{0.0, 3.0, 4.0}, {0.0, Double.NaN, Double.NaN}, {0.0, 0.0, Double.NaN}};
        double[][] P = {{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
        double[][][] l = new double[][][]{L, U, P};
        assertEquals(format(LU.lu(Matrix)), new double[][][]{L, U, P});
    }

    @Test
    public void LUDecomposeTest03() {
        double[][] Matrix = {{3.0, 1.0, 0.0}, {0.0, 0.0, 3.0}, {2.0, 1.0, 0.0}};
        double[][] L = {{1.0, 0.0, 0.0}, {0.7, 1.0, 0.0}, {0.0, 0.0, 1.0}};
        double[][] U = {{3.0, 1.0, 0.0}, {0.0, 0.3, 0.0}, {0.0, 0.0, 3.0}};
        double[][] P = {{1.0, 0.0, 0.0}, {0.0, 0.0, 1.0}, {0.0, 1.0, 0.0}};
        double[][][] l = new double[][][]{L, U, P};
        assertEquals(format(LU.lu(Matrix)), new double[][][]{L, U, P});
    }


    @Test
    public void LUDecomposeTest04() {
        double[][] Matrix = {{3.0, 8.0, 2.0, 1.0}, {5.0, 3.0, 2.0, 2.0}, {4.0, 3.0, 32.0, 1.0}, {5.0, 32.0, 1.0, 2.0}};
        double[][] L = {{1.0, 0.0, 0.0, 0.0}, {1.0, 1.0, 0.0, 0.0}, {0.8, 0.0, 1.0, 0.0}, {0.6, 0.2, 0.0, 1.0}};
        double[][] U = {{5.0, 3.0, 2.0, 2.0}, {0.0, 29.0, -1.0, 0.0}, {0.0, 0.0, 30.4, -0.6}, {0.0, 0.0, 0.0, -0.2}};
        double[][] P = {{0.0, 1.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 1.0}, {0.0, 0.0, 1.0, 0.0}, {1.0, 0.0, 0.0, 0.0}};
        double[][][] l = new double[][][]{L, U, P};
        assertEquals(new double[][][]{L, U, P}, format(LU.lu(Matrix)));
    }


    @Test
    public void LUDecomposeTest05() {
        double[][] Matrix = {{3.0, 2.9, 6.7}, {3.5, 2.5, 1.6}, {7.3, 8.2, 5.2}};
        double[][] L = {{1.0, 0.0, 0.0}, {0.4, 1.0, 0.0}, {0.5, 3.0, 1.0}};
        double[][] U = {{7.3, 8.2, 5.2}, {0.0, -0.5, 4.6}, {0.0, 0.0, -14.8}};
        double[][] P = {{0.0, 0.0, 1.0}, {1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}};
        double[][][] l = new double[][][]{L, U, P};
        assertEquals(new double[][][]{L, U, P}, format(LU.lu(Matrix)));
    }

}
