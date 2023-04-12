package day07_Junit;

import org.junit.*;

public class C04_BeforeClassAfterClass {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Classtaki Tum testlerden once calisir");

    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Classtaki Tum testlerden sonra calisir");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her test modundan once");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her test modundan sonra");

    }

    @Test
    public void test01() {
        System.out.println("ilk test");
    }

    @Test
    public void test02() {
        System.out.println("ikinci test");
    }
}
