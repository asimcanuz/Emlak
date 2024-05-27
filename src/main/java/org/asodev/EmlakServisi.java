
package org.asodev;

import java.util.ArrayList;
import java.util.List;

public class EmlakServisi {
    private Emlak emlak;

    public EmlakServisi(Emlak emlak) {
        this.emlak = emlak;
    }

    public double getToplamEvFiyati() {
        return emlak.getEvList().stream().mapToDouble(Ev::getPrice).sum();
    }

    public double getToplamVillaFiyati() {
        return emlak.getVillaList().stream().mapToDouble(Ev::getPrice).sum();
    }

    public double getToplamYazlikFiyati() {
        return emlak.getYazlikList().stream().mapToDouble(Ev::getPrice).sum();
    }

    public double getToplamFiyat() {
        double toplamEvFiyati = getToplamEvFiyati();
        double toplamVillaFiyati = getToplamVillaFiyati();
        double toplamYazlikFiyati = getToplamYazlikFiyati();
        return toplamEvFiyati + toplamVillaFiyati + toplamYazlikFiyati;
    }

    public double getOrtalamaEvMetrekare() {
        return emlak.getEvList().stream().mapToDouble(Ev::getArea).average().orElse(0);
    }

    public double getOrtalamaVillaMetrekare() {
        return emlak.getVillaList().stream().mapToDouble(Ev::getArea).average().orElse(0);
    }

    public double getOrtalamaYazlikMetrekare() {
        return emlak.getYazlikList().stream().mapToDouble(Ev::getArea).average().orElse(0);
    }

    public double getOrtalamaMetrekare() {
        double toplamMetrekare = emlak.getEvList().stream().mapToDouble(Ev::getArea).sum() +
                emlak.getVillaList().stream().mapToDouble(Ev::getArea).sum() +
                emlak.getYazlikList().stream().mapToDouble(Ev::getArea).sum();
        long toplamEvSayisi = emlak.getEvList().size() + emlak.getVillaList().size() + emlak.getYazlikList().size();
        return toplamEvSayisi > 0 ? toplamMetrekare / toplamEvSayisi : 0;
    }

    public List<Ev> getEvleriFiltrele(int odaSayisi, int salonSayisi) {
        List<Ev> tumEvler = new ArrayList<>();
        tumEvler.addAll(emlak.getEvList());
        tumEvler.addAll(emlak.getVillaList());
        tumEvler.addAll(emlak.getYazlikList());

        return tumEvler.stream()
                .filter(ev -> ev.getFloorCount() == odaSayisi && ev.getFloorCount() == salonSayisi)
                .toList();
    }
}
