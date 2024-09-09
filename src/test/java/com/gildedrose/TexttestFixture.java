package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        List<Item> items = new ArrayList<>();


        Item item1 = new Item("+5 Dexterity Vest", 10, 20); //
        Item item2 = new Item("Aged Brie", 2, 0); //
        Item item3 = new Item("Elixir of the Mongoose", 5, 7); //
        Item item4 = new Item("Sulfuras, Hand of Ragnaros", 0, 80); //
        Item item5 = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
        Item item6 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        Item item7 = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        Item item8 = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        // this conjured item does not work properly yet
        Item item9 = new Item("Conjured Mana Cake", 3, 6);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);

            GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
