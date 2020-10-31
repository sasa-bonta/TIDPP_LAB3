//package Triangles;
//
//import junit.framework.TestCase;
//import org.junit.Assert;
//import org.junit.rules.ExpectedException;
//
//public class TriangleTest extends TestCase {
//
//    public TriangleTest(String name) {
//        super(name);
//    }
//
//    // On verifie le constructeur
//
//    public void testConstructor1() throws InvalidTriangleException {
//        Triangle tr = new Triangle(5, 1, 2);
//    }
//    public void testConstructor2() throws InvalidTriangleException {
//        Triangle tr = new Triangle(1, 5, 2);
//    }
//    public void testConstructor3() throws InvalidTriangleException {
//        Triangle tr = new Triangle(2, 5, 1);
//    }
//    public void testConstructor4() throws InvalidTriangleException {
//        Triangle tr = new Triangle(5, 0, 2);
//    }
//    public void testConstructor5() throws InvalidTriangleException {
//        Triangle tr = new Triangle(0, 5, 2);
//    }
//    public void testConstructor6() throws InvalidTriangleException {
//        Triangle tr = new Triangle(2, 5, 0);
//    }
//    public void testConstructor7() throws InvalidTriangleException {
//        Triangle tr = new Triangle(0, 0, 0);
//    }
//    public void testConstructor8() throws InvalidTriangleException {
//        Triangle tr = new Triangle(5, -5, 2);
//    }
//    public void testConstructor9() throws InvalidTriangleException {
//        Triangle tr = new Triangle(-5, 5, 2);
//    }
//    public void testConstructor10() throws InvalidTriangleException {
//        Triangle tr = new Triangle(2, 5, -5);
//    }
//    public void testConstructor11() throws InvalidTriangleException {
//        Triangle tr = new Triangle(-4,-5,-3);
//    }
//
//    // On verifie la methode isScalene
//
//    public void testIsScalene1() throws InvalidTriangleException {
//        Boolean expected = false;
//        Triangle tr = new Triangle(3,4,3);
//        Boolean ourTr = tr.isScalene();
//        assertEquals(expected,ourTr);
//    }
//
//    public void testIsScalene2() throws InvalidTriangleException {
//        Boolean expected = false;
//        Triangle tr = new Triangle(3,3,3);
//        Boolean ourTr = tr.isScalene();
//        assertEquals(expected,ourTr);
//    }
//
//    // On verifie la methode isIsosceles
//
//    public void testIsIsosceles1() throws InvalidTriangleException {
//        Boolean expected = false;
//        Triangle tr = new Triangle(3,3,3);
//        Boolean ourTr = tr.isIsosceles();
//        assertEquals(expected,ourTr);
//    }
//    public void testIsIsosceles2() throws InvalidTriangleException {
//        Boolean expected = false;
//        Triangle tr = new Triangle(5,4,3);
//        Boolean ourTr = tr.isIsosceles();
//        assertEquals(expected,ourTr);
//    }
//
//    // On verifie la methode isEquilateral
//
//    public void testIsEquilateral1() throws InvalidTriangleException {
//        Boolean expected = false;
//        Triangle tr = new Triangle(5,4,3);
//        Boolean ourTr = tr.isEquilateral();
//        assertEquals(expected,ourTr);
//    }
//    public void testIsEquilateral2() throws InvalidTriangleException {
//        Boolean expected = false;
//        Triangle tr = new Triangle(5,4,5);
//        Boolean ourTr = tr.isEquilateral();
//        assertEquals(expected,ourTr);
//    }
//
//}
