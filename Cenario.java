package br.com.qwasolucoes.mentoria.implementacoes.logica_programacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cenario {

	public static void main(String[] args) {
		ex36();

	}
	
	
	public static String[]ex36(){
		
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		String[] array = {"1", "2", "3", "4", "5"};
        int posicao = 2; 
        String[] resultado = logicaProgramacaoProvider.antecessorSucessorPor(array, posicao);
        
        System.out.println("Antecessor: " + resultado[0]);
        System.out.println("Sucessor: " + resultado[1]); 
        
        return resultado;

	}

	public static String[] ex35() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		String[] array = { "1", "2", "3", "4", "5" };
		String valor = "c";
		String[] resultado = logicaProgramacaoProvider.antecessorSucessorPor(array, valor);

		System.out.println("Antecessor: " + resultado[0]);
		System.out.println("Sucessor: " + resultado[1]); 

		return resultado;
	}

	public static List<Integer> ex33() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<Integer> impares;
		impares = logicaProgramacaoProvider.numerosImpares(10);
		System.out.println(impares);
		return impares;
	}

	public static List<Integer> ex32() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<Integer> impares;
		impares = logicaProgramacaoProvider.numerosPrimos(10);
		System.out.println(impares);
		return impares;
	}

	public static int[] ex31() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		Integer iniciaValores = 10;
		int[] resultado = logicaProgramacaoProvider.numerosParesArray(iniciaValores);
		return resultado;

	}

	public static int[] ex30() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		Integer iniciaValores = 10;
		int[] resultado = logicaProgramacaoProvider.numerosImparesArray(iniciaValores);
		return resultado;

	}

	public static int[] ex29() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		Integer iniciaValores = 10;
		int[] resultado = logicaProgramacaoProvider.numerosPrimosArray(iniciaValores);
		return resultado;
	}

	public static int[] ex28() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		Integer iniciaValores = 10;
		return logicaProgramacaoProvider.primeiraUltimaPosicaoArray(iniciaValores);
	}

	public static int[] ex27() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		List<Integer> valores = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);

		return logicaProgramacaoProvider.quantidadeParesImparesPrimos(valores);
	}

	public static int[] ex26() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		Integer iniciaValores = 3;
		int[] resultado = logicaProgramacaoProvider.primeiraUltimaMediaPosicaoArray(iniciaValores);
		return resultado;
	}

	public static List<Integer> ex25() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		List<Integer> numeroDuplicado = new ArrayList<>();

		numeroDuplicado.add(15);
		numeroDuplicado.add(10);
		numeroDuplicado.add(15);
		numeroDuplicado.add(15);

		List<Integer> resultado = logicaProgramacaoProvider.removerInteirosDuplicados(numeroDuplicado);
		System.out.println(resultado);
		return resultado;
	}

	public static List<BigDecimal> ex24() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<BigDecimal> removerDuplicado = new ArrayList<>();

		removerDuplicado.add(new BigDecimal("123456.789123456789"));
		removerDuplicado.add(new BigDecimal("0.0000123456789"));
		removerDuplicado.add(new BigDecimal("9876543210.123456789"));
		removerDuplicado.add(new BigDecimal("3.141592653589793238"));
		removerDuplicado.add(new BigDecimal("0.0000123456789"));
		removerDuplicado.add(new BigDecimal("0.0000123456789"));

		List<BigDecimal> resultado = logicaProgramacaoProvider.removerValoresDuplicados(removerDuplicado);
		System.out.println(resultado);
		return resultado;
	}

	public static List<String> ex23() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<String> nomeRep = new ArrayList<>();

		nomeRep.add("joao");
		nomeRep.add("Carlos");
		nomeRep.add("joao");
		nomeRep.add("almir");
		nomeRep.add("jose");
		nomeRep.add("jose");
		nomeRep.add("jose");
		nomeRep.add("jose");
		nomeRep.add("joao");
		nomeRep.add("maria");
		nomeRep.add("maria");
		nomeRep.add("josefa");
		nomeRep.add("josefa");
		nomeRep.add("arlindo");
		nomeRep.add("arlindo");

		List<String> resultado = logicaProgramacaoProvider.removerTextosDuplicados(nomeRep);
		System.out.println(resultado);
		return resultado;

	}

	public static Integer ex22() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		List<Integer> numeroDuplicado = new ArrayList<>();

		numeroDuplicado.add(15);
		numeroDuplicado.add(15);
		numeroDuplicado.add(15);
		numeroDuplicado.add(50);
		numeroDuplicado.add(11);
		numeroDuplicado.add(1);
		numeroDuplicado.add(333);
		numeroDuplicado.add(333);
		numeroDuplicado.add(333);
		numeroDuplicado.add(333);
		numeroDuplicado.add(333);
		numeroDuplicado.add(4);
		numeroDuplicado.add(5);
		numeroDuplicado.add(6);

		return logicaProgramacaoProvider.valorInteiroMaiorQtdDuplicados(numeroDuplicado);
	}

	public static String ex21() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		List<String> listaDuplicado = new ArrayList<>();

		listaDuplicado.add("joao");
		listaDuplicado.add("carlos");
		listaDuplicado.add("ze");
		listaDuplicado.add("junior");
		listaDuplicado.add("junior");
		listaDuplicado.add("junior");
		listaDuplicado.add("junior");
		listaDuplicado.add("junior");
		listaDuplicado.add("joao");
		listaDuplicado.add("joao");

		return logicaProgramacaoProvider.valorTextoMaiorQtdDuplicados(listaDuplicado);
	}

	public static List<Integer> ex20() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<Integer> listaDuplicado = new ArrayList<>();

		listaDuplicado.add(10);
		listaDuplicado.add(5);
		listaDuplicado.add(10);
		listaDuplicado.add(8);
		listaDuplicado.add(6);
		listaDuplicado.add(10);

		List<Integer> resultado = logicaProgramacaoProvider.listaInteirosDuplicados(listaDuplicado);
		System.out.println(resultado);
		return resultado;
	}

	public static List<BigDecimal> ex19() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<BigDecimal> numeroDecimal = new ArrayList<>();

		numeroDecimal.add(new BigDecimal("123456.789123456789"));
		numeroDecimal.add(new BigDecimal("0.0000123456789"));
		numeroDecimal.add(new BigDecimal("9876543210.123456789"));
		numeroDecimal.add(new BigDecimal("3.141592653589793238"));
		numeroDecimal.add(new BigDecimal("0.0000123456789"));
		numeroDecimal.add(new BigDecimal("0.0000123456789"));

		List<BigDecimal> resultado = logicaProgramacaoProvider.listaDecimalDuplicados(numeroDecimal);
		System.out.println(resultado);

		return resultado;
	}

	public static List<String> ex18() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<String> nomeRep = new ArrayList<>();

		nomeRep.add("joao");
		nomeRep.add("Carlos");
		nomeRep.add("joao");
		nomeRep.add("almir");
		nomeRep.add("jose");
		nomeRep.add("jose");
		nomeRep.add("jose");
		nomeRep.add("jose");
		nomeRep.add("joao");
		nomeRep.add("maria");
		nomeRep.add("maria");
		nomeRep.add("josefa");
		nomeRep.add("josefa");
		nomeRep.add("arlindo");
		nomeRep.add("arlindo");

		List<String> resultado = logicaProgramacaoProvider.listaTextoDuplicados(nomeRep);
		System.out.println(resultado);
		return resultado;

	}

	public static Integer ex17() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 1;
		int resultado = logicaProgramacaoProvider.somarValores(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;

	}

	public static Integer ex16() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 1;
		int resultado = logicaProgramacaoProvider.somarValoresPares(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex15() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 1;
		int resultado = logicaProgramacaoProvider.somarValoresImpares(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex14() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 1;
		int resultado = logicaProgramacaoProvider.somarValoresPrimos(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;

	}

	public static Integer ex13() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] limite = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int resultado = logicaProgramacaoProvider.somarValoresPosicoes(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex12() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] limite = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int resultado = logicaProgramacaoProvider.somarValoresParesPosicoes(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex11() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] limite = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int resultado = logicaProgramacaoProvider.somarValoresImparesPosicoes(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex10() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] limite = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int resultado = logicaProgramacaoProvider.somarValoresPrimosPosicoes(limite);
		System.out.println(resultado);
		return resultado;
	}

	public static Integer ex9() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 10;
		int multiplo = 2;
		int resultado = logicaProgramacaoProvider.somarValoresPosicoesParesMultiplosDe(limite, multiplo);
		System.out.println(resultado);
		return resultado;

	}

	public static boolean ex8() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 7;
		boolean resultado = logicaProgramacaoProvider.multiploDeSete(valor);
		System.out.println(resultado);
		return resultado;

	}

	public static String ex7() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 6;
		String resultado = logicaProgramacaoProvider.parOuImpar(valor);
		System.out.println(resultado);
		return resultado;
	}

	public static String ex6() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 0;
		String resultado = logicaProgramacaoProvider.parOuImparOuZero(valor);
		System.out.println(resultado);
		return resultado;
	}

	public static String ex5() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 0;
		String resultado = logicaProgramacaoProvider.parOuImparOuZero(valor);
		System.out.println(resultado);
		return resultado;
	}

	public static int[] ex4() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 5;
		int[] resultado = logicaProgramacaoProvider.obterDobrosAteDobroInformado(valor);
		return resultado;
	}

	public static int[] ex3() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 8;
		int[] resultado = logicaProgramacaoProvider.obterDobrosAteDez(valor);
		return resultado;

	}

	public static int[] ex2() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 10;
		int[] resultado = logicaProgramacaoProvider.obterDobrosAteMil(valor);
		return resultado;

	}

	public static int[][] ex1() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 10;

		return logicaProgramacaoProvider.tabuada(valor);
	}
}
