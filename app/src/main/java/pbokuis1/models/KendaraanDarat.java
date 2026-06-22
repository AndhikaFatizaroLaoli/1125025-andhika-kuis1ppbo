package pbokuis1.models;

import pbokuis1.enums.JenisKendaraan;

public abstract class KendaraanDarat extends Kendaraan {
    private final String nopol, model;

    public KendaraanDarat(String nopol, String model, JenisKendaraan jenisKendaraan, int kapasitas) {
        super(jenisKendaraan, kapasitas);
        this.nopol = nopol;
        this.model = model;
    }

    public String getNopol() {
        return this.nopol;
    }

    public String getModel() {
        return this.model;
    }
}
