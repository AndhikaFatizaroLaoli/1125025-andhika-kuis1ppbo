package pbokuis1.controllers;

import java.util.ArrayList;
import java.util.List;

import pbokuis1.enums.JenisKendaraan;
import pbokuis1.enums.JenisPenggerak;
import pbokuis1.models.Kapal;

public class KapalController {
    public List<Kapal> kapals;

    public KapalController() {
        this.kapals = new ArrayList<>();
    }

    public Kapal insertNewKapal(JenisPenggerak jenisPenggerak, double lebar, double panjang, int kapasitas,
            JenisKendaraan jenisKendaraan) {
        Kapal kapal = new Kapal(jenisPenggerak, lebar, panjang, kapasitas, jenisKendaraan);
        kapals.add(kapal);
        return kapal;
    }

    public List<Kapal> getAllKapals() {
        return this.kapals;
    }
}
