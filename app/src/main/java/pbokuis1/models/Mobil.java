package pbokuis1.models;

import pbokuis1.enums.BahanBakar;
import pbokuis1.enums.JenisKendaraan;

public class Mobil extends KendaraanDarat {
    private final BahanBakar jenisBahanBakar;

    public Mobil(BahanBakar jenisBahanBakar, String nopol, String model, JenisKendaraan jenisKendaraan, int kapasitas) {
        super(nopol, model, jenisKendaraan, kapasitas);
        this.jenisBahanBakar = jenisBahanBakar;
    }

    @Override
    public String getPrintDetail() {
        return "Jenis Kendaraan: " + getJenisKendaraan() + ", Nopol: " + getNopol() + ", Model: " + getModel()
                + ", Jenis Bahan Bakar: " + this.jenisBahanBakar;
    }
}
