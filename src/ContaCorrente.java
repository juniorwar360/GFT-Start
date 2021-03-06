 

 

	public class ContaCorrente extends Conta    {
	    
	    public ContaCorrente(Cliente novoCliente) {
	        super(novoCliente);
	    }

	    @Override
	    public double atualizaTaxa (double taxa) {
	        setSaldo(getSaldo() * (1 + (3 * (taxa))));
	        return getSaldo();
	    }    
	    
	    public boolean deposita (double valor) {
	        if (valor > 0) {
	            setSaldo((getSaldo() + valor) - 0.1);
	            return true;
	        } 
	        return false;
	    }

	    

	}

 
