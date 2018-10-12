package dados;

import java.util.Date;



public class operacao {
   private int id_op;
   private Date data_op;
   private float valor_op;
   private String cpf_responsavel_op;
   private int id_conta;

    /**
     * @return the id_op
     */
    public int getId_op() {
        return id_op;
    }

    /**
     * @param id_op the id_op to set
     */
    public void setId_op(int id_op) {
        this.id_op = id_op;
    }

    /**
     * @return the data_op
     */
    public Date getData_op() {
        return data_op;
    }

    
    public void setData_op(Date data_op) {
        this.data_op = data_op;
    }

    /**
     * @return the valor_op
     */
    public float getValor_op() {
        return valor_op;
    }

    /**
     * @param valor_op the valor_op to set
     */
    public void setValor_op(float valor_op) {
        this.valor_op = valor_op;
    }

    /**
     * @return the cpf_responsavel_op
     */
    public String getCpf_responsavel_op() {
        return cpf_responsavel_op;
    }

    /**
     * @param cpf_responsavel_op the cpf_responsavel_op to set
     */
    public void setCpf_responsavel_op(String cpf_responsavel_op) {
        this.cpf_responsavel_op = cpf_responsavel_op;
    }

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

   
   
}
