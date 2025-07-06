package com.fastcampus.javaoop;

import com.fastcampus.javaoop.Logic.BubbleSort;
import com.fastcampus.javaoop.Logic.JavaSort;
import com.fastcampus.javaoop.Logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
