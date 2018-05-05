package EX06;

public class Cliente {
	private String nome;
	private String email;
	private int telefone;
	private String endereco;
	private double mesJaneiro;
	private double mesFevereiro;
	private double mesMarco;
	private double mesAbril;
	private double mesMaio;
	private double mesJunho;
	private double mesJulho;
	private double mesAgosto;
	private double mesSetembro;
	private double mesOutubro;
	private double mesNovembro;
	private double mesDezembro;
	

	public Cliente(String nome, String email, int telefone, String endereco,  double mesJaneiro, double mesFevereiro,double mesMarco, double mesAbril,double mesMaio,double mesJunho,double mesJulho,double mesAgosto,double mesSetembro,double mesOutubro,double mesNovembro,double mesDezembro){
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.mesJaneiro = mesJaneiro;
		this.mesFevereiro = mesFevereiro;
		this.mesMarco = mesMarco;
		this.mesAbril = mesAbril;
		this.mesMaio = mesMaio;
		this.mesJunho = mesJunho;
		this.mesJulho = mesJulho;
		this.mesAgosto = mesAgosto;
		this.mesSetembro = mesSetembro;
		this.mesOutubro = mesOutubro;
		this.mesNovembro = mesNovembro;
		this.mesDezembro = mesDezembro;
	} 
	
	public Cliente(int telefone, String endereco) {
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	
	public double getMesJaneiro() {
		return mesJaneiro;
	}

	public void setMesJaneiro(double mesJaneiro) {
		this.mesJaneiro = mesJaneiro;
	}

	public double getMesFevereiro() {
		return mesFevereiro;
	}

	public void setMesFevereiro(double mesFevereiro) {
		this.mesFevereiro = mesFevereiro;
	}

	public double getMesMarco() {
		return mesMarco;
	}

	public void setMesMarco(double mesMarco) {
		this.mesMarco = mesMarco;
	}

	public double getMesAbril() {
		return mesAbril;
	}

	public void setMesAbril(double mesAbril) {
		this.mesAbril = mesAbril;
	}

	public double getMesMaio() {
		return mesMaio;
	}

	public void setMesMaio(double mesMaio) {
		this.mesMaio = mesMaio;
	}

	public double getMesJunho() {
		return mesJunho;
	}

	public void setMesJunho(double mesJunho) {
		this.mesJunho = mesJunho;
	}

	public double getMesJulho() {
		return mesJulho;
	}

	public void setMesJulho(double mesJulho) {
		this.mesJulho = mesJulho;
	}

	public double getMesAgosto() {
		return mesAgosto;
	}

	public void setMesAgosto(double mesAgosto) {
		this.mesAgosto = mesAgosto;
	}

	public double getMesSetembro() {
		return mesSetembro;
	}

	public void setMesSetembro(double mesSetembro) {
		this.mesSetembro = mesSetembro;
	}

	public double getMesOutubro() {
		return mesOutubro;
	}

	public void setMesOutubro(double mesOutubro) {
		this.mesOutubro = mesOutubro;
	}

	public double getMesNovembro() {
		return mesNovembro;
	}

	public void setMesNovembro(double mesNovembro) {
		this.mesNovembro = mesNovembro;
	}

	public double getMesDezembro() {
		return mesDezembro;
	}

	public void setMesDezembro(double mesDezembro) {
		this.mesDezembro = mesDezembro;
	}
	
	
}
