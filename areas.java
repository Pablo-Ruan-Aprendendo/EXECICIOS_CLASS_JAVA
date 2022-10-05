public class areas {
    private String norte;
    private String sul;
    private String oeste;
    private String leste;

    public String getNorte(){
        return norte;
    }
    public String getSul(){
        return sul;
    }
    public String getOeste(){
        return oeste;
    }
    public String getLest(){
        return leste;
    }
    public void setNorte(String norte){
        this.norte = norte;
    }
    public void setSul(String sul){
        this.sul = sul;
    }
    public void setOeste(String Oeste){
        this.oeste = oeste;
    }
    public void setLeste(String leste){
        this.leste = leste;
    }

    public void estantes_norte(){
        System.out.println("estantes ao norte vão de A1 a A14 e C2 a C8");
    }
    public void estantes_sul(){
        System.out.println("estantes ao norte vão de B1 a B5 e C9 a C11");
    }
    public void estantes_oeste(){
        System.out.println("estantes ao norte vão de D1 a D29 e E1 a E19");
    }
    public void estantes_leste(){
        System.out.println("estantes ao norte vão de F1 a F21 e g1 a G22 e C1");
    }
}
