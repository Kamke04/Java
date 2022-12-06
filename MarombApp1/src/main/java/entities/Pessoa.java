package entities;

/**
 * @author otavio_dalla-bona
 *
 */
public class Pessoa {
	private String nome;
	private String sexo;
	private String biotipo;
	private String meta;
	private String email;
	private String senha;
	private int idade;
	private double peso;
	private double altura;
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, String sexo, String biotipo, String meta, String email, String senha, int idade,
			double peso, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.biotipo = biotipo;
		this.meta = meta;
		this.email = email;
		this.senha = senha;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public Pessoa(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getBiotipo() {
		return biotipo;
	}
	public void setBiotipo(String biotipo) {
		this.biotipo = biotipo;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	public double calcularIMC(double peso, double altura)
	   {
	     double result = peso/(altura*altura);
	      return result;
	   }
	  

	/*public String toString () {
	      String result;
	      if (imc <= 19)
	         result = "Abaixo do Peso";
	      else
	         if (imc <= 25)
	            result = "Peso ideal";
	         else
	            if (imc <= 30)
	               result = "Acima do Peso";
	            else
	               if (imc <= 35)
	                  result = "Obesidade Leve";
	               else
	                  result = "Obesidade"; 
	      
	      return result;

	}*/


}
