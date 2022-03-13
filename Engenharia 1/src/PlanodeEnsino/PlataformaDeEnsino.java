package PlanodeEnsino;

import java.util.LinkedList;
import java.util.List;

public class PlataformaDeEnsino {
	private List<Pessoa> pessoas = new LinkedList<Pessoa>();
	private List<Turma> turmas = new LinkedList<Turma>();

	public void cadastrarPessoa(Pessoa pessoa){
		pessoas.add(pessoa);
	}
	
	public List<Pessoa> buscarPessoas (String nome){
		List<Pessoa> pessoasEncontradas = new LinkedList<Pessoa>();
		for (Pessoa pessoa : this.pessoas) {
			if(pessoa.getNome().equals(nome)) {
				pessoasEncontradas.add(pessoa);
			}
		
		}
		return pessoasEncontradas;
		}
	
	public Pessoa buscarPessoaPorTelefone (String telefone){
		Pessoa telPessoasEncontrados =null;
		for (Pessoa pessoa: this.pessoas) {
			if(pessoa.getTelefone().equals(telefone)) {
				telPessoasEncontrados = pessoa;
				break;
			}
		}
		return telPessoasEncontrados;
	}
	
	public Pessoa buscarPessoaPorEmail (String email){
		Pessoa emailPessoasEncontradas = null;
		for (Pessoa pessoa: this.pessoas) {
			if (pessoa.getEmail().equals(email)) {
				emailPessoasEncontradas = pessoa;
				break;
			}
		}
		return emailPessoasEncontradas;
	}
	
	public void cadastrarTurma(Turma turma) {
		turmas.add(turma);
	}
	
	public List<Turma> buscarTurmaPorSala (String sala){
		List<Turma> salasEncontradas = new LinkedList<Turma>();
		for (Turma turma: this.turmas) {
			if(turma.getSala().equals(sala)) {
				salasEncontradas.add(turma);
			}
		}
		return salasEncontradas;
	}
	
	public List<Turma> buscarTurmaPorMateria(String materia){
		List<Turma> turmaMateriaEncontradas = new LinkedList<Turma>();
		for (Turma turma: this.turmas) {
			if (turma.getMateria().equals(materia)) {
				turmaMateriaEncontradas.add(turma);
			}
		}
		return turmaMateriaEncontradas;
	}
	
	public List<Turma> buscarTurmaPorHorario(String horario){
		List<Turma> turmaHorarioEncontrado = new LinkedList<Turma>();
		for(Turma turma: this.turmas){
			if(turma.getHorario().equals(horario)) {
				turmaHorarioEncontrado.add(turma);
			}
		}
		return turmaHorarioEncontrado;
	}
}


