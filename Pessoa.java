public class Pessoa {
    private String nomecompleto;
    private String datadenacimento;
    private float cpf;
    String hoje;//data de hoje.

    public Pessoa(String nomecompleto,String datadenacimento,float cpf){
        this.nomecompleto = nomecompleto;
        this.datadenacimento = datadenacimento;
        this.cpf = cpf;
    }
    public String getNomecompleto(){
        return nomecompleto;
    }
    public String getdatadenacimento(){
        return datadenacimento;
    }
    public float getCpf(){
        return cpf;
    }
    public void setNomecompleto(String nomecompleto){
        this.nomecompleto = nomecompleto;
    }
    public void setDatadenacimento(String datadenacimento){
        this.datadenacimento = datadenacimento;
    }
    public void setCpf(float cpf){
        this.cpf = cpf;
    }
    public void trotaridade(String datadenacimento,String hoje){
        if(datadenacimento < hoje){
            System.out.println("idade:"+(datadenacimento-hoje));
        }
        else({
            System.out.println("ERRO");
        }
    }
}
