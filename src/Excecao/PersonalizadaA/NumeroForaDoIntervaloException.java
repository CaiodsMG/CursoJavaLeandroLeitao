package Excecao.PersonalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException {

    private String nomeDoAtributo;
    NumeroForaDoIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo.", nomeDoAtributo);
    }
}
