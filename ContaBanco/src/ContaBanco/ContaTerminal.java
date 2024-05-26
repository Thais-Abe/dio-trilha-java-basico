package ContaBanco;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String Nome_cliente;
    private double saldo;

    public ContaTerminal(String nome, String agencia, int numero, double saldo ) {
        this.numero = numero;
        this.agencia = agencia;
        Nome_cliente = nome;
        this.saldo = saldo;
    }

    public ContaTerminal() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome_cliente() {
        return Nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        Nome_cliente = nome_cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + getNome_cliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                getAgencia() + ", conta " + getNumero() + "e seu saldo " + getSaldo() + " já esta disponível para saque";
    }
}
