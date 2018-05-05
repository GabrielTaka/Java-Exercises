package br.com.fatec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String vermelho = "\033[31m";
        String limpo = "\033[m";

        int setup;
        System.out.println(vermelho + "\t*************************" + limpo + " LISTA  1 " + vermelho + "*************************" + limpo);
        System.out.println(vermelho + "\t*************" + limpo + " PROGRAMAÇÃO ORIENTADA À OBEJETOS " + vermelho + "*************" + limpo);
        System.out.println(vermelho + "\t**************" + limpo + " DESENVOLVIDO POR ALEXIS LOPES " + vermelho + "***************" + limpo + "\n");
        do {


            System.out.print("\n1 - Tipos de print\n2 - Quadrado\n3 - Comparando n1 e n2\n4 - Comparando n1 e n2 com elseif\n");
            System.out.println("5 - Quadrado com while\n6 - Quadrado com for\n7 - Calculadora básica\n8 - Tabela verdade\n9 - Herança e encapsulamento\n");
            System.out.print("Escolha um exercicio: ");
            System.out.print("Digite 666 quando satisfeito.");
            setup = ler.nextInt();


////////////////////////////////// EXERCICIO 1 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 1) {
                System.out.println("\n\t1 - Tipos de print\n");

                System.out.print("Print, Alô mundo !!\n");
                System.out.println("Println, Alô mundo !!");
                System.out.printf("%s %s", "Printf", "Alô mundo !\n");
            }

////////////////////////////////// EXERCICIO 2 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 2) {
                System.out.println("\n\t2 - Quadrado\n");
                System.out.println("**********");
                System.out.println("*        *");
                System.out.println("*        *");
                System.out.println("*        *");
                System.out.println("*        *");
                System.out.println("*        *");
                System.out.println("*        *");
                System.out.println("*        *");
                System.out.println("*        *");
                System.out.println("*        *");
                System.out.println("**********");
            }

////////////////////////////////// EXERCICIO 3 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 3) {
                System.out.println("\n\t3 - Comparando n1 e n2\n");
                int n1, n2;

                System.out.print("Um valor inteiro para n1: ");
                n1 = ler.nextInt();
                System.out.print("Um valor inteiro para n2: ");
                n2 = ler.nextInt();

                if (n1 > n2)
                    System.out.println("n1 é maior que n2.");
                if (n1 < n2)
                    System.out.println("n2 é maior que n1.");
                if (n1 == n2)
                    System.out.println("n1 é igual n2.");
                if (n1 != n2)
                    System.out.println("n1 e n2 são diferentes.");
            }
////////////////////////////////// EXERCICIO 4 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 4) {
                System.out.println("\n\t4 - Comparando n1 e n2 com elseif\n");

                int n1, n2;
                System.out.print("Insira um valor inteiro para n1: ");
                n1 = ler.nextInt();
                System.out.print("Insira um valor inteiro para n2: ");
                n2 = ler.nextInt();

                if (n1 > n2)
                    System.out.println("n1 é maior que n2");
                else if (n1 < n2)
                    System.out.println("n2 é maior que n1");
                if (n1 == n2)
                    System.out.println("n1 é igual n2");
                else if (n1 != n2)
                    System.out.println("n1 e n2 são diferentes");
            }

////////////////////////////////// EXERCICIO 5 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 5) {
                System.out.println("\n\t5 - Quadrado com while\n");
                int ast = 8;
                System.out.println("**********");
                while (ast > 0) {
                    System.out.println("*        *");
                    ast--;
                }
                System.out.println("**********");
            }

////////////////////////////////// EXERCICIO 6 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 6) {
                System.out.println("\n\t6 - Quadrado com for");
                System.out.println("**********");
                for (int ast = 8; ast > 0; ast--) {
                    System.out.println("*        *");
                }
                System.out.println("**********");
            }

////////////////////////////////// EXERCICIO 7 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 7) {
                System.out.println("\n\t7 - Calculadora básica\n");
                System.out.println("faz cálculos com apenas dois numeros");
                boolean executar = true;

                while (executar) {

                    System.out.print("\n\t<1>---SOMA\n\t<2>---SUBTRAÇÃO\n\t<3>---MULTIPLICAÇÃO\n\t<4>---DIVISÃO\n\t<5>---Sair\n");
                    System.out.print("\nEscolha uma operação: ");
                    int op, n1, n2;
                    op = ler.nextInt();

                    if (op == 1) {
                        System.out.print("Digite um valor para n1: ");
                        n1 = ler.nextInt();
                        System.out.print("Digite um valor para n2: ");
                        n2 = ler.nextInt();
                        System.out.printf("Resultado: %d\n", n1 + n2);
                    }

                    if (op == 2) {
                        System.out.print("Digite um valor para n1: ");
                        n1 = ler.nextInt();
                        System.out.print("Digite um valor para n2: ");
                        n2 = ler.nextInt();
                        System.out.printf("Resultado: %d\n", n1 - n2);
                    }

                    if (op == 3) {
                        System.out.print("Digite um valor para n1: ");
                        n1 = ler.nextInt();
                        System.out.print("Digite um valor para n2: ");
                        n2 = ler.nextInt();
                        System.out.printf("Resultado: %d\n", n1 * n2);
                    }

                    if (op == 4) {
                        System.out.print("Digite um valor para n1: ");
                        n1 = ler.nextInt();
                        System.out.print("Digite um valor para n2: ");
                        n2 = ler.nextInt();
                        System.out.printf("Resultado: %d\n", n1 / n2);
                    }

                    if (op == 5) {
                        executar = false;
                    }

                }

            }

////////////////////////////////// EXERCICIO 8 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 8) {
                class OperadoresLogicos {
                    public void and(boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
                        for (int n = 0; n < 4; n++) {
                            resultado[n] = coluna1[n] && coluna2[n];
                            System.out.printf("%s and %s = %s \n", coluna1[n], coluna2[n], resultado[n]);
                        }
                    }

                    public void or(boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
                        for (int n = 0; n < 4; n++) {
                            resultado[n] = coluna1[n] || coluna2[n];
                            System.out.printf("%s or %s = %s\n", coluna1[n], coluna2[n], resultado[n]);
                        }
                    }

                    public void not(boolean[] coluna1, boolean[] resultado) {
                        for (int n = 0; n < 2; n++) {
                            resultado[n] = !coluna1[n];
                            System.out.printf("%s = %s\n", coluna1[n], resultado[n]);
                        }
                    }
                }


                boolean[] coluna1 = {true, true, false, false};
                boolean[] coluna2 = {true, false, true, false};
                boolean[] resultado = new boolean[4];
                OperadoresLogicos operadores = new OperadoresLogicos();

                System.out.println("\n\t TABELA AND\n");
                operadores.and(coluna1, coluna2, resultado);
                System.out.println("\n\t TABELA OR\n");
                operadores.or(coluna1, coluna2, resultado);

                coluna1 = new boolean[]{true, false};
                resultado = new boolean[2];
                operadores = new OperadoresLogicos();
                System.out.println("\n\t TABELA NOT\n");
                operadores.not(coluna1, resultado);
            }

////////////////////////////////// EXERCICIO 9 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (setup == 9) {
                System.out.println("\n\t9 - Herança e encapsulamento\n");

                abstract class Pessoa {
                    private String nome;

                    public Pessoa(String nome) {
                        this.nome = nome;
                    }

                    public String getNome() {
                        return this.nome;
                    }
                }

                class Aluno extends Pessoa {
                    public int numeroMatricula;
                    public String turma;

                    public Aluno(String nome, int numeroMatricula, String turma) {
                        super(nome);
                        this.numeroMatricula = numeroMatricula;
                        this.turma = turma;
                    }

                    class Professor extends Pessoa {
                        public int numeroMatricula;
                        public String[] turmas;

                        public Professor(String nome, int numeroMatricula) {
                            super(nome);
                            this.numeroMatricula = numeroMatricula;
                        }

                        public void setDisciplinas(String[] turmas) {
                            this.turmas = turmas;
                        }
                    }
                }
            }

            if(setup == 666){
                System.out.println("Até mais!");
            }

        } while (setup != 666);
    }
}
