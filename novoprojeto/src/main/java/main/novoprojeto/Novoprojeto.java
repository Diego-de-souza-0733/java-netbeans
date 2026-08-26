package main.novoprojeto;

import java.util.Scanner;

public class Novoprojeto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("            RPG");
        System.out.println("================================");
        System.out.println();

        // ==============================
        // ESCOLHA DO JOGADOR 1
        // ==============================

        System.out.println("Escolha o personagem do Jogador 1:");

        System.out.println("1 - Toph");
        System.out.println("2 - Sub Zero");
        System.out.println("3 - Bakugou");
        System.out.println("4 - Batman");
        System.out.println("5 - Coringa");
        System.out.println("6 - Fenix");
        System.out.println("7 - Midoria");
        System.out.println("8 - Noob");

        System.out.print("Escolha: ");
        int escolha1 = scanner.nextInt();

        Persona jogador1;

        if (escolha1 == 1) {
            jogador1 = new Toph();
        }
        else if (escolha1 == 2) {
            jogador1 = new Subzero();
        }
        else if (escolha1 == 3) {
            jogador1 = new Bakugou();
        }
        else if (escolha1 == 4) {
            jogador1 = new Batman();
        }
        else if (escolha1 == 5) {
            jogador1 = new Coringa();
        }
        else if (escolha1 == 6) {
            jogador1 = new Fenix();
        }
        else if (escolha1 == 7) {
            jogador1 = new Midoria();
        }
        else {
            jogador1 = new Noob();
        }


        // ==============================
        // ESCOLHA DO JOGADOR 2
        // ==============================

        System.out.println();
        System.out.println("Escolha o personagem do Jogador 2:");

        System.out.println("1 - Toph");
        System.out.println("2 - Sub Zero");
        System.out.println("3 - Bakugou");
        System.out.println("4 - Batman");
        System.out.println("5 - Coringa");
        System.out.println("6 - Fenix");
        System.out.println("7 - Midoria");
        System.out.println("8 - Noob");

        System.out.print("Escolha: ");
        int escolha2 = scanner.nextInt();

        Persona jogador2;

        if (escolha2 == 1) {
            jogador2 = new Toph();
        }
        else if (escolha2 == 2) {
            jogador2 = new Subzero();
        }
        else if (escolha2 == 3) {
            jogador2 = new Bakugou();
        }
        else if (escolha2 == 4) {
            jogador2 = new Batman();
        }
        else if (escolha2 == 5) {
            jogador2 = new Coringa();
        }
        else if (escolha2 == 6) {
            jogador2 = new Fenix();
        }
        else if (escolha2 == 7) {
            jogador2 = new Midoria();
        }
        else {
            jogador2 = new Noob();
        }


        // ==============================
        // MOSTRAR LUTADORES
        // ==============================

        System.out.println();
        System.out.println("================================");
        System.out.println("          LUTADORES");
        System.out.println("================================");

        System.out.println("Jogador 1: " + jogador1.nome);
        System.out.println("Vida: " + jogador1.vida);

        System.out.println();

        System.out.println("Jogador 2: " + jogador2.nome);
        System.out.println("Vida: " + jogador2.vida);

        System.out.println();

        System.out.println("================================");
        System.out.println("             LUTA!");
        System.out.println("================================");


        // ==============================
        // COMEÇA A LUTA
        // ==============================

        while (jogador1.vida > 0 && jogador2.vida > 0) {


            // ==============================
            // TURNO DO JOGADOR 1
            // ==============================

            System.out.println();
            System.out.println("================================");
            System.out.println("       TURNO DO JOGADOR 1");
            System.out.println("================================");

            System.out.println("Vida de " + jogador1.nome + ": "
                    + jogador1.vida);

            System.out.println("Vida de " + jogador2.nome + ": "
                    + jogador2.vida);

            System.out.println();

            System.out.println("1 - Ataque normal");
            System.out.println("2 - " + jogador1.poder1);
            System.out.println("3 - " + jogador1.poder2);

            System.out.print("Escolha: ");
            int acao1 = scanner.nextInt();


            if (acao1 == 1) {

                jogador1.atacar(jogador2);

            }
            else if (acao1 == 2) {

                jogador1.usarPoder1(jogador2);

            }
            else if (acao1 == 3) {

                jogador1.usarPoder2(jogador2);

            }
            else {

                System.out.println("Opcao invalida!");

            }


            // Verifica se o jogador 2 morreu

            if (jogador2.vida <= 0) {
                break;
            }


            // ==============================
            // TURNO DO JOGADOR 2
            // ==============================

            System.out.println();
            System.out.println("================================");
            System.out.println("       TURNO DO JOGADOR 2");
            System.out.println("================================");

            System.out.println("Vida de " + jogador1.nome + ": "
                    + jogador1.vida);

            System.out.println("Vida de " + jogador2.nome + ": "
                    + jogador2.vida);

            System.out.println();

            System.out.println("1 - Ataque normal");
            System.out.println("2 - " + jogador2.poder1);
            System.out.println("3 - " + jogador2.poder2);

            System.out.print("Escolha: ");
            int acao2 = scanner.nextInt();


            if (acao2 == 1) {

                jogador2.atacar(jogador1);

            }
            else if (acao2 == 2) {

                jogador2.usarPoder1(jogador1);

            }
            else if (acao2 == 3) {

                jogador2.usarPoder2(jogador1);

            }
            else {

                System.out.println("Opcao invalida!");

            }
        }


        // ==============================
        // FINAL DA LUTA
        // ==============================

        System.out.println();
        System.out.println("================================");
        System.out.println("          FIM DA LUTA");
        System.out.println("================================");


        if (jogador1.vida <= 0) {

            System.out.println("Jogador 2 venceu!");
            System.out.println("Vencedor: " + jogador2.nome);

        }
        else {

            System.out.println("Jogador 1 venceu!");
            System.out.println("Vencedor: " + jogador1.nome);

        }


        System.out.println();
        System.out.println("Obrigado por jogar!");

        scanner.close();
    }
}