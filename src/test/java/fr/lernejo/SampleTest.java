package fr.lernejo;

import fr.lernejo.Sample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class SampleTest {

    @ParameterizedTest
    @CsvSource({
        "ADD, 1, -2, -1",
        "ADD,1, 999, 1000",
        "MULT, 10, 9, 90",
        "MULT, 1, 1, 1"
    })
    void add_mult_behave_as_expected(Sample.Operation test_nature, int a, int b, int expected) {

        //When
        int result = new Sample().op(test_nature, a, b);

        //Then
        assertThat(result).isEqualTo(expected);
    }
}
