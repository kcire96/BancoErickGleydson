package dados;


public class conta {
    
    private int id_conta;
    private String numero_conta;
    private String cpf_titular;

    /**
     * @return the id_conta
     */
    public int getId_conta() {
        return id_conta;
    }

    /**
     * @param id_conta the id_conta to set
     */
    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    /**
     * @return the numero_conta
     */
    public String getNumero_conta() {
        return numero_conta;
    }

    /**
     * @param numero_conta the numero_conta to set
     */
    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    /**
     * @return the cpf_titular
     */
    public String getCpf_titular() {
        return cpf_titular;
    }

    /**
     * @param cpf_titular the cpf_titular to set
     */
    public void setCpf_titular(String cpf_titular) {
        this.cpf_titular = cpf_titular;
    }
    
}
