package pbokuis1.models;

import pbokuis1.enums.JenisKendaraan;

public class Motor extends KendaraanDarat {
    public Motor(String nopol, String model, JenisKendaraan jenisKendaraan, int kapasitas) {
        super(nopol, model, jenisKendaraan, kapasitas);
    }

    @Override
    public String getPrintDetail() {
        return "Jenis Kendaraan: " + getJenisKendaraan() + ", Nopol: " + getNopol() + ", Model: " + getModel();
    }

}
