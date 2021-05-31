package pl.itacademy.tests;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UtilTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("This message you will see only 1 time BEFORE all the tests");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("This message you will see only 1 time AFTER all the tests");
    }

    @BeforeEach
    public void runBeforeEachTest() {
        System.out.println("This message you will see EVERY time BEFORE all the tests");
    }

    @AfterEach
    public void runAfterEachTest() {
        System.out.println("This message you will see EVERY time AFTER all the tests");
    }

    @Test
    public void returnSumOfTwoArguments() {
        int expectedResult = 4;
        int result = Util.add(2, 2);

//        assertTrue(expectedResult == result);
//        assertEquals(result, expectedResult);
//        assertEquals(expectedResult, result);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @Disabled
    public void returnSumOfTwoNegativeArguments() {
        int expectedResult = -7;
        int result = Util.add(-2, -5);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void throwsIllegalArgumentExceptionWhenProvideNullArguments() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Util.add(null, 5));
        assertThat(exception).hasMessage("Arguments can't be null!");
    }

}