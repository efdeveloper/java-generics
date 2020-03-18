package efdeveloper.dao;

import efdeveloper.vo.BuscaFooVO;
import efdeveloper.vo.RetornoFooVO;

import java.util.List;

public class FooMinhasTarefasGrupoDAO implements FooMinhasTarefaDAO {

    @Override
    public List<RetornoFooVO> buscarFooMinhasTarefas(BuscaFooVO buscaFooVO) {
        System.out.println("FooMinhasTarefasGrupoDAO buscarFooMinhasTarefas");
        return null;
    }

}
