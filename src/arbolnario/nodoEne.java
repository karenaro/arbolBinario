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
import java.util.ArrayList;
public class nodoEne {
    
    private cDatos nodo;
    private ArrayList<nodoEne> hijos;

    // constructores
    public nodoEne() {
        this.nodo = new cDatos();
        this.hijos = new ArrayList<>();
    }

    public nodoEne(cDatos nodo, ArrayList<nodoEne> hijos) {
        this.nodo = nodo;
        this.hijos = hijos;
    }
    
    public nodoEne(cDatos nodo) {
        this.nodo = new cDatos();
        this.hijos = new ArrayList<>();
    }

    
    // metodos de acceso
    public cDatos getNodo() {
        return nodo;
    }

    public void setNodo(cDatos nodo) {
        this.nodo = nodo;
    }

    public ArrayList<nodoEne> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<nodoEne> hijos) {
        this.hijos = hijos;
    }
   
   
    

    
    
    
}

