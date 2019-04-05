package io.gihub.bael.javacourse.generic;

import java.util.List;

public class UnboundedWildCards {

    public static void printList(List<Object> list) {
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
        System.out.println();

    }


    public static void printList2(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }


}
