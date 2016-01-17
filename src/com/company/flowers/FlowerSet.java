package com.company.flowers;

import com.company.utils.PrintCollection;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Yevgen on 21.12.2015.
 */
public class FlowerSet {
    private ArrayList<Flower> flowers;

    public FlowerSet() {
        super();

        // Init "bouquet space"
        flowers = new ArrayList<>();
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public Integer getFlowerCount() {
        return flowers.size();
    }

    public void showFlowerSet() {
        Utils.writeMessage(getClass().getName());

        PrintCollection.printList(getFlowers());
    }
}
