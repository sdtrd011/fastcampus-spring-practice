package com.fastcampus.javaoop.Service;

import com.fastcampus.javaoop.Logic.JavaSort;
import com.fastcampus.javaoop.Logic.Sort;

import java.util.List;

public class SortService {
    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
