package paranagua.eic.oo;

public class ContaBancaria {

    //atributos
    public int numero;
    public int agencia;
    public double saldo;
    public String cliente;

    //metodos

    public void sacar(double qtde){
        saldo = saldo - qtde;
    }

    public void depositar(double qtde){
        saldo = saldo + qtde;
    }

    public String toString(){
        String s = "Número:"+numero+" Agência:"+agencia+" Saldo: R$"+saldo+" Cliente:"+cliente;
        return s;
    }
}
