package pbokuis1.views;

import java.util.Scanner;

import pbokuis1.controllers.MobilController;
import pbokuis1.controllers.MotorController;
import pbokuis1.enums.JenisKendaraan;
import pbokuis1.controllers.HelikopterController;
import pbokuis1.controllers.KapalController;
import pbokuis1.enums.BahanBakar;
import pbokuis1.enums.JenisPenggerak;
import pbokuis1.enums.Penggunaan;
import pbokuis1.models.Mobil;
import pbokuis1.models.Motor;
import pbokuis1.models.Kapal;
import pbokuis1.models.Helikopter;
import pbokuis1.utils.ScannerUtil;

public class Main {
    private static Scanner scanner;
    private static MotorController mtrCtrl;
    private static MobilController mblCtrl;
    private static HelikopterController heliCtrl;
    private static KapalController kapalCtrl;

    public Main() {
        scanner = new Scanner(System.in);
        mtrCtrl = new MotorController();
        mblCtrl = new MobilController();
        heliCtrl = new HelikopterController();
        kapalCtrl = new KapalController();
    }

    public static void run() {
        while (true) {
            int menu = ScannerUtil.inputInt("Menu \n 1. Tambah Kendaraan \n 2. Print Semua Kendaraan \n 3. Exit",
                    scanner);

            switch (menu) {
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void menu1() {
        BahanBakar jenisBahanBakar;
        JenisPenggerak jenisPenggerak;
        Penggunaan penggunaan;

        int menu = ScannerUtil.inputInt("Menu \n 1. Motor \n 2. Mobil \n 3. Kapal \n 4. Helikopter",
                scanner);
        switch (menu) {
            case 1:
                String nopol = ScannerUtil.inputString("Nomor Polisi", scanner);
                String model = ScannerUtil.inputString("Model Motor", scanner);
                JenisKendaraan jenisKendaraan = JenisKendaraan.MOTOR;
                mtrCtrl.insertNewMotor(nopol, model, jenisKendaraan);
                break;
            case 2:
                nopol = ScannerUtil.inputString("Nomor Polisi", scanner);
                model = ScannerUtil.inputString("Model Mobil", scanner);
                jenisKendaraan = JenisKendaraan.MOBIL;
                int bbm = ScannerUtil.inputInt("Jenis Bahan Bakar \n 1. Diesel \n 2. Bensin", scanner);
                switch (bbm) {
                    case 1:
                        jenisBahanBakar = BahanBakar.DIESEL;
                        break;
                    case 2:
                        jenisBahanBakar = BahanBakar.BENSIN;
                        break;
                    default:
                        jenisBahanBakar = BahanBakar.BENSIN;
                        break;
                }
                int kapasitas = ScannerUtil.inputInt("Kapasitas", scanner);
                mblCtrl.insertNewMobil(nopol, model, jenisKendaraan, jenisBahanBakar, kapasitas);
                break;
            case 3:
                double lebar = ScannerUtil.inputDouble("Lebar", scanner);
                double panjang = ScannerUtil.inputDouble("Panjang", scanner);
                int penggerak = ScannerUtil.inputInt("Jenis Penggerak \n 1. Layar \n 2. Mesin", scanner);
                switch (penggerak) {
                    case 1:
                        jenisPenggerak = JenisPenggerak.LAYAR;
                        break;
                    case 2:
                        jenisPenggerak = JenisPenggerak.MESIN;
                        break;
                    default:
                        jenisPenggerak = JenisPenggerak.MESIN;
                        break;
                }
                nopol = ScannerUtil.inputString("Nomor Polisi", scanner);
                model = ScannerUtil.inputString("Model Kapal", scanner);
                jenisKendaraan = JenisKendaraan.KAPAL;
                kapasitas = ScannerUtil.inputInt("Kapasitas", scanner);
                kapalCtrl.insertNewKapal(jenisPenggerak, lebar, panjang, kapasitas, jenisKendaraan);
                break;
            case 4:
                jenisKendaraan = JenisKendaraan.HELIKOPTER;
                int pgn = ScannerUtil.inputInt("Jenis Penggunaan \n 1. Militer \n 2. Komersil", scanner);
                switch (pgn) {
                    case 1:
                        penggunaan = Penggunaan.MILITER;
                        break;
                    case 2:
                        penggunaan = Penggunaan.KOMERSIL;
                        break;
                    default:
                        penggunaan = Penggunaan.KOMERSIL;
                        break;
                }
                kapasitas = ScannerUtil.inputInt("Kapasitas", scanner);
                heliCtrl.insertNewHelikopter(penggunaan, jenisKendaraan, kapasitas);
                break;
            default:
                break;
        }
    }

    private static void menu2() {
        for (Motor mtr : mtrCtrl.getAllMotors()) {
            System.out.println(mtr.getPrintDetail());
        }
        for (Mobil mbl : mblCtrl.getAllMobils()) {
            System.out.println(mbl.getPrintDetail());
        }
        for (Kapal kapal : kapalCtrl.getAllKapals()) {
            System.out.println(kapal.getPrintDetail());
        }
        for (Helikopter heli : heliCtrl.getAllHelikopters()) {
            System.out.println(heli.getPrintDetail());
        }
    }
}
