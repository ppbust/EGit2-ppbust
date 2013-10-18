package spai.egit2;

public class NumeroEntero {
    private int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    public NumeroEntero() {
        this(0);
    }

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
    	if(numValido()){
    		this.valor = valor;
    	}
    	else{
    		this.valor = 0;
    	}
        
    }

    public void incrementar() {
        this.setValor(this.valor + 1);
    }

    public void doblar() {
        this.setValor(this.valor * 2);
    }

    public void decrementar() {
        this.valor--;
    }
    
    public boolean numValido(){
    	boolean result = false;
    	if((this.getValor()>=0)&&(this.getValor()<=100)){
    		result = true;
    	}
    	return result;
    }
}
