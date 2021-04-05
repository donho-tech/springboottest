package com.herrho.springtest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Demonstrates JUnit Jupiter features: nested tests, name generation and parameterized tests
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class NestedTests {

    @Nested
    class An_employee_is_valid {

        @Test
        void if_they_have_a_name() {
            assumeTrue(true == false, () -> "Assumption does not hold");
        }

        @Test
        void if_they_have_an_adress() {
        }
    }

    @Nested
    @IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.ReplaceUnderscores.class)
    class A_department_is_valid {

        @Test
        void if_it_has_employees() {
        }

        @ParameterizedTest(name = "Number of employees: {0}")
        @ValueSource(ints = {1, 10, 100})
        void if_it_has_more_than_0_employees(int number) {
        }
    }
}
