public class Gasto {
    int id;
    private String descricao;
    private String fpgto;
    private float valor;

    public Gasto(int id, String descricao, String fpgto, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.fpgto = fpgto;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFpgto() {
        return fpgto;
    }

    public float getValor() {
        return valor;
    }
}
