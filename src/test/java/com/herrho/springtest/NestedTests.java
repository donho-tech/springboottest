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
    class A_pricing_request_is_invalid {

        @Test
        void if_it_has_no_loadcurve() {
            assumeTrue(true == false, () -> "Assumption does not hold");
        }

        @Test
        void if_it_has_no_weatherstation() {
        }
    }

    @Nested
    @IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.ReplaceUnderscores.class)
    class A_year_is_a_leap_year {

        @Test
        void if_it_is_divisible_by_4_but_not_by_100() {
        }

        @ParameterizedTest(name = "Year {0} is a leap year.")
        @ValueSource(ints = { 2016, 2020, 2048 })
        void if_it_is_one_of_the_following_years(int year) {
        }
    }
}
