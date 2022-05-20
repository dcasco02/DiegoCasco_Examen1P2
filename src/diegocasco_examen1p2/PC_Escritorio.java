/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_examen1p2;

/**
 *
 * @author dcasc
 */
public class PC_Escritorio extends PCs {
    private int capram;
    private int capacidadalma;
    private String tipoalma;
    private String tarjetagraf;

    public PC_Escritorio() {
    }

    public PC_Escritorio(int capram, int capacidadalma, String tipoalma, String tarjetagraf, String direccionip, String mascarared, String hostname) {
        super(direccionip, mascarared, hostname);
        this.capram = capram;
        this.capacidadalma = capacidadalma;
        this.tipoalma = tipoalma;
        this.tarjetagraf = tarjetagraf;
    }

    public int getCapram() {
        return capram;
    }

    public void setCapram(int capram) {
        this.capram = capram;
    }

    public int getCapacidadalma() {
        return capacidadalma;
    }

    public void setCapacidadalma(int capacidadalma) {
        this.capacidadalma = capacidadalma;
    }

    public String getTipoalma() {
        return tipoalma;
    }

    public void setTipoalma(String tipoalma) {
        this.tipoalma = tipoalma;
    }

    public String getTarjetagraf() {
        return tarjetagraf;
    }

    public void setTarjetagraf(String tarjetagraf) {
        this.tarjetagraf = tarjetagraf;
    }

    @Override
    public String toString() {
        return "PC_Escritorio{" + "capram=" + capram + ", capacidadalma=" + capacidadalma + ", tipoalma=" + tipoalma + ", tarjetagraf=" + tarjetagraf + '}';
    }
    
    
}
