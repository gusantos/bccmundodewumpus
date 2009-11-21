package br.cesupa.CC6TA.Mundo.ObjetosDeTerreno;

import br.cesupa.CC6TA.Mundo.Mapa.PosicaoDoMapa;

/**
 *
 * @author Pedro
 */
public class ObjetoDoTerreno implements ObjetoDoTerrenoInterface {

    private int posicaoX, posicaoY;
    private PosicaoDoMapa[][] mapa;

    // Contrutores
    public ObjetoDoTerreno() {
        super();
    }

    public ObjetoDoTerreno(int posicaoX, int posicaoY) {
        super();
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    // Fim Construtores

//    public void setAtributoDoEvento() {
//        posicaoX
//        posicaoY
//    }

    public void emitirEvento() {
        //TODO: Implementar as regras do emitirEvento
    }

    // Sets e Gets
    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
}