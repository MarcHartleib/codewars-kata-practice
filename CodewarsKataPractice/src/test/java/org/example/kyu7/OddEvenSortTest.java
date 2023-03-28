package org.example.kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSortTest {

    OddEvenSort oddEvenSort = new OddEvenSort();

    @ParameterizedTest
    @CsvSource({
            "a, a ",
            "ab, a b",
            "Wolfeschlegelsteinhausenbergerdorff, Wleclgltihuebredrf ofsheesenasnegrof",
            "METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL, MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY",
            "PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS, PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI",
            "PSEUDOPSEUDOHYPOPARATHYROIDISM, PEDPEDHPPRTYODS SUOSUOYOAAHRIIM",
            "FLOCCINAUCINIHILIPILIFICATION, FOCNUIIIIIIIAIN LCIACNHLPLFCTO",
            "SUBDERMATOGLYPHIC, SBEMTGYHC UDRAOLPI",
    })
    void sortString(String input, String expected) {
        String result = oddEvenSort.sortString(input);
        assertEquals(expected, result);
    }
}