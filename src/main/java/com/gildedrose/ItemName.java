package com.gildedrose;

//Los enum tambien deben de tener la palabra reservada public porque los usaras en alguna parte de tu codigo
public enum ItemName {
    AGED_BRIE("Aged Brie"), //Primera categoria
    BACKSTAGE("Backstage passes to a TAFKAL80ETC concert"), //Segunda categoria
    SULFURAS("Sulfuras, Hand of Ragnaros"), //Tercera categoria
    // Nueva categoria a vender
    CONJURADOS("Objeto 1");

    private final String name;

    ItemName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
