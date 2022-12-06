package entities;

public class Cadastro extends Pessoa {
	
	public void validarSenha(String senha) {
		
		if(getSenha() == senha) {
			System.out.println("Senha correta!");
		}else{
			System.out.println("Senha invalida!");
		}
		
	}
	public void validarEmail(String email) {
		if(getEmail() == email) {
			System.out.println("Email valido!");
		}else{
			System.out.println("Email invalida!");
		}

} 
}


