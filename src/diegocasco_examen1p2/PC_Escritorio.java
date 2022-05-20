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
    private boolean tipoalma;
    private boolean tarjetagraf;

    public PC_Escritorio() {
    }

    public PC_Escritorio(int capram, int capacidadalma, boolean tipoalma, boolean tarjetagraf, String direccionip, String mascarared, String hostname) {
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

    public boolean isTipoalma() {
        return tipoalma;
    }

    public void setTipoalma(boolean tipoalma) {
        this.tipoalma = tipoalma;
    }

    public boolean isTarjetagraf() {
        return tarjetagraf;
    }

    public void setTarjetagraf(boolean tarjetagraf) {
        this.tarjetagraf = tarjetagraf;
    }

    @Override
    public String toString() {
        return "PC_Escritorio{" + "capram=" + capram + ", capacidadalma=" + capacidadalma + ", tipoalma=" + tipoalma + ", tarjetagraf=" + tarjetagraf + '}';
    }
    
    
}
