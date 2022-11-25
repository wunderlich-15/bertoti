/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author guilh
 */
public class Portaria {
    private List<Morador> moradores = new LinkedList<Morador>();
    
    public void cadastroMorador(Morador morador){
        moradores.add(morador);
    }
    
    
    public Morador buscaMatricula(String matricula){
        for(Morador morador: moradores){
            if(morador.getMatricula().equals(matricula)){
                return morador;
            }
        } return null;
    }
    
    public List<Morador> buscaApartmento(Apartamento apartamento){
        List<Morador> buscamorador = new LinkedList<Morador>();
        for(Morador morador: moradores){
            if(morador.getApartamento().comparar(apartamento)){
                buscamorador.add(morador);
            }
        }return buscamorador;
    }
    
    public List<Morador> getMoradores(){
    return moradores;
}
    public static void main(String[] args) {
        
    }
}
