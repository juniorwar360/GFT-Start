 

public class AtualizadorDeContas {
	 
		   
	    private double saldoTotal = 0;
	    private double taxa;
	    
	    public AtualizadorDeContas(double taxa) {
	        this.taxa = taxa;
	    }
	    
	    public void roda(Conta c) {
	        double novoValor = 0;
	        System.out.println("A Conta do(a) " + c.getTitular() + " possuia: R$ " + c.getSaldo());
	        novoValor = c.atualizaTaxa(taxa);
	        System.out.println("Agora a conta possui: R$ " + c.getSaldo());
	        setSaldoTotal(getSaldoTotal() + (novoValor ));
	    }
	    
	    public void atualizarTodas(Banco b) {
	       int count = 0;
	       for (; count < b.contas.size(); count++) {
	           roda(b.contas.get(count));
	       }
	    }
	    
	    public double getSaldoTotal() {
	        return saldoTotal;
	    }

	    public void setSaldoTotal(double saldoTotal) {
	        this.saldoTotal = saldoTotal;
	    }
	    
	}
 
