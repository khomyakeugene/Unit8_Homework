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
}
