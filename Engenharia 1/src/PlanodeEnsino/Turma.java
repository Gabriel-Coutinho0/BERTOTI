package PlanodeEnsino;

public class Turma {
	private String materia;
	private String horario;
	private String sala;
	
	public Turma(String materia, String horario, String sala) {
		this.materia = materia;
		this.horario = horario;
		this.sala = sala;
	}
	public String getMateria() {
		return materia;
	
	}
	
	public void setMateria(String novaMateria) {
		this.materia = novaMateria;
		
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String novoHorario) {
		this.horario= novoHorario;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String novaSala) {
		this.sala= novaSala;
	}
}
