package modelo.basico.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno{

    private Double valorBolsa;

    public AlunoBolsista(){

    }

    public AlunoBolsista(String nome, Long matricula, Double valorBolsa) {
        super(nome, matricula);
        this.valorBolsa = valorBolsa;
    }

    public Double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
