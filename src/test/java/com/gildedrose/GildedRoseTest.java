package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class GildedRoseTest {

    @Test
    void validarNombre() {
        List<Item> items = new ArrayList<>(); //Crear una lista de Items
        items.add(new Item("Producto 1", 10, 20));
        items.add(new Item("Producto 2", 5, 6));

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        // Validando los nombres de cada producto creado
        Assertions.assertEquals("Producto 1", app.items.get(0).name);
        Assertions.assertEquals("Product 2", app.items.get(1).name);

    }


    @Test
    void validarQualitySulfuras() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Product 1", 10, 20));
        items.add(new Item("Product 2", 5, 6));

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        for (int i = 0; i < items.size(); i++) {
            if(app.items.get(i).name.equals(ItemName.SULFURAS.getName())){
                Assertions.assertEquals(ItemName.AGED_BRIE.getName(), app.items.get(0).name);
                Assertions.assertEquals(80, app.items.get(1).quality);
            }
        }

    }





}
