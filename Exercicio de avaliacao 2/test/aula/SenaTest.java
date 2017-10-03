package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class SenaTest {

	@Mock
	private Sena sena;
	int vetor[];

	@Before
	public void setup() {

		sena = mock(Sena.class);
		when(sena.create(5)).thenThrow(new NullPointerException());
		when(sena.create(6)).thenReturn(new int[] { 1, 2, 3, 4, 5, 6 });
		when(sena.create(12)).thenReturn(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 });
		when(sena.create(13)).thenThrow(new NullPointerException());
		vetor=sena.create(12);
	}

	// teste com 6
	@Test
	public void createTeste1() {

		assertEquals(6, sena.create(6).length);
	}

	// teste com 12
	@Test
	public void createTeste2() {

		assertEquals(12, sena.create(12).length);
	}

	// teste com 5
	@Test(expected = NullPointerException.class)
	public void createTeste3() {

		assertNotNull(sena.create(5));
	}

	// teste com 13
	@Test(expected = NullPointerException.class)
	public void createTeste4() {

		assertNotNull(sena.create(13));
	}
	
	//teste de 1 a 60 resultado positivo
	
	@Test
	public void testeIntervaloNumero() {
		//int vetor[]= sena.create(12);
		for(int numero:vetor) {
			if(numero  < 1 || numero > 60)
				fail("Numeros fora da faixa");
		}
	}
	
	// teste de numero repetidos
	
	@Test
	public void testeNumsRepetidos() {
		
		for(int i=0;i<vetor.length-1;i++) {
			if(vetor[i]==vetor[i+1])
				fail("O numero "+ vetor[i]+ "está sendo repetido");
		}
	}
	
	// teste ordem do vetor;
	
	@Test
	public void testeOrdem() {

		for(int i=0;i<vetor.length-1;i++) {
			if(vetor[i]> vetor[i+1])
				fail("O vetor esta desordenado: " + vetor[i] + " " + vetor[i+1]);
		}
		
	}
		
	

}
