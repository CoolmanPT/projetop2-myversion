package pt.ipleiria.estg.ei.p2.blast.modelo.suportados;

import pt.ipleiria.estg.ei.p2.blast.modelo.EstadoJogo;
import pt.ipleiria.estg.ei.p2.blast.modelo.bases.BaseSuportadora;

import java.util.List;

/**
 * Created by Bruno on 03/05/2017.
 */
public class MegaBomb extends Suportado implements Reagente {
    public MegaBomb(BaseSuportadora baseSuportadora) {
        super(baseSuportadora);
    }

    private void explodirTudo(){
        destruirLinhaColuna();

    }


    public boolean podeInteragir() {
        return true;
    }

    @Override
    public void reagirFoguete() {

    }

    private void destruirLinhaColuna() {
        List<BaseSuportadora> bases = baseSuportadora.getAreaJogavel().getAllThings();
        for (BaseSuportadora base : bases) {
            base.libertarSuportado();
            getJogo().incrementarPontuacao(5);
            getJogo().setEstadoJogo(EstadoJogo.CONCLUIDO_VITORIA);
        }
    }


    @Override
    public void reagirInteracao() {
        explodirTudo();
    }
}
