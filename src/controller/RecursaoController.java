package controller;

public class RecursaoController {
	public int vezesNum(int numGrande, int numProcurar){
		
		/*
		 * Se o resultado da divisao inteira do numero por 10 for 0
		 * ele ja verificou todos os algarismos, entao a recursao pode parar
		 */
		if (numGrande == 0) {
			return 0;
		}
		
		/*
		 * aqui só verifica se o numero a procurar é o atual
		 * se for, soma 1. caso contrario continua a recursao
		 */
		else if(numGrande % 10 == numProcurar) {
			return 1 + vezesNum(numGrande / 10, numProcurar);
		}
		return vezesNum(numGrande / 10, numProcurar);
	}
}
