
public class Cliente {
	
 
	    private String nome;
	    private String endereco;
	    private String cpf;
	    
	    public String getNome() {
	        return this.nome;
	    }
	    
	    public Cliente(String nome) {
	        this.nome = nome;
	        this.endereco = "";
	        this.cpf = "000.000.000-00";
	    }
	    
	    public Cliente(String nome, String endereco, String cpf) {
	        this.nome = nome;
	        this.endereco = endereco;
	        this.cpf = cpf;
	    }
	    
	}
 
