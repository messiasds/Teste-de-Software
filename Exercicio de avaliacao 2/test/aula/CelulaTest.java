package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class CelulaTest {

	@Mock
	private Celula celula;

	@Before
	public void setup() {

		celula = mock(Celula.class);
		Celula resp = mock(Celula.class); // celula de resposta
		when(celula.getNome()).thenReturn("Teste");
		when(celula.getProxima()).thenReturn(resp);
		when(celula.getAnterior()).thenReturn(resp);
		

	}

	// teste getNome

	@Test
	public void getNomeTeste() {
		assertEquals("Teste", celula.getNome());
	}

	@Test
	public void getNomeNullTeste() {
		when(celula.getNome()).thenReturn(null);
		assertNull(celula.getNome());
	}
	
	@Test
	public void getProxima() {
		assertNotNull(celula.getProxima());
	}
	
	@Test
	public void getProximaNull() {
		when(celula.getProxima()).thenReturn(null);
		assertNull(celula.getProxima());
	}
	
	@Test
	public void getAnteriorTeste() {
		assertNotNull(celula.getAnterior());
	}
	
	@Test
	public void getAnteriorNullTeste() {
		when(celula.getAnterior()).thenReturn(null);
		assertNull(celula.getAnterior());	}

}
