package main.novoprojeto;



public class Persona {

    String nome;
    int vida;
    int ataque;
    int defesa;

    String poder1;
    String poder2;

    int danoPoder1;
    int danoPoder2;

    public Persona(String nomeRecebido, String primeiroPoder, String segundoPoder) {

        nome = nomeRecebido;
        poder1 = primeiroPoder;
        poder2 = segundoPoder;

        vida = 100;
        ataque = 20;
        defesa = 10;

        danoPoder1 = 15;
        danoPoder2 = 25;
    }

    public void atacar(Persona inimigo) {

        int dano = ataque - inimigo.defesa;

        if (dano < 0) {
            dano = 0;
        }

        inimigo.vida = inimigo.vida - dano;

        System.out.println(nome + " atacou " + inimigo.nome);
        System.out.println("Causou " + dano + " de dano!");
    }

    public void usarPoder1(Persona inimigo) {

        int dano = danoPoder1 - inimigo.defesa;

        if (dano < 0) {
            dano = 0;
        }

        inimigo.vida = inimigo.vida - dano;

        System.out.println(nome + " usou " + poder1);
        System.out.println("Causou " + dano + " de dano!");
    }

    public void usarPoder2(Persona inimigo) {

        int dano = danoPoder2 - inimigo.defesa;

        if (dano < 0) {
            dano = 0;
        }

        inimigo.vida = inimigo.vida - dano;

        System.out.println(nome + " usou " + poder2);
        System.out.println("Causou " + dano + " de dano!");
    }
}