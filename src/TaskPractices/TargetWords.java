package TaskPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TargetWords {
    public static void main(String[] args) {
        ArrayList<String> targetWords = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        System.out.println(Collections.frequency(targetWords,"java"));
    }
}
