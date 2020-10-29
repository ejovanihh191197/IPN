/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipn;

/**
 *
 * @author erick
 */
public class Participante {
    private String nombre;
    private String CURP;
    private char procedencia;
    private double descuento;
    private double cuotaFinal;

    public Participante() {
    }

    public Participante(String nombre, String CURP, char procedencia, double descuento, double cuotaFinal) {
        this.nombre = nombre;
        this.CURP = CURP;
        this.procedencia = procedencia;
        this.descuento = descuento;
        this.cuotaFinal = cuotaFinal;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public char getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(char procedencia) {
        this.procedencia = procedencia;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getCuotaFinal() {
        return cuotaFinal;
    }

    public void setCuotaFinal(double cuotaFinal) {
        this.cuotaFinal = cuotaFinal;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " CURP: " + CURP + " Procedencia: " + procedencia + " Descuento: " + descuento + " Cuota Final: " + cuotaFinal;
    }
    
    
}
