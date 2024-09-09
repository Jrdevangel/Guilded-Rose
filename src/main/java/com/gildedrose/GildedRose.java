package com.gildedrose;


//Los contructores deben de tener el mismo nombre de la clase.
//Si creas un archivo Java tipo clase su clase interna debe de llamarse igual si no no lo reconocera.


import java.util.List;

//Esta clase debe llamarse GildedRose porque asi se llama el archivo
//Esta clase tambien debe ser publica o "public" para poder usarla en otros archivos
public class GildedRose {
    List<Item> items; // Todos los Items que se encuentran en la tienda

//Corregi el contructor para que se llame igual a la clase
    public GildedRose(List<Item> items) {
        this.items = items;
    }

    //Actualizar esta funcion
    public void updateQuality() {
        for (Item item : items) {

            if (item.name.equals(ItemName.AGED_BRIE.getName()) //Se esta comparando los nombres
                || item.name.equals(ItemName.BACKSTAGE.getName())) {

                incrementQuality(item); //incrementa la calidad del item en una unidad

                if (item.name.equals(ItemName.BACKSTAGE.getName())) {
                    if (item.sellIn < 11) {
                        incrementQuality(item); //Incremento en caso sea menor a 11 unidades
                    }
                    if (item.sellIn < 6) {
                        incrementQuality(item); //Incremento en caso sea menor a 6 unidades
                    }
                }

            } else if (!item.name.equals(ItemName.SULFURAS.getName())) {
                decrementQuality(item);
            }

            if (!item.name.equals(ItemName.SULFURAS.getName())) {
                item.decrementSellIn();
            }

            if (item.sellIn < 0) {
                if (item.name.equals(ItemName.AGED_BRIE.getName())) {
                    incrementQuality(item); //Algunos productos Incrementan la calidad luego que pasa su fecha de vencimiento.
                } else if (item.name.equals(ItemName.BACKSTAGE.getName())) {
                    item.quality = 0;
                } else if (!item.name.equals(ItemName.SULFURAS.getName())) {
                    decrementQuality(item);
                }
            }

            if (item.name.equals(ItemName.CONJURADOS.getName())){
                decrementQualityConjurados(item);
            }


        }
    }

    private void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    //Disminuye la calidad en 2 de conjurados
    private void decrementQualityConjurados(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 2;
        }
    }


    /*
    //Agregar una nueva funcion para vender una nueva categoria de articulos
    public void updateQualityMeat(){
        for (Item item : items) {
        }
    }
    */





}



