package math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Mathematics Operations Test")
public class mathTest {

    @Nested
    class CalculatorTest {
        private Calculator calculator;

        @BeforeEach
        void setUp() {
            calculator = new Calculator();
            System.out.println("setUp method calling...");

        }

        @AfterEach
        void tearDown() {
            calculator = null;
            System.out.println("tearDown method calling...");

        }

        @Test
        void addTest() {
            int addition = calculator.addNumbers(2,3);
            assertEquals(5, addition);
            System.out.println("addTest method calling");
        }

        @Test
        void subtractTest() {

            int subtraction = calculator.subtractNumbers(3,2);

            assertEquals(1, subtraction);
            System.out.println("subtractTest method calling");

        }

        @Test
        void multiplyTest() {

            int multiplication = calculator.multiplyNumbers(2,3);

            assertEquals(6, multiplication);
            System.out.println("multiplyTest method calling");

        }

        @Test
        void divideTest() {

            int division = calculator.divideNumbers(10,5);

            assertEquals(2, division);
            System.out.println("divideTest method calling");

        }
    }

    @Nested
    class FactorialTest {
        private Factorial factorial;

        @BeforeEach
        void setUp() {
            factorial = new Factorial();
            System.out.println("setUp method calling...");

        }

        @AfterEach
        void tearDown() {
            factorial = null;
            System.out.println("tearDown method calling...");

        }

        @Test
        void factorialTest() {
            int factorialNumber = factorial.factorial(5);
            assertEquals(120, factorialNumber);
            System.out.println("factorialTest method calling");
        }

    }

    @Nested
    class FibonacciTest {
        private Fibonacci fibonacci;

        @BeforeEach
        void setUp() {
            fibonacci = new Fibonacci();
            System.out.println("setUp method calling...");

        }

        @AfterEach
        void tearDown() {
            fibonacci = null;
            System.out.println("tearDown method calling...");

        }

        @Test
        void fibonacciTest(){
            int fibonacciNumber = fibonacci.fibonacci(8);
            assertEquals(21, fibonacciNumber);
            System.out.println("fibonacciTest method calling");
        }

    }

    @Nested
    class VolumetricBodiesTest{
        private static VolumetricBodies volumetricBodies;

        @BeforeAll
        static void setUpBeforeClass(){
            volumetricBodies = new VolumetricBodies();
            System.out.println("setUp method calling...");

        }

        @AfterAll
        static void tearDownAfterClass() {
            volumetricBodies = null;
            System.out.println("tearDown method calling...");
        }

//        @BeforeEach
//        void setUp(){
//            volumetricBodies = new VolumetricBodies();
//            System.out.println("setUp method calling...");
//
//        }
//
//        @AfterEach
//        void tearDown() {
//            volumetricBodies = null;
//            System.out.println("tearDown method calling...");
//        }

        @Test
        void volumeOfTheCubeTest() {
            double calculateTheVolumeOfTheCube = volumetricBodies.volumeOfTheCube(3);
            assertEquals(27, calculateTheVolumeOfTheCube);
            System.out.println("volumeOfTheCubeTest method calling");
        }

        @Test
        void surfaceAreaOfTheCubeTest() {
            double calculateTheSurfaceAreaOfTheCube = volumetricBodies.surfaceAreaOfTheCube(3);
            assertEquals(54, calculateTheSurfaceAreaOfTheCube);
            System.out.println("surfaceAreaOfTheCubeTest method calling");
        }

        @Test
        void volumeOfTheSphereTest() {
            double calculateTheVolumeOfTheSphere=volumetricBodies.volumeofTheSphere(7);
            assertEquals(1437, calculateTheVolumeOfTheSphere);
            System.out.println("volumeOfTheSphereTest method calling");
        }

        @Test
        void surfaceAreaOfTheSphereTest() {
            double calculateTheSurfaceAreaOfTheSphere=volumetricBodies.surfaceAreaOfTheSphere(7);
            assertEquals(616, calculateTheSurfaceAreaOfTheSphere);
            System.out.println("surfaceAreaOfTheSphereTest method calling");
        }

        @Test
        void volumeOfTheCylinderTest() {
            double calculateTheVolumeOfTheCylinder=volumetricBodies.volumeOfTheCylinder(4,3);
            assertEquals(113, calculateTheVolumeOfTheCylinder);
            System.out.println("volumeOfTheCylinderTest method calling");
        }

        @Test
        void surfaceAreaOfTheCylinderTest() {
            double calculateTheSurfaceAreaOfTheCylinder=volumetricBodies.surfaceAreaOfTheCylinder(4,3);
            assertEquals(132, calculateTheSurfaceAreaOfTheCylinder);
            System.out.println("surfaceAreaOfTheCylinderTest method calling");
        }

        @Test
        void volumeOfTheConeTest() {
            double calculateTheVolumeOfTheCone=volumetricBodies.volumeOfTheCone(5,2);
            assertEquals(21, calculateTheVolumeOfTheCone);
            System.out.println("volumeOfTheConeTest method calling");
        }

        @Test
        void surfaceAreaOfTheConeTest() {
            double calculateTheSurfaceAreaOfTheCone=volumetricBodies.surfaceAreaOfTheCone(5,2);
            assertEquals(46, calculateTheSurfaceAreaOfTheCone);
            System.out.println("surfaceAreaOfTheConeTest method calling");
        }

    }

}
