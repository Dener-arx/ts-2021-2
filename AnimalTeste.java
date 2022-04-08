/************************

Atividade 8

*************************/



package teste;

import org.junit.Test;
import entidade.Animal;
import entidade.Boi;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnimalTeste {

   Boi animal;
 
   	//CT01 - Teste de Nome com Menos de Cinco Caracteres
    @Test
    public void Testnomemenorquecincoletras() {
    	animal = new Boi("Ab", 15);
    	assertNull(animal.getNome());
    }
    
    //CT02 - Teste Nome com mais de 100 caracteres
    @Test
    public void Testnomemaiorquecemletras() {
    	animal = new Boi("Iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"
    			+ "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 15);
    	assertNull(animal.getNome());
    }
    
    //CT03 - Teste Nome Com caractere especial
    @Test
    public void Testnomecomcaractereespecial() {
    	animal = new Boi("S@rgento", 15);
    	assertNull(animal.getNome());
    }
   
    //CT04 - Teste idade menor que 1 ano
    @Test
    public void Testidademenorqueumano() {
    	animal = new Boi("Sargento", 0);
    	assertNull(animal.getIdade()); //Animal nao tem o metodo getIdade
    }
    
    //CT05 - Teste idade maior que 20 anos
    @Test
    public void Testidademaiorquevinteanos() {
    	animal = new Boi("Sargento", 25);
    	assertNull(animal.getIdade()); //Animal nao tem o metodo getIdade
    } 
    
}
