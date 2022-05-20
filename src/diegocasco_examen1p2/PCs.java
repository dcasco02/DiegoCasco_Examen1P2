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
public class PCs {
    private String direccionip;
    private String mascarared;
    private String hostname;

    public PCs() {
    }

    public PCs(String direccionip, String mascarared, String hostname) {
        this.direccionip = direccionip;
        this.mascarared = mascarared;
        this.hostname = hostname;
    }

    public String getDireccionip() {
        return direccionip;
    }

    public void setDireccionip(String direccionip) {
        this.direccionip = direccionip;
    }

    public String getMascarared() {
        return mascarared;
    }

    public void setMascarared(String mascarared) {
        this.mascarared = mascarared;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "PCs{" + "direccionip=" + direccionip + ", mascarared=" + mascarared + ", hostname=" + hostname + '}';
    }
    
}
