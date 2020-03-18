package efdeveloper.dao;

import efdeveloper.vo.BuscaFooVO;
import efdeveloper.vo.RetornoFooVO;

import java.util.List;

public interface FooMinhasTarefaDAO {

    List<RetornoFooVO> buscarFooMinhasTarefas(BuscaFooVO buscaFooVO);

}
