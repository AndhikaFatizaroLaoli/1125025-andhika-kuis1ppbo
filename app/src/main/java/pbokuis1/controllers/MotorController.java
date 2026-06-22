package pbokuis1.controllers;

import java.util.ArrayList;
import java.util.List;

import pbokuis1.enums.JenisKendaraan;
import pbokuis1.models.Motor;

public class MotorController {
    public List<Motor> motors;

    public MotorController() {
        this.motors = new ArrayList<>();
    }

    public Motor insertNewMotor(String nopol, String model, JenisKendaraan jenisKendaraan) {
        Motor motor = new Motor(nopol, model, jenisKendaraan, 0);
        motors.add(motor);
        return motor;
    }

    public List<Motor> getAllMotors() {
        return this.motors;
    }
}
