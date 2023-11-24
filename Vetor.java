package erikegeraldo;

import java.util.Random;

import java.util.Scanner;

public class trabalho {

public trabalho() {

// TODO Auto-generated constructor stub

}

public static void main(String[] args) {

// TODO Auto-generated method stub //Feito: Erik e Geraldo.

Scanner teclado = new Scanner(System.in);

int fim = 0;

int x[] = new int[10];

while (fim == 0) {

System.out.println("1ª opção: Coleta dados do vetor");

System.out.println("2ª opção: Gera valores randômicos para o vetor");

System.out.println("3ª opção: Imprime dados do vetor");

System.out.println("4ª opção: Imprime vetor invertido");

System.out.println("5ª opção: Soma valores do vetor");

System.out.println("6ª opção: Soma personalizada de valores do vetor");

System.out.println("7ª opção: Média dos valores do vetor");

System.out.println("8ª opção: Maior valor dentro do vetor");

System.out.println("9ª opção: Menor valor dentro do vetor");

System.out.println("Digite 0 para sair");

System.out.println();

System.out.print("Digite a opção desejada: ");

int opcao= teclado.nextInt();

if (opcao == 1) {

coletaVetor(x);

}

else if (opcao == 2) {

System.out.print("Qual o valor máximo para os valores do vetor? ");

int max = teclado.nextInt();

geraVetorRandomico(x, max);

}

else if (opcao == 3) {

System.out.print("Dados do vetor: ");

imprimeVetor(x);

}

else if (opcao == 4) {

System.out.print("Vetor invertido: ");

imprimeVetorInvertido(x);

}

else if (opcao == 5) {

int soma = somaTodos(x);

System.out.println("Soma de todos os valores do vetor: " + soma);

}

else if (opcao == 6) {

System.out.print("Índice de início (inclusive): ");

int inicio = teclado.nextInt();

System.out.print("Índice de término (inclusive): ");

int termino = teclado.nextInt();

System.out.println("Soma personalizada: " + somaPersonalizada(x, inicio, termino));

}

else if (opcao == 7) {

System.out.println(media(x));

}

else if (opcao == 8) {

System.out.println("O maior valor de vetor é: " + maiorValor(x));

}

else if (opcao == 9) {

System.out.println("O menor valor de vetor é: " + menorValor(x));

}

else if (opcao == 0) {

System.out.println("Fim do algoritmo");

fim++;

}

else {

System.out.println();

System.out.println("Opção inválida");

System.out.println();

}

}

}

public static int[] coletaVetor(int[] vetor) {

Scanner teclado = new Scanner(System.in);

for (int i = 0; i < vetor.length; i++) {

System.out.println("Informe o " + i + "º valor do vetor:");

vetor[i] = teclado.nextInt();

}

System.out.println();

return vetor;

}

public static int[] geraVetorRandomico(int[] vetor, int max) {

Random aleatorio = new Random();

for (int i = 0; i < vetor.length; i++) {

vetor[i] = aleatorio.nextInt(max);

if (i == vetor.length - 1) {

System.out.print(vetor[i] + "");

} else {

System.out.print(vetor[i] + ",");

}

}

System.out.println();

return vetor;

}

public static void imprimeVetor(int[] vetor) {

for (int i = 0; i < vetor.length; i++) {

if (i == vetor.length - 1) {

System.out.print(vetor[i] + "");

} else {

System.out.print(vetor[i] + ",");

}

}

System.out.println();

}

public static void imprimeVetorInvertido(int[] vetor) {

for (int i = vetor.length - 1; i >= 0; i--) {

if (i == vetor.length) {

System.out.print(vetor[i] + "");

} else {

System.out.print(vetor[i] + ",");

}

}

System.out.println();

}

public static int somaTodos(int[] vetor) {

int soma = 0;

for (int i = 0; i < vetor.length; i++) {

soma = vetor[i] + soma;

}

System.out.println();

return soma;

}

public static int somaPersonalizada(int[] vetor, int inicio, int termino) {

int soma = 0;

for(int i= inicio; i<=termino; i++) {

soma= vetor[i] + soma;

}

return soma;

}

public static double media(int[] vetor) {

double media= vetor.length;

int soma=0;

for(int i = 0; i < vetor.length; i++) {

soma= vetor[i] + soma;

}

media = soma/media;

return media;

}

public static int maiorValor(int[] vetor) {

int maior= 0;

for(int i = 1; i < vetor.length; i++) {

if (vetor[i] > maior) {

maior = vetor[i];

}

}

return maior;

}

public static int menorValor(int[] vetor) {

int menor = vetor[0];

for(int i = 1; i < vetor.length; i++) {

if (vetor[i] < menor) {

menor = vetor[i];

}

}

return menor;

}

}

