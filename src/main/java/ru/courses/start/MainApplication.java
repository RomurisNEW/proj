package ru.courses.start;

public class MainApplication{
    public static void main(String[] args) {
        Sauce sc1 = new Sauce(TypeSauce.KETCHUP);
        System.out.println(sc1);
        Sauce sc2 = new Sauce(ETypeSauce.CHILE);
        System.out.println(sc2);
    }
}

interface Sauceable {
    String getNameSauce();
    String getLvlSpice();
}

class Sauce {
    private final Sauceable type;

    public Sauce(Sauceable type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Соус " + type.getNameSauce() + ":" + type.getLvlSpice();
    }
}

enum ETypeSauce implements Sauceable {
    KETCHUP("Кетчуп", "Не острый"),
    CHILE("Сладки чили", "С легкой остротой"),
    ADJIKA("Аджика", "Сильно острый");

    private final String nameSauce;
    private final String lvlSpice;

    ETypeSauce(String nameSauce, String lvlSpice) {
        this.nameSauce = nameSauce;
        this.lvlSpice = lvlSpice;
    }

    public String getNameSauce() {
        return nameSauce;
    }

    public String getLvlSpice() {
        return lvlSpice;
    }
}

class TypeSauce implements Sauceable {
    private final String nameSauce;
    private final String lvlSpice;
    public final static TypeSauce KETCHUP = new TypeSauce("Кетчуп", "Не острый");
    public final static TypeSauce CHILE = new TypeSauce("Сладки чили", "С легкой остротой");
    public final static TypeSauce ADJIKA = new TypeSauce("Аджика", "Сильно острый");

    public TypeSauce(String nameSauce, String lvlSpice) {
        this.nameSauce = nameSauce;
        this.lvlSpice = lvlSpice;
    }

    @Override
    public String getNameSauce() {
        return nameSauce;
    }

    @Override
    public String getLvlSpice() {
        return lvlSpice;
    }
}

