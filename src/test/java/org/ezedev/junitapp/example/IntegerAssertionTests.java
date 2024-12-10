package org.ezedev.junitapp.example;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class IntegerAssertionTests {

    @Test
    void testIntegersAreEqual() {
        Integer number1 = 42;
        Integer number2 = 42;

        assertThat(number1).isEqualTo(number2);
    }

    @Test
    void testIntegersAreNotEqual() {
        Integer number1 = 42;
        Integer number2 = 24;

        assertThat(number1).isNotEqualTo(number2);
    }
}
