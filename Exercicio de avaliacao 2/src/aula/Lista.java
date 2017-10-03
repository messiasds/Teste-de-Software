package aula;

public interface Lista {
	public void add(String nome);

	/*
	 * retorna o nome que está na posição n ou lança uma exceção caso a posição não
	 * exista
	 */
	public String get(int n) throws ArrayIndexOutOfBoundsException;
}
