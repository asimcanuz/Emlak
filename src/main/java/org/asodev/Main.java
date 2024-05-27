package org.asodev;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Emlak ve EmlakServisi nesnelerini oluştur
        Emlak emlak = new Emlak();
        EmlakServisi emlakServisi = new EmlakServisi(emlak);

        // Evlerin toplam fiyatlarını yazdır
        System.out.println("Toplam Ev Fiyatı: " + emlakServisi.getToplamEvFiyati());

        // Villaların toplam fiyatlarını yazdır
        System.out.println("Toplam Villa Fiyatı: " + emlakServisi.getToplamVillaFiyati());

        // Yazlıkların toplam fiyatlarını yazdır
        System.out.println("Toplam Yazlık Fiyatı: " + emlakServisi.getToplamYazlikFiyati());

        // Tüm tipteki evlerin toplam fiyatını yazdır
        System.out.println("Tüm Ev Tiplerinin Toplam Fiyatı: " + emlakServisi.getToplamFiyat());

        // Evlerin ortalama metrekaresini yazdır
        System.out.println("Ortalama Ev Metrekare: " + emlakServisi.getOrtalamaEvMetrekare());

        // Villaların ortalama metrekaresini yazdır
        System.out.println("Ortalama Villa Metrekare: " + emlakServisi.getOrtalamaVillaMetrekare());

        // Yazlıkların ortalama metrekaresini yazdır
        System.out.println("Ortalama Yazlık Metrekare: " + emlakServisi.getOrtalamaYazlikMetrekare());

        // Tüm tipteki evlerin ortalama metrekaresini yazdır
        System.out.println("Tüm Ev Tiplerinin Ortalama Metrekare: " + emlakServisi.getOrtalamaMetrekare());

        // Oda ve salon sayısına göre evleri filtrele ve yazdır
        int odaSayisi = 4;
        int salonSayisi = 1;
        List<Ev> filtrelenmisEvler = emlakServisi.getEvleriFiltrele(odaSayisi, salonSayisi);
        System.out.println(odaSayisi + " oda ve " + salonSayisi + " salon sayısına göre filtrelenmiş evler:");
        for (Ev ev : filtrelenmisEvler) {
            System.out.println("Fiyat: " + ev.getPrice() + ", Metrekare: " + ev.getArea() + ", Oda Sayısı: " + ev.getRoomCount() + ", Salon Sayısı: " + ev.getFloorCount());
        }
    }
}
