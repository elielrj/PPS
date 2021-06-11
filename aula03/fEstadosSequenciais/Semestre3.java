package PPS.aula03.fEstadosSequenciais;
public class Semestre3 implements Semestre {

	@Override
	public String getSemestre() {
		return "Semestre 3";
	}

	public void avancar(Aluno aluno){
		throw new RuntimeException("Não avança! Chegou ao final");
	}
}
