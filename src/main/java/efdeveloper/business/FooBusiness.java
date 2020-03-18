package efdeveloper.business;

import efdeveloper.dao.FooDAO;
import efdeveloper.dao.FooMinhasTarefaDAO;
import efdeveloper.enums.GrupoFooEnum;
import efdeveloper.vo.BuscaFooVO;
import efdeveloper.vo.RetornoFooVO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FooBusiness {

    @Inject
    private FooDAO fooDAO;

    @Inject
    private FooMinhasTarefasBusiness fooMinhasTarefasBusiness;

    public boolean foo() {
        System.out.println("FooBusiness foo.");
        for (GrupoFooEnum grupoFooEnum : GrupoFooEnum.values()) {
            buscarFooMinhasTarefas(grupoFooEnum);
        }
        return fooDAO.foo();
    }

    private List<RetornoFooVO> buscarFooMinhasTarefas(GrupoFooEnum grupoFooEnum) {
        System.out.printf("FooBusiness buscarFooMinhasTarefas > %s.%n", grupoFooEnum.name());
        FooMinhasTarefaDAO fooMinhasTarefaDAO = fooMinhasTarefasBusiness.getFooMinhasTarefasDAO(grupoFooEnum);
        return fooMinhasTarefaDAO.buscarFooMinhasTarefas(new BuscaFooVO());
    }

}
