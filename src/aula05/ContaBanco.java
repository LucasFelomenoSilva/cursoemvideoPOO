package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        saldo = this.saldo = 0;
        status = this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.tipo = tipo;
        this.status = true;
        if (tipo == "CC") {
            this.saldo = 50;
        } else if (tipo == "CP"){
            this.saldo = 150;
        }
    }
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0){
            System.out.println("Conta em débito");
        } else {
            this.status = false;
            System.out.println("Conta encerrada");
        }
    }
    public void depositar(float valor) {
        if (getStatus()) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossíevl depositar");
        }
    }
    public void sacar(float valor) {
        if (getStatus()) {
            if (saldo > valor) {
                saldo = saldo - valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensal() {
        float valor = 0;
        if (getTipo() == "CC") {
            valor = 12;
        } else if (getTipo() == "CP") {
            valor = 20;
        }
        if (status) {
            if (getSaldo() > valor) {
                saldo = saldo - valor;
            } else {
                System.out.println("Impossível pagar");
            }
        }
    }

}
