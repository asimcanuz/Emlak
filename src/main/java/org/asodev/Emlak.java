package org.asodev;

import java.util.ArrayList;
import java.util.List;

public class Emlak {
    private List<Ev> evList;
    private List<Villa> villaList;
    private List<Yazlik> yazlikList;

    public Emlak() {
        evList = new ArrayList<>();
        villaList = new ArrayList<>();
        yazlikList = new ArrayList<>();

        // Example instances
        evList.add(new Ev(100000, 120, 3, 1));
        evList.add(new Ev(150000, 150, 4, 1));
        evList.add(new Ev(200000, 180, 5, 2));

        villaList.add(new Villa(500000, 300, 6, 2));
        villaList.add(new Villa(600000, 350, 7, 3));
        villaList.add(new Villa(700000, 400, 8, 4));

        yazlikList.add(new Yazlik(300000, 200, 4, 1));
        yazlikList.add(new Yazlik(400000, 250, 5, 2));
        yazlikList.add(new Yazlik(500000, 300, 6, 2));
    }

    public List<Ev> getEvList() {
        return evList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<Yazlik> getYazlikList() {
        return yazlikList;
    }
}
