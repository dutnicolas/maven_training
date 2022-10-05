package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void sum_of_13_and_17_equals_30(){
        int a = 13;
        int b = 17;

        int sum = Sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(sum).as("sum of 13 + 17").isEqualTo(30);
    }

    @Test
    void sum_of_negative_13_and_17_equals_4(){
        int a = -13;
        int b = 17;

        int sum = Sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(sum).as("sum of -13 + 17").isEqualTo(4);
    }

    @Test
    void sum_of_negative_13_and_negative_17_equals_negative_30(){
        int a = -13;
        int b = -17;

        int sum = Sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(sum).as("sum of -13 + -17").isEqualTo(-30);
    }

    @Test
    void product_of_5_and_3_equals_15(){
        int a = 5;
        int b = 3;

        int product = Sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(product).as("product of 5 * 3").isEqualTo(15);
    }

    @Test
    void product_of_negative_5_and_3_equals_negative_15(){
        int a = -5;
        int b = 3;

        int product = Sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(product).as("product of -5 * 3").isEqualTo(-15);
    }

    @Test
    void product_of_negative_5_and_negative_3_equals_15(){
        int a = -5;
        int b = -3;

        int product = Sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(product).as("product of -5 * -3").isEqualTo(15);
    }

    @Test
    void factorial_of_negative_5_should_produce_an_exception(){
        int n = -5;

        int factorial = Sample.fact(n);
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> Sample.fact(n));
    }

    @Test
    void factorial_of_0_equals_1(){
        int n = 0;

        int factorial = Sample.fact(n);
        Assertions.assertThat(factorial).as("factorial of 0").isEqualTo(1);
    }

    @Test
    void factorial_of_1_equals_1(){
        int n = 1;

        int factorial = Sample.fact(n);
        Assertions.assertThat(factorial).as("factorial of 1").isEqualTo(1);
    }

    @Test
    void factorial_of_8_equals_40320(){
        int n = 8;

        int factorial = Sample.fact(n);
        Assertions.assertThat(factorial).as("factorial of 8").isEqualTo(40320);
    }
}
