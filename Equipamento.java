public class Equipamento {
    private int codigoIdentificador;
    private double preco;

    int getCodigoIdentificador() {
        return this.codigoIdentificador;
    }

    void setCodigoIdentificador(int novoCodigo) {
        this.codigoIdentificador = novoCodigo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }


}