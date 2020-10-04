package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[3];

        array[0] = 25;
        array[1] = 72;
        array[2] = 58;

        System.out.println("Массив до смены элементов местами: " + Arrays.toString(array));
        //смена элементов местами
        swapElements (array, 1, 2);

        //преобразовываем массив в ArrayList
        System.out.println("Поменяем 2-й и 3-й элементы массива местами: " + Arrays.toString(array));
        ArrayList<Integer> arrayList = toArrayList(array);

        // 3 пункт ДЗ
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1,apple2);
        Box<Orange> box2 = new Box<Orange>(orange1,orange2, orange3);
        box1.add(apple2); // добавляем в ящик яблоко через метод
        box2.add(orange1); //удаляем из ящика апельсин orange1

        System.out.println(box1.compare(box2));
        if(box1.compare(box2)) {
            System.out.println("Коробки равны по весу");
        } else System.out.println("Коробки не равны по весу");

        Box<Apple> box3 = new Box<Apple>();
        box1.shift(box3);
    }


// Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

    private static void swapElements (Object[] arr, int num1, int num2) {
        Object t = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = t;
    }

// Написать метод, который преобразует массив в ArrayList;

    private static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

}