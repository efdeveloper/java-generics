package efdeveloper.dao;

import efdeveloper.vo.BuscaFooVO;
import efdeveloper.vo.RetornoFooVO;

import java.util.List;

public class FooMinhasTarefasOutrosDAO implements FooMinhasTarefaDAO {

    @Override
    public List<RetornoFooVO> buscarFooMinhasTarefas(BuscaFooVO buscaFooVO) {
        System.out.println("FooMinhasTarefasOutrosDAO buscarFooMinhasTarefas.");
        return null;
    }

}
