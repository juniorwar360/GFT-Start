 

 
	public class ContaPoupanca extends Conta {
	    
	    public ContaPoupanca(Cliente novoCliente) {
	        super(novoCliente);
	    }
	    
	    @Override
	    public double atualizaTaxa (double taxa) {
	        setSaldo(getSaldo() * (1 + (2 * (taxa))));
	        return getSaldo();
	    }
	    
	}

 	
