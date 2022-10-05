public class Livros{
 
    private String titulo;
    private String autor;
    private String editora;
    private String adicionarlivro;
    int anolancamento;
    int numerodepaginas;


public Livros(String titulo,String autor,String editora){
    this.titulo=titulo;
    this.autor=autor;
    this.editora=editora;
}

public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
public String getEditora(){
    return editora;
}
public String getAdicionarlivro(){
    return adicionarlivro;
}
public int getAnolancamento(){
    return anolancamento;
}
public int getNumerodepagnas(){
    return numerodepaginas;
}

public void setTitulo(String titulo){
    this.titulo = titulo;
}
public void setAutor(String autor){
    this.autor = autor;
}
public void setEditora(String editora){
    this.editora = editora;
}
public void setAdicionarlivro(String adicionarlivro){
    this.adicionarlivro = adicionarlivro;
}
public void setAnolancamento(int anolancamento){
    this.anolancamento = anolancamento;
}
public void setNumerodepaginas(int numerodepaginas){
    this.numerodepaginas = numerodepaginas;
}

public void adicionarlivro(String titulo,String autor,String editora){
    this.titulo=titulo;
    this.autor=autor;
    this.editora=editora;
}
public void consultaracervo(){
    System.out.println(verificarestoque);
    
}