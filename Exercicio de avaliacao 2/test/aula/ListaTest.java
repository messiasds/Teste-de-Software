package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class ListaTest {

	@Mock
	private Lista lista;

	@Before
	public void setup() {
		
		lista = mock(Lista.class);
		when(lista.get(anyInt())).thenReturn("Nome");
		when(lista.get(20)).thenThrow(new ArrayIndexOutOfBoundsException());
	}
	
	@Test
	public void getTeste() {
		
		assertEquals("Nome",(lista.get(4)));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void getExcessaoTeste() {
		assertEquals("nome",lista.get(20));
	}

	
}

