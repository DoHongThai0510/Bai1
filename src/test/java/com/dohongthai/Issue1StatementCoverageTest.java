package com.dohongthai;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue1StatementCoverageTest {
    @Test
    void shouldReturnInvalidMessageWhenRangeIsInvalid() {
        List<String> result = EvenOddProgram.classifyRange(5, 2);

        assertEquals(List.of("Khoang khong hop le"), result);
    }

    @Test
    void shouldClassifyEvenAndOddNumbers() {
        List<String> result = EvenOddProgram.classifyRange(1, 2);

        assertEquals(List.of("So le: 1", "So chan: 2"), result);
    }
}
