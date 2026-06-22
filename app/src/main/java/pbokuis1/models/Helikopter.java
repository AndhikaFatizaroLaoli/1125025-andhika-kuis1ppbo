package pbokuis1.models;

import pbokuis1.enums.JenisKendaraan;
import pbokuis1.enums.Penggunaan;

public class Helikopter extends Kendaraan {
    private final Penggunaan penggunaan;

    public Helikopter(Penggunaan penggunaan, JenisKendaraan jenisKendaraan, int kapasitas) {
        super(jenisKendaraan, kapasitas);
        this.penggunaan = penggunaan;
    }

    @Override
    public String getPrintDetail() {
        return "Jenis Kendaraan: " + getJenisKendaraan() + ", Penggunaan: " + this.penggunaan + ", Kapasitas: "
                + getKapasitas();
    }
}
