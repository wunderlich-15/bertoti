/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria;

/**
 *
 * @author guilh
 */
public class Apartamento {
    private String bloco;
    private String andar;
    private String numero;
    
    public Apartamento(String bloco, String andar, String numero){
        this.bloco = bloco;
        this.andar = andar;
        this.numero = numero;
    }

    /**
     * @return the bloco
     */
    public String getBloco() {
        return bloco;
    }

    /**
     * @param bloco the bloco to set
     */
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    /**
     * @return the andar
     */
    public String getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(String andar) {
        this.andar = andar;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public boolean comparar(Apartamento apartamento){
        return this.bloco.equals(apartamento.bloco) &&
                this.andar.equals(apartamento.andar)&&
                this.numero.equals(apartamento.numero);
    }
}
