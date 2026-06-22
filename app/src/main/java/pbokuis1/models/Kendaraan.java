package pbokuis1.models;

import pbokuis1.enums.JenisKendaraan;

public abstract class Kendaraan {
    private final JenisKendaraan jenisKendaraan;
    private final int kapasitas;

    public Kendaraan(JenisKendaraan jenisKendaraan, int kapasitas) {
        this.jenisKendaraan = jenisKendaraan;
        this.kapasitas = kapasitas;
    }

    public JenisKendaraan getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public abstract String getPrintDetail();
}
