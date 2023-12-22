package entities;

public class pessoaJuridica extends contribuinte {

    private Integer quantidadeFuncionarios;

    public pessoaJuridica(String nome, double rendaAnual, Integer quantidadeFuncionarios) {
        super(nome,rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double imposto() {
        if (quantidadeFuncionarios > 10){
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }
}

