package entities;

public class pessoaFisica extends contribuinte {

    private double gastosSaude;

    public pessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    @Override
    public double imposto() {
        if (getRendaAnual() < 20000.00 ){
            return getRendaAnual() * 0.15 - gastosSaude * 0.5;
        } else {
            return getRendaAnual() * 0.25 - gastosSaude * 0.5;
        }
    }
}
