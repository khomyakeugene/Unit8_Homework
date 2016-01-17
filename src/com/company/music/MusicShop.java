package com.company.music;

import com.company.utils.Collections;
import com.company.utils.Utils;

import java.util.ArrayList;

/**
 * Created by Yevgen on 21.12.2015.
 */
public class MusicShop {
    private String shopName;
    private ArrayList<MusicalInstrument> instruments;

    public MusicShop(String shopName) {
        super();

        setShopName(shopName);

        // Init "instruments space"
        instruments = new ArrayList<>();
    }

    public ArrayList<MusicalInstrument> getInstruments() {
        return instruments;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void addInstrument(MusicalInstrument instrument) {
        instruments.add(instrument);
    }

    public void showMusicShop() {
        Utils.printMessage(getShopName());

        showAllInstruments();
    }

    public void showAllInstruments() {
        Collections.printList(getInstruments());
    }

    public void sortInstrumentsByType() {
        ArrayList<MusicalInstrument> copyOfInstruments = new ArrayList<>();

        copyOfInstruments.addAll(instruments);
        instruments.clear();

        copyOfInstruments
                .stream()
                .sorted((i1, i2) -> i1.getInstrumentType().compareTo(i2.getInstrumentType()))
                .forEach(i -> instruments.add(i));
    }
}
