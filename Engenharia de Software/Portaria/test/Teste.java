/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import portaria.Apartamento;
import portaria.Morador;
import portaria.Portaria;

/**
 *
 * @author guilh
 */
public class Teste {
    
    public Teste() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    public void teste(){
    
        Portaria portaria = new Portaria();
        
        assertEquals(portaria.getMoradores().size(),0);
        
        portaria.cadastroMorador(new Morador("Paulo", "12345678", new Apartamento("Bloco A", "1 Andar", "123")));
        portaria.cadastroMorador(new Morador("João", "443312212", new Apartamento("Bloco B", "5 Andar", "554")));
        portaria.cadastroMorador(new Morador("Pedro", "7556834114", new Apartamento("Bloco A", "4 Andar", "412")));
        portaria.cadastroMorador(new Morador("José", "333233144", new Apartamento("Bloco C", "5 Andar", "522")));
        assertEquals(portaria.getMoradores().size(), 4);
        
        //Buscas
        List<Morador> busca1 = portaria.buscaApartmento(new Apartamento("Bloco B", "5 Andar", "554"));
        assertEquals(busca1.size(), 1);
        
        
        Morador morador1 = portaria.buscaMatricula("12345678");
        assertEquals(morador1.getApartamento().getAndar(), "1 Andar");
	assertEquals(morador1.getApartamento().getNumero(), "123");
        assertEquals(morador1.getApartamento().getBloco(), "Bloco A");
}
}
