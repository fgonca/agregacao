/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Agregação
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.agregacao;

class Aluno 
{
	private String nome;
	private Turma turma; // referência à turma do aluno
	
	// criar Aluno: método construtor
	public Aluno(String nome) 
	{
		this.nome = nome;
	}

	// obter o nome
	public String getNome() 
	{
		return nome;
	}

	// obter a turma
	public Turma getTurma() 
	{
		return turma;
	}

	// definir a turma
	public void setTurma(Turma turma) 
	{
		this.turma = turma;
	}	
}