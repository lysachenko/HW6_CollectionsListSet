package com.lysachenko.list;

import java.util.List;

public class GenericLists<E> {

    private List<E> list1;
    private List<E> list2;

    public GenericLists(List<E> list1, List<E> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public void showSame() {
        for (E e1 : list1) {
            for (E e2 : list2) {
                if (e1.equals(e2)) {
                    System.out.println(e1 + " = " + e2);
                }
            }
        }
    }
}
