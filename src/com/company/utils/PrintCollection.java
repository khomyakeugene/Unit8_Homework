package com.company.utils;

import java.util.List;

/**
 * Created by Yevgen on 17.01.2016 as a part of the project "Unit8_Homework".
 */
public class PrintCollection {
    public static void printList(List list) {
        list.stream().
                forEach(p -> Utils.printMessage(p.toString()));
    }

}
