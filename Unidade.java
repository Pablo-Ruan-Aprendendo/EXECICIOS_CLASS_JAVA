public class Estoque{
    private int codigo;
    private String autor;
    
    Estoque estoque1 = new Estoque(); 

    public int getCodigo(){
        return codigo;
    }
    public String autor(){
        return autor;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public void verificaestoque(){
		System.out.println("\nAUTOR................Andrzej Sapkowski\n
        TITULO...............The Witcher - O Ultimo Desejo\n
        EDITORA..............WMF MARTINS FONTES\n
        NUMERO DE PAGNAS.....320\n
        ANO DE LANÇAMENTO....1993\n\n
        
        ==========================================
        \nAUTOR................Andrzej Sapkowski\n
        TITULO...............The Witcher - A espada do destino\n
        EDITORA..............WMF MARTINS FONTES\n
        NUMERO DE PAGNAS.....380\n
        ANO DE LANÇAMENTO....1992\n\n
        
        ==========================================
        \nAUTOR................Andrzej Sapkowski\n
        TITULO...............The Witcher - O Sangue dos Elfos\n
        EDITORA..............WMF MARTINS FONTES\n
        NUMERO DE PAGNAS.....284\n
        ANO DE LANÇAMENTO....1994\n\n
        
        ==========================================");
	}  
    }
