package pbokuis1.models;

import pbokuis1.enums.JenisKendaraan;
import pbokuis1.enums.JenisPenggerak;

public class Kapal extends Kendaraan {
    private final JenisPenggerak jenisPenggerak;
    private final double lebar, panjang;

    public Kapal(JenisPenggerak jenisPenggerak, double lebar, double panjang, int kapasitas,
            JenisKendaraan jenisKendaraan) {
        super(jenisKendaraan, kapasitas);
        this.jenisPenggerak = jenisPenggerak;
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public String getPrintDetail() {
        return "Jenis Kendaraan: " + getJenisKendaraan() + ", Kapasitas: " + getKapasitas() + ", Jenis Penggerak: "
                + this.jenisPenggerak + ", Lebar: " + this.lebar + ", Panjang: " + this.panjang;
    }
}
