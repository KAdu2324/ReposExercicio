package br.com.qwasolucoes.mentoria.implementacoes.logica_programacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import br.com.qwasolucoes.mentoria.interfaces.logica_programacao.LogicaProgramacao;
import br.com.qwasolucoes.mentoria.model.Funcionario;

public class LogicaProgramacaoProvider implements LogicaProgramacao {

	@Override
	public List<Funcionario> conversaoStringParaPessoa(List<String> lista) {

		return null;

	}

	@Override
	public List<String> conversaoPessoaParaString(List<Funcionario> pessoas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario conversaoArrayParaPessoa(String[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> conversaoArrayMultidimensionalParaPessoa(String[][] arrayMultidimensional) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] arrayMultidimensionalParesImparesPrimosResto(int[] array, int numeroDivisaoResto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] arrayMultidimensionalPorPosicoes(String[][] arrayMultidimensional, int coluna, int linha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] arrayMultidimensionalPorValor(String[][] arrayMultidimensional, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] antecessorSucessorPor(String[] array, int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] antecessorSucessorPor(String[] array, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> numerosPares(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> numerosImpares(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> numerosPrimos(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] numerosParesArray(Integer limite) {
		  int contador = 0;
		    for (int i = 1; i <= limite; i++) {
		        if (i % 2 == 0) {
		            contador++;
		        }
		    }
		    int[] numerosParesArray = new int[contador];
		    contador = 0;
		    for (int i = 1; i <= limite; i++) {
		        if (i % 2 == 0) {
		        	numerosParesArray[contador] = i;
		            contador++;
		        }
		    }

		    return numerosParesArray;
		}
	

	@Override
	public int[] numerosImparesArray(Integer limite) {
	    int contador = 0;
	    for (int i = 1; i <= limite; i++) {
	        if (i % 2 != 0) {
	            contador++;
	        }
	    }
	    int[] numerosImparesArray = new int[contador];
	    contador = 0;
	    for (int i = 1; i <= limite; i++) {
	        if (i % 2 != 0) {
	            numerosImparesArray[contador] = i;
	            contador++;
	        }
	    }

	    return numerosImparesArray;
	}

	@Override
	public int[] numerosPrimosArray(Integer limite) {

		int[] numerosPrimosArray = new int[limite];
		int contar = 0;

		for (int i = 0; i < limite; i++) {
			numerosPrimosArray[i] = i;
		}
		for (int i = 2; i <= limite; i++) {
			boolean numeroPrimo = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					numeroPrimo = false;
					break;
				}
			}
			if (numeroPrimo) {
				numerosPrimosArray[contar] = i;
				contar++;
			}

		}

		int[] resultado = Arrays.copyOf(numerosPrimosArray, contar);
		System.out.println(Arrays.toString(resultado));
		return resultado;

	}

	@Override
	public int[] primeiraUltimaPosicaoArray(Integer limite) {

		int[] primeiraUltimaPosicao = new int[limite];
		
		int primeiro = primeiraUltimaPosicao[0];
		int ultimo = primeiraUltimaPosicao[limite - 1];

		for (int i = 0; i < limite; i++) {
			primeiraUltimaPosicao[i] = i;
		}
		System.out.printf("Primeiro: %d.%nUltimo: %d.%n", primeiro, ultimo);
		return primeiraUltimaPosicao;

	}

	@Override
	public int[] quantidadeParesImparesPrimos(List<Integer> valores) {

		int[] contadores = new int[3];

		for (int valor : valores) {
			if (valor % 2 == 0) {
				contadores[0]++;
			} else {
				contadores[1]++;
			}

			if (numeroPrimo(valor)) {
				contadores[2]++;
			}
		}
		System.out.printf("Pares: %d Ímpares: %d Primos: %d \n", contadores[0], contadores[1], contadores[2]);

		return contadores;
	}

	public boolean numeroPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		if (numero == 2) {
			return true;
		}
		if (numero % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(numero); i += 2) {
			if (numero % i == 0) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int[] primeiraUltimaMediaPosicaoArray(Integer limite) {

		int[] primeiraUltimaPosicao = new int[limite];
		for (int i = 0; i < limite; i++) {
			primeiraUltimaPosicao[i] = i;
		}
		int primeiro = primeiraUltimaPosicao[0];
		int ultimo = primeiraUltimaPosicao[limite - 1];
		int soma = 0;

		for (int valor : primeiraUltimaPosicao) {
			soma += valor;
		}
		int media = soma / limite;
		System.out.printf("Primeiro: %d.%nUltimo: %d.%nMédia: %d.%n", primeiro, ultimo, media);
		return primeiraUltimaPosicao;

	}

	@Override
	public List<Integer> removerInteirosDuplicados(List<Integer> numeros) {
		Set<Integer> valorUnicos = new HashSet<>();
		Set<Integer> valorDuplicados = new HashSet<>();

		for (Integer nome : numeros) {
			if (!valorUnicos.add(nome)) {
				valorDuplicados.add(nome);
			}
		}

		List<Integer> resultado = new ArrayList<>(valorUnicos);
		resultado.removeAll(valorDuplicados);

		return resultado;
	}

	@Override
	public List<BigDecimal> removerValoresDuplicados(List<BigDecimal> numeros) {

		Set<BigDecimal> valorUnicos = new HashSet<>();
		Set<BigDecimal> valorDuplicados = new HashSet<>();

		for (BigDecimal nome : numeros) {
			if (!valorUnicos.add(nome)) {
				valorDuplicados.add(nome);
			}
		}

		List<BigDecimal> resultado = new ArrayList<>(valorUnicos);
		resultado.removeAll(valorDuplicados);

		return resultado;
	}

	@Override
	public List<String> removerTextosDuplicados(List<String> textos) {

		Set<String> textoUnicos = new HashSet<>();
		Set<String> textoDuplicados = new HashSet<>();

		for (String nome : textos) {
			if (!textoUnicos.add(nome)) {
				textoDuplicados.add(nome);
			}
		}

		List<String> resultado = new ArrayList<>(textoUnicos);
		resultado.removeAll(textoDuplicados);

		return resultado;
	}

	@Override
	public Integer valorInteiroMaiorQtdDuplicados(List<Integer> numeros) {

		Map<Integer, Integer> listaDuplicado = new TreeMap<>();
		for (Integer numero : numeros) {
			listaDuplicado.put(numero, listaDuplicado.getOrDefault(numero, 0) + 1);
		}

		Integer numeroMaiorQtdDuplicados = null;
		int maiorQtd = 0;
		for (Map.Entry<Integer, Integer> entry : listaDuplicado.entrySet()) {
			if (entry.getValue() > 1 && entry.getValue() > maiorQtd) {
				maiorQtd = entry.getValue();
				numeroMaiorQtdDuplicados = entry.getKey();
			}
		}

		return numeroMaiorQtdDuplicados;
	}

	@Override
	public String valorTextoMaiorQtdDuplicados(List<String> textos) {

		List<String> inteirosDuplicados = new ArrayList<>();
		Map<String, Integer> maiorDuplicado = new TreeMap<>();
		for (String duplicado : textos) {
			if (!maiorDuplicado.containsKey(duplicado)) {
				maiorDuplicado.put(duplicado, 0);
			}
			maiorDuplicado.put(duplicado, maiorDuplicado.get(duplicado) + 1);
		}

		for (Map.Entry<String, Integer> entry : maiorDuplicado.entrySet()) {
			if (entry.getValue() > 1) {
				inteirosDuplicados.add(entry.getKey());

			}
		}

		return inteirosDuplicados.toString();

	}

	@Override
	public List<Integer> listaInteirosDuplicados(List<Integer> numeros) {

		List<Integer> inteirosDuplicados = new ArrayList<>();
		Map<Integer, Integer> listaDuplicado = new TreeMap<Integer, Integer>();
		for (Integer lista : numeros) {
			if (!listaDuplicado.containsKey(lista)) {
				listaDuplicado.put(lista, 0);
			}
			listaDuplicado.put(lista, listaDuplicado.get(lista) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : listaDuplicado.entrySet())
			if (entry.getValue() > 1) {
				inteirosDuplicados.add(entry.getKey());
			}

		return inteirosDuplicados;
	}

	@Override
	public List<BigDecimal> listaDecimalDuplicados(List<BigDecimal> textos) {

		List<BigDecimal> numerosDuplicados = new ArrayList<>();
		Map<BigDecimal, Integer> comparaNumeros = new TreeMap<BigDecimal, Integer>();

		for (BigDecimal numeros : textos) {
			if (!comparaNumeros.containsKey(numeros)) {
				comparaNumeros.put(numeros, 0);
			}
			comparaNumeros.put(numeros, comparaNumeros.get(numeros) + 1);
		}
		for (Map.Entry<BigDecimal, Integer> entry : comparaNumeros.entrySet()) {
			if (entry.getValue() > 1) {
				numerosDuplicados.add(entry.getKey());
			}

		}
		return numerosDuplicados;

	}

	@Override
	public List<String> listaTextoDuplicados(List<String> textos) {

		List<String> textoDuplicados = new ArrayList<>();
		Map<String, Integer> compararLista = new TreeMap<String, Integer>();

		for (String nomes : textos) {

			if (!compararLista.containsKey(nomes)) {
				compararLista.put(nomes, 0);
			}
			compararLista.put(nomes, compararLista.get(nomes) + 1);

		}
		for (Map.Entry<String, Integer> entry : compararLista.entrySet()) {

			if (entry.getValue() > 1) {
				textoDuplicados.add(entry.getKey());
			}
			System.out.printf("O nome %s se repete: %d vez(s). %n", entry.getKey(), entry.getValue());

		}

		return textoDuplicados;

	}

	@Override

	public Integer somarValores(Integer limite) {

		int soma = limite;

		for (int i = 1; i <= limite; i++) {

			if (2 != 0) {

				soma = i * limite;

			}

		}

		return soma;

	}

	@Override

	public Integer somarValoresPares(Integer limite) {

		int resultado = limite;

		for (int i = 0; i <= limite; i++) {

			if (i % 2 == 0) {

				resultado += i * limite;

			}

		}

		return resultado;

	}

	@Override

	public Integer somarValoresImpares(Integer limite) {

		int resultado = limite;

		for (int i = 0; i <= limite; i++) {

			if (i % 2 != 0) {

				resultado += i * limite;

			}

		}

		return resultado;
	}

	@Override
	public Integer somarValoresPrimos(Integer limite) {

		int obter = limite;
		for (int i = 1; i <= limite; i++) {
			if (limite % i == 0) {
				obter = i * limite;

			}
		}

		return obter;
	}

	@Override
	public Integer somarValoresPosicoes(int[] valores) {

		int soma = valores[0];

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] * 2 != 0) {
				soma += valores[i];
				System.out.print(" " + soma);
			}

		}
		return soma;
	}

	@Override
	public Integer somarValoresParesPosicoes(int[] valores) {

		int soma = valores[0];

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 2 == 0) {
				soma += valores[i];
				System.out.print(" " + soma);
			}

		}
		return soma;
	}

	@Override
	public Integer somarValoresImparesPosicoes(int[] valores) {

		int soma = valores[0];
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 2 != 0) {
				soma += valores[i];
				System.out.println(soma);
			}

		}
		return soma;
	}

	@Override
	public Integer somarValoresPrimosPosicoes(int[] valores) {

		int soma = valores[2];

		for (int i = 1; i < valores.length; i++) {
			if (valores[i] % i != 0) {
				soma = i * valores[i];

			}
		}

		return soma;
	}

	@Override
	public Integer somarValoresPosicoesParesMultiplosDe(Integer limite, Integer multiplo) {

		int resultado = limite;

		for (int i = 0; i <= limite; i++) {

			if (i % 2 == 0) {

				resultado += i * multiplo;

				System.out.println(multiplo + " multiplo " + resultado);

			}

		}
		return resultado;
	}

	@Override
	public boolean multiploDeSete(int valor) {
		if (valor % 7 == 0) {

			return true;

		} else {

			return false;

		}
	}

	@Override
	public String parOuImpar(int valor) {
		
		return valor % 2 == 0 ? "PAR" : "IMPAR";
	}

	@Override
	public String parOuImparOuZero(int valor) {

		if (valor == 0) {

			return " ZERO";

		} else if (valor % 2 == 0) {

			return " PAR ";

		} else {

			return " IMPA ";

		}
	}

	@Override
	public int[] obterDobrosAteDobroInformado(int valor) {
		List<Integer> obterDobrosAteDobroInformado = new ArrayList<>();

		int[] obter = new int[valor];

		while (valor <= 10) {

			obterDobrosAteDobroInformado.add(valor * 2);

			valor++;

		}

		System.out.println(obterDobrosAteDobroInformado);

		return obter;
	}

	@Override
	public int[] obterDobrosAteDez(int valor) {

		List<Integer> obterDobrosAteDez = new ArrayList<>();

		int[] obter = new int[valor];

		while (valor <= 10) {

			obterDobrosAteDez.add(valor * 2);
			valor++;

		}
		System.out.println(obterDobrosAteDez);

		return obter;

	}

	@Override
	public int[] obterDobrosAteMil(int valor) {

		int obterDobros = valor;

		int[] obter = new int[obterDobros];

		do {

			System.out.println(obterDobros);

			obterDobros = obterDobros * 2;

		} while (obterDobros < 1000);

		System.out.println(obterDobros);

		return obter;

	}

	@Override
	public int[][] tabuada(int valor) {
		int linhas = valor * 10;
		int colunas = 3;
		int resultado = 0;

		int[][] tabela = new int[linhas][colunas];

		for (int i = 1; i <= valor; i++) {
			for (int j = 1; j <= 10; j++) {
				tabela[resultado][0] = i;
				tabela[resultado][1] = j;
				tabela[resultado][2] = i * j;
				resultado++;
			}
		}

		for (int valorTabuada = 0; valorTabuada < linhas; valorTabuada++) {
			System.out.println(tabela[valorTabuada][0] + ", " + tabela[valorTabuada][1] + ", " + tabela[valorTabuada][2]);
		}

		return tabela;
	}
}