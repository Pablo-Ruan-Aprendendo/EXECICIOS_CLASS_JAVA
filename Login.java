public class Login{
    
    private String usuario;
    private String senha;
    private String nome;

public Login(String usuario,String senha,String nome){
    this.usuario = usuario;
    this.senha = senha;
    this.nome = nome;
}

public String getUsuario(){
    return usuario;
}
public String getSenha(){
    return senha;
}
public String getNome(){
    return nome;
}
public void setUsuario(){
    this.usuario = usuario;
}
public void setSenha(){
    this.senha = senha;
}
public void setNome(){
    this.nome = nome;
}

public void novousuario(){
    System.out.println("DIGITE SEU NOME DE USUARIO");
    String usuario = scan.nextLite(); 
    
    System.out.println("DIGITE SUA SENHA DE ACESSO");
    String senha = scan.nextLite();
    
    System.out.println("DIGITE SEU NOME E SOBRENOME");
    String nome =scan.nextLite();

    public void listadeusuarios.adicionar(String usuario,String senha,String nome){
    this.usuario = usuario;
    this.senha = senha;
    this.nome = nome;
    }
}     
}