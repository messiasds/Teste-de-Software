package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class Lista2Test {

	@Mock
	Lista lista;

	@Before
	public void setup() {
	
		lista = mock(Lista.class);
		when(lista.get(anyInt())).thenReturn("aaa", "bbb").thenThrow(new ArrayIndexOutOfBoundsException());
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testeConsecutivoGet() {
		
		System.out.println("TESTE DO EXERCICIO 5");
		
		System.out.println(lista.get(1));
		System.out.println(lista.get(1));
		System.out.println(lista.get(1));
	}

}
