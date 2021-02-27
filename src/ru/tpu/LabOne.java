package ru.tpu;

import ru.tpu.hierarchy.Appliens;
import ru.tpu.hierarchy.Vacuum;
import ru.tpu.hierarchy.Washing;

import java.lang.reflect.Array;

public class LabOne {

    public static void main(String[] args) {
        Appliens one;
        Appliens two;
        one = new Washing(100., "Electrolux");
        two = new Vacuum(200., "LG");
        System.out.println(one.getDescription());
        System.out.println(two.getDescription());
    }
}
