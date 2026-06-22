package pbokuis1.controllers;

import java.util.ArrayList;
import java.util.List;

import pbokuis1.enums.JenisKendaraan;
import pbokuis1.enums.Penggunaan;
import pbokuis1.models.Helikopter;

public class HelikopterController {
    public List<Helikopter> helikopters;

    public HelikopterController() {
        this.helikopters = new ArrayList<>();
    }

    public Helikopter insertNewHelikopter(Penggunaan penggunaan, JenisKendaraan jenisKendaraan, int kapasitas) {
        Helikopter helikopter = new Helikopter(penggunaan, jenisKendaraan, kapasitas);
        helikopters.add(helikopter);
        return helikopter;
    }

    public List<Helikopter> getAllHelikopters() {
        return this.helikopters;
    }
}
