package com.dohongthai;

import java.util.ArrayList;
import java.util.List;

public class EvenOddProgram {
    public static List<String> classifyRange(int start, int end) {
        List<String> output = new ArrayList<>();

        if (start > end) {
            output.add("Khoang khong hop le");
            return output;
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                output.add("So chan: " + i);
            } else {
                output.add("So le: " + i);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        List<String> lines = classifyRange(1, 10);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
