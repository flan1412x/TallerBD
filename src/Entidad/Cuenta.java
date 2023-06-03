/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author 1214k
 */
public class Cuenta {
    
    public int id;
    public double saldo;
    public TipoCuenta tipo;
    public String cedula; 

    public Cuenta(int id, double saldo, TipoCuenta tipo, String cedula) {
        this.id = id;
        this.saldo = saldo;
        this.tipo = tipo;
        this.cedula = cedula;
    }
    
    public Cuenta(){};
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipo
     */
    public TipoCuenta getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
   
}
