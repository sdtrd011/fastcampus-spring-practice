package com.fastcampus.javaoop.Logic;

import java.util.List;

public interface Sort <T extends Comparable<T>>{
    List<T> sort(List<T> list);
}
