package com.company;

import com.company.tests.TestFileData;
import com.company.tests.TestFlowerData;
import com.company.tests.TestMusicShop;
import com.company.utils.Utils;

import java.io.IOException;

public class Main {
    static String thisProgramName = Utils.getProgramName();

    public static void main(String[] args) throws IOException { //и все-таки эксепшены лучше обрабатывать в программе
        demonstrateData();
    }

    public static void demonstrateData() throws IOException {
        // Demonstrate "file infrastructure"
        new TestFileData().demonstrateData(thisProgramName);

        // Demonstrate flowers
        new TestFlowerData().demonstrateData();

        // Demonstrate music shop
        new TestMusicShop().demonstrateData();
    }
}


