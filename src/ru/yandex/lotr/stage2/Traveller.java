package ru.yandex.lotr.stage2;

public class Traveller {

    private final int weight;
    private final String name;
    private final String item;

    public Traveller(
        final int weight,
        final String name,
        final String item
    ) {
        this.weight = weight;
        this.name = name;
        this.item = item;
    }

    public int getWeight() {
       return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public String getItem() {
        return this.item;
    }
}
