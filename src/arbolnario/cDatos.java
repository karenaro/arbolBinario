/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolnario;

/**
 *
 * @author karju
 */
public class cDatos {
    String marca;
    String ruta;
    double capacidad;
    String placa;
    
    
    //CONTRUCTORES
    public cDatos(String marca, String ruta, double capacidad, String placa) {
        this.marca = "";
        this.ruta = "";
        this.capacidad = 0;
        this.placa= "";
    }

    cDatos() {
     }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

  
 
    
    

}
