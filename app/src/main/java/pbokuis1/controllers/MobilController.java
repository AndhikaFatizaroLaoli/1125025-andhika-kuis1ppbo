package pbokuis1.controllers;

import java.util.ArrayList;
import java.util.List;

import pbokuis1.enums.BahanBakar;
import pbokuis1.enums.JenisKendaraan;
import pbokuis1.models.Mobil;

public class MobilController {
    public List<Mobil> mobils;

    public MobilController() {
        this.mobils = new ArrayList<>();
    }

    public Mobil insertNewMobil(String nopol, String model, JenisKendaraan jenisKendaraan, BahanBakar jenisBahanBakar,
            int kapasitas) {
        Mobil mobil = new Mobil(jenisBahanBakar, nopol, model, jenisKendaraan, kapasitas);
        mobils.add(mobil);
        return mobil;
    }

    public List<Mobil> getAllMobils() {
        return this.mobils;
    }
}
