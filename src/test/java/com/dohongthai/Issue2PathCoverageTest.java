package com.dohongthai;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue2PathCoverageTest {
    @Test
    void pathInvalidRange() {
        List<String> result = EvenOddProgram.classifyRange(10, 1);

        assertEquals(List.of("Khoang khong hop le"), result);
    }

    @Test
    void pathSingleOddNumber() {
        List<String> result = EvenOddProgram.classifyRange(3, 3);

        assertEquals(List.of("So le: 3"), result);
    }

    @Test
    void pathSingleEvenNumber() {
        List<String> result = EvenOddProgram.classifyRange(4, 4);

        assertEquals(List.of("So chan: 4"), result);
    }

    @Test
    void pathMultipleNumbersMixedBranches() {
        List<String> result = EvenOddProgram.classifyRange(2, 5);

        assertEquals(List.of("So chan: 2", "So le: 3", "So chan: 4", "So le: 5"), result);
    }
}
