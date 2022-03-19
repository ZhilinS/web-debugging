package ru.yandex.lotr;

public final class Equip {

    public String item(final String name) {
        if ("Frodo".equals(name)) {
            return "Ring";
        } else if ("Aragorn".equals(name)) {
            return "Blade";
        } else if ("Legolas".equals(name)) {
            return  "Bow";
        } else if ("Gimli".equals(name)) {
            return  "Axe";
        } else if ("Gandalf".equals(name)) {
            return  "Staff";
        } else {
            throw new RuntimeException("There is no such caracter in LOtR!");
        }
    }
}
