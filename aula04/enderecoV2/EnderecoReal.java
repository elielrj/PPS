package PPS.aula04.enderecoV2;

public class EnderecoReal implements Endereco {
    private  String rua;

    public EnderecoReal(String rua) {
        this.rua = rua;
    }

    @Override
    public String getRua() {
        return  rua;
    }
}
