public class Multas{
   
  private double valor;
  private int multa = 2;

  public double getvalor(){
    return valor;
  }
  public int getMulta(){
    return multa;
  }
  public void setValor(double valor){
      this.valor = valor;
  }
  public void setMulta(int multa){
    this.multa = multa;
  }
  public void multaacumulada(Double multa){
	  valor += multa;
  }
  public void pagarmultas(Double multa){
		valor -= multa;
  }
  public void verificatotaldemultas(){
		System.out.println("Valor total das multas: "+getValor());
	}
}