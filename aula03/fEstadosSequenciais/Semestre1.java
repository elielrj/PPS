package PPS.aula03.fEstadosSequenciais;

public class Semestre1 implements Semestre {

	@Override
	public String getSemestre() {
		return "Semestre 1";
	}

	public void avancar(Aluno aluno){
		aluno.setSemestre(new Semestre2());
	}

}
