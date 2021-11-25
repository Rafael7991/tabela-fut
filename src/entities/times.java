package entities;

public class times {
	
	private String nome;
	public int ponto;
	public int golPro;
	public int golContra;
	public int saldo;
	public int vit;
	

	
	public times(String nome, int ponto, int vit) {
		this.nome = nome;
		this.ponto = ponto;
		this.vit = vit;
	}
	
	
	public times(String nome) {
		this.nome = nome;
	}
	
	public times() {
	
	}
	
	private void saldo(){
		this.saldo = golPro - golContra; 
	}
	
	public void vit() {
		this.vit = this.vit + 1;
	}
	
	public int getVit() {
		return vit;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPonto() {
		return ponto;
	}
	public void setPonto(int ponto) {
		this.ponto = this.ponto + ponto;
	}
	public int getGolPro() {
		return golPro;
	}
	public void setGolPro(int golPro) {
		this.golPro = this.golPro + golPro;
	}
	public int getGolContra() {
		return golContra;
	}
	public void setGolContra(int golContra) {
		this.golContra = this.golContra + golContra;
	}
	public int getSaldo() {
		return golPro - golContra;
	}
	
	
	
	public String toString(){ 
		   return String.format("%s%s%s%s%s%s%s%n", this.nome, " PG: ", this.ponto, " V: ", this.vit, " SG: ", getSaldo());
		 }

	
	

	
	

}
