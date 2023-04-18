public class A {
    private int valor;

    public A(int numero) {
        valor = numero;
    }

    public int obterDobro() {
        return valor * 2;
    }

    public void atualizarValor(int novoValor) {
        valor = novoValor;
    }
}
