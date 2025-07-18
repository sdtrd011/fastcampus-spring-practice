package com.fastcampus.javaoop.Service;

import com.fastcampus.javaoop.Logic.BubbleSort;
import com.fastcampus.javaoop.Logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new BubbleSort<String>());

    @Test
    void test() {
        //Given

        // When
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        // Then
        assertEquals(List.of("1", "2", "3"), actual);

    }

}