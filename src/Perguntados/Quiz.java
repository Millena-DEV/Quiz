package Perguntados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

	private String nome;
	private static List<String> Perguntas = new ArrayList<String>();
	private static List<String> Respostas = new ArrayList<String>();
	private static int acertos=0;
	private static int erros=0;
	private String pergunta;
	
	
	static void verificaResposta() {
		for (int posi = 0; posi < Perguntas.size(); posi++) {
			if (Perguntas.get(posi) == Respostas.get(posi));
			Quiz.acertos++;
			System.out.println("total de acertos"+Quiz.acertos);
		}
		
		for (int i = 0; i < Respostas.size(); i++) {
			if (Perguntas.get(i) != Respostas.get(i));
				Quiz.erros++;
				System.out.println("total de erros"+Quiz.erros);
		}
		
	}

	static void iniciaQuiz() {
		Scanner sc = new Scanner(System.in);
		adcionaRespostas();
		for (int pos = 0; pos <= Quiz.Perguntas.size(); ) {
			System.out.println(Quiz.Perguntas.get(pos));
			String Digitada = sc.nextLine();
			if (Digitada.equals(Quiz.Respostas.get(pos)));
			pos ++;
			}
		
		}
	

	public static List<String> adcionaRespostas() {
		ArrayList<String> respostas = new ArrayList<String>();
		Respostas.add("4");
		Respostas.add("520");
		Respostas.add("19 de Novembro");
		Respostas.add("Brasilia");
		Respostas.add("8 de maio");

		return respostas;

	}

	public static List<String> adcionaPerguntas() {
		ArrayList<String> perguntas = new ArrayList<String>();
		Perguntas.add("Qual a soma de 2+2? ");
		Perguntas.add("Quantos anos tem o Brasil? ");
		Perguntas.add("Que dia é comemorado o dia da Bandeira? ");
		Perguntas.add("Qual a Capital do Brasil");
		Perguntas.add("Que dia é comemorado o dia das Mães");
		return perguntas;
	}



	public String getNome() {
		return nome;
	}

	public void setNome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do Jogador");
		String resposta = sc.nextLine();
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

}



