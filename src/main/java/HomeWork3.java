import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HomeWork3 {
    public static void main(String[] args) {
//Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        List ls = new ArrayList();
        ls.add("Первое добавление");
        ls.add(25);
        System.out.println(ls);
//Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        List ls2 = new ArrayList();
        ls2.add("red");
        ls2.add("black");
        ls2.add("yellou");
        ls2.add("green");
        ls2.add("blue");
        for (int i=0; i<ls2.size(); i++) {
            String w = new String();
            w = (String) ls2.get(i);
            w = w + "!";
            ls2.set(i, w);
        }
        System.out.println(ls2);

//Вставить элемент в список в первой позиции.
        ls2.add(0, "Как учили в автошколе");
        System.out.println(ls2);
//Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println(ls2.get(3));
//Обновить определенный элемент списка по заданному индексу.
        ls2.set(3, "Java");
        System.out.println(ls2);
//Удалить третий элемент из списка.
        ls2.remove(2);
        System.out.println(ls2);
//Поиска элемента в списке по строке.
        System.out.println(ls2.indexOf("Как учили в автошколе"));
//Создать новый список и добавить в него несколько елементов первого списка.
        List ls3 = new ArrayList();
        ls3.add("red!");
        ls3.add("green!");
        ls3.add("Как учили в автошколе");
        System.out.println(ls3);
//Удалить из первого списка все элементы отсутствующие во втором списке.
        ls2.retainAll(ls3);
        System.out.println(ls2);
//*Сортировка списка.
        Collections.sort(ls2);
        System.out.println(ls2);
    }
}
