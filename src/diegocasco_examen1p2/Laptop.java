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
public class Laptop extends PCs {
    private String marca;
    private String definicionpantalla;
    private boolean rgb;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String definicionpantalla, boolean rgb, String direccionip, String mascarared, String hostname) {
        super(direccionip, mascarared, hostname);
        this.marca = marca;
        this.definicionpantalla = definicionpantalla;
        this.rgb = rgb;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicionpantalla() {
        return definicionpantalla;
    }

    public void setDefinicionpantalla(String definicionpantalla) {
        this.definicionpantalla = definicionpantalla;
    }


    @Override
    public String toString() {
        return "Laptop{" + "marca=" + marca + ", definicionpantalla=" + definicionpantalla + ", rgb=" + rgb + '}';
    }
    
}
