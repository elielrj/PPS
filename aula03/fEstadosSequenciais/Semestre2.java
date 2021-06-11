package PPS.aula03.fEstadosSequenciais;

public class Semestre2 implements Semestre {

	@Override
	public String getSemestre() {
		return "Semestre 2";
	}

	public void avancar(Aluno aluno){
		aluno.setSemestre(new Semestre3());
	}

}
