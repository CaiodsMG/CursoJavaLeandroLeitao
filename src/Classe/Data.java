package Classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String dataFormatadaPadrao() {
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, this.mes, this.ano);
    }

    Data(){
        //dia = 01;
        //mes = 01;
        //ano = 1970;
        this(1,1,1970);
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}



