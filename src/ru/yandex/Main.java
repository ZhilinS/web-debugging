package ru.yandex;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.lotr.Equip;
import ru.yandex.lotr.stage2.Eagles;
import ru.yandex.lotr.stage2.Traveller;

public class Main {

    public static void main(String[] args) {
        // Снаряжаем отряд
        final Equip equip = new Equip();
        final String frodoItem = equip.item("Frodo");
        final String aragornItem = equip.item("Aragorn");

        // Решаем кто отправится в поход
        final Traveller frodo = new Traveller(250, "Frodo", frodoItem);
        final Traveller aragorn = new Traveller(400, "Aragorn", aragornItem);

        List<Traveller> travellers = new ArrayList<>();
        travellers.add(frodo);
        travellers.add(aragorn);

        // Отправляем на орлах, зачем пешком?
        final Eagles eagles = new Eagles();
        eagles.eat(1000);
        int distance = eagles.tryToFly(travellers);

        if (distance == 0) {
            eagles.eat(1000);
            distance = eagles.tryToFly(travellers);
        }

        System.out.println("The eagle flew " + distance + " km.");
    }
}
