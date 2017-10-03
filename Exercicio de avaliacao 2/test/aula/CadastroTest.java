package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.nio.channels.AsynchronousServerSocketChannel;

public class CadastroTest {
	
	@Mock
	Cadastro cadastro;
	
	@Before
	public void setup() throws IOException {
		cadastro=mock(Cadastro.class);
		when(cadastro.insert(1,"De volta para o futuro")).thenReturn(true);
		when(cadastro.insert(2,null)).thenReturn(false);
		when(cadastro.insert(3,"")).thenReturn(false);
		
	}
	
	
	@Test
	public void insertTeste1() throws IOException {
		assertTrue(cadastro.insert(1,"De volta para o futuro"));
	}
	
	@Test
	public void insertTeste2() throws IOException {
		assertFalse(cadastro.insert(2,null));
	}
	
	@Test
	public void insertTeste3() throws IOException {
		assertFalse(cadastro.insert(3,""));
	}
	
	// teste da excessao
	
	@Test(expected=Exception.class)
	public void imprimirExcessaoTeste() throws Exception {
		doThrow(new Exception("TESTE")).when(cadastro).imprimir();
		
	}
	
	
}
