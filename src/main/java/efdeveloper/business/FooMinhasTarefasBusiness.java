package efdeveloper.business;

import efdeveloper.dao.FooMinhasTarefaDAO;
import efdeveloper.dao.FooMinhasTarefasGrupoDAO;
import efdeveloper.dao.FooMinhasTarefasIndividuoDAO;
import efdeveloper.dao.FooMinhasTarefasOutrosDAO;
import efdeveloper.enums.GrupoFooEnum;
import efdeveloper.vo.BuscaFooVO;
import efdeveloper.vo.RetornoFooVO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FooMinhasTarefasBusiness {

    @Inject
    private FooMinhasTarefasIndividuoDAO fooMinhasTarefasIndividuoDAO;

    @Inject
    private FooMinhasTarefasGrupoDAO fooMinhasTarefasGrupoDAO;

    @Inject
    private FooMinhasTarefasOutrosDAO fooMinhasTarefasOutrosDAO;

    public FooMinhasTarefaDAO getFooMinhasTarefasDAO(GrupoFooEnum grupoFooEnum) {
        switch (grupoFooEnum) {
            case NIROES:
                return fooMinhasTarefasIndividuoDAO;
            case XAYSUR:
                return fooMinhasTarefasGrupoDAO;
            default:
                return fooMinhasTarefasOutrosDAO;
        }
    }

}
