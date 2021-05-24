package Homework1;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        String[] arr = {"aaa", "bbb", "ccc", "ddd"};
        System.out.println(Arrays.toString(arr));

        System.out.println("Задача №2");
        List<String> list = convertToList(arr);


    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
