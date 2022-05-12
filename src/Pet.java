public class Pet {
    private String nome_pet;
    private String raca;
    private String idade;
    private String cor;
    private String nome_dono;
    
    public String getNomePet() {
    	return nome_pet;
    }
    
    public void setNomePet(String nome_pet) {
    	this.nome_pet = nome_pet;
    }

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome_dono() {
		return nome_dono;
	}

	public void setNome_dono(String nome_dono) {
		this.nome_dono = nome_dono;
	}

	@Override
	public String toString() {
		return "Pet [nome_pet=" + nome_pet + ", raca=" + raca + ", idade=" + idade + ", cor=" + cor + ", nome_dono="
				+ nome_dono + "]";
	}
   
    
}
