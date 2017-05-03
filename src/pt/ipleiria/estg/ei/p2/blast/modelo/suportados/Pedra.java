package pt.ipleiria.estg.ei.p2.blast.modelo.suportados;

import pt.ipleiria.estg.ei.p2.blast.modelo.bases.BaseSuportadora;

/**
 * Created by Bruno on 03/05/2017.
 */
public class Pedra extends SuportadoSensivelOndaChoqueComForca{
    public Pedra(BaseSuportadora baseSuportadora) {
        super(baseSuportadora, 5, 1000);
    }
}
