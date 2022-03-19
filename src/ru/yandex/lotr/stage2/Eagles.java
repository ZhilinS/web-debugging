package ru.yandex.lotr.stage2;

import java.util.List;

public class Eagles {

    /**
     * Default flight range.
     */
    private int range = 30;

    /**
     * Feed our eagle. Increse flight range every time.
     * @param food Count of food
     */
    public void eat(final int food) {
        this.range = food / 100;
    }

    /**
     * Calculate distance and fly.
     * @param travellers List of travellers
     * @return Fly distance
     */
    public int tryToFly(final List<Traveller> travellers) {
        int distance = calculateDistance(travellers);
        this.range -= distance;
        if (this.range < 0) {
            return 0;
        }
        return distance;
    }

    /**
     * Calculate max distance eagle can fly with travellers.
     * @param travellers List of travellers
     * @return As integer
     */
    private int calculateDistance(final List<Traveller> travellers) {
        int totalWeight = 0;
        for (Traveller traveller:travellers) {
            totalWeight += traveller.getWeight();
        }

        return totalWeight / 10;
    }
}
