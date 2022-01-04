package Perguntados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class executavel {

	public static void main(String[] args) {
		
		
		List<String> Perguntas = new ArrayList<String>();

		List<String> Respostas = new ArrayList<String>();
		
		

			Scanner sc = new Scanner(System.in);
			Quiz pergunta = new Quiz();
			pergunta.setNome();
			Quiz.adcionaPerguntas();
			Quiz.iniciaQuiz();
			Quiz.adcionaRespostas();
			Quiz.verificaResposta();
			

	}

}
