package com.gildedrose;

//Este archivo Item es otra clase y puedes crearla una sola vez y volverla a usar en cualquier parte. No es bueno crear una clase dentro de otra
public class Item {
    public String name;
    public int sellIn; //Numero de dias para venderlo
    public int quality; //Cuan valioso es el articulo

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void decrementSellIn() {
        this.sellIn--;
    }

}
