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


public class arbolEne {
    
    nodoEne Raiz;

    public arbolEne() {
        this.Raiz = new nodoEne();
    }

    public arbolEne(nodoEne Raiz) {
        this.Raiz = Raiz;
    }
    
    public arbolEne(cDatos datos) {
        this.Raiz =new nodoEne();
        this.Raiz.setNodo(datos);
    }
    
    // --- fin construtor
    
    // metodos de acceso

    public nodoEne getRaiz() {
        return Raiz;
    }

    public void setRaiz(nodoEne Raiz) {
        this.Raiz = Raiz;
    }
    
    // fin metodos de acceso
    
    
    /// Operaciones del arbol
    
    public ArrayList<nodoEne> retornaHijos(){
        return this.Raiz.getHijos();
    }
    
    public boolean vacio(){
        return (this.Raiz==null);
    }
    
    public cDatos retornaDatos (){
        return this.Raiz.getNodo();
    }
   
    
    
    public nodoEne buscarNodo(String placa, nodoEne ayudante){
        
        if (ayudante.getNodo().getPlaca()==placa){
            return ayudante;
        } else {
            //recorrer hijos 
            for(nodoEne hijo: ayudante.getHijos()){
                nodoEne nodoEncontrado= buscarNodo(placa, hijo);
                if(nodoEncontrado!=null){
                    return nodoEncontrado;
                }
            }
        }
        return null; 
    }
    
}//FIN DE LA CLASE ARBOLENE
    
