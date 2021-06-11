package PPS.aula03.fEstadosSequenciais;

public class Aluno {

	private Semestre semestre;

	public Aluno() {
		this.semestre = new Semestre1();
	}

	public void avancar() {
		semestre.avancar(this);
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public String getSemestre() {
		return semestre.getSemestre();
	}
}
