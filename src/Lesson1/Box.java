package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    //Для хранения фруктов внутри коробки можно использовать ArrayList;
    private final ArrayList<T> fruits;

    Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    //метод добавления фруктов в коробку
    public final void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }
    //метод удаления фрукта из коробки
    public final void remove(T... items) {
        for (T item: items) this.fruits.remove(item);
    }
    //метод удаления всех фруктов из корзины
    private void clear() {
        fruits.clear();
    }

    //метод вычисления веса коробки
    private float getWeight() {
        if(fruits.size() == 0) return 0;
        float weight = 0;
        for (T fruit: fruits) {
            weight = weight+fruit.getWeight();
        }
        return weight;
    }
    //метод сравнения веса текущей коробки и новой коробки
    boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
    //метод переноса фруктов из одной коробки в другую
    void shift(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        clear(); //удаляем все из коробки, из которой пересыпали
    }
}
