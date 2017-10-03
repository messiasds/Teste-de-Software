package aula;

public interface Sena {
	/*
	 * retorna um array com valores no intervalo [1,60] se n estiver no intervalo
	 * [6,12] ou uma exceção caso contrário
	 */
	public int[] create(int n) throws NullPointerException;
}
