/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prodotto;

/**
 *
 * @author moham
 */

public class Prodotto {
    private String proprietario;
    private String nomeNegozio;

    public Prodotto() {
        this.proprietario = "Default";
        this.nomeNegozio = "Default";
    }

    public Prodotto(String proprietario, String nomeNegozio) {
        this.proprietario = proprietario;
        this.nomeNegozio = nomeNegozio;
    }

    public String toString() {
        return "Proprietario: " + proprietario + ", Nome Negozio: " + nomeNegozio;
    }
}

