package br.edu.ifpr.paranavai.armarios.servico;


import br.edu.ifpr.paranavai.armarios.dao.EstudanteDaoImpl;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import java.util.List;
import br.edu.ifpr.paranavai.armarios.dao.EstudanteDao;

public class EstudanteServico {

    private static EstudanteDao dao = new EstudanteDaoImpl();

    public static List<Estudante> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Estudante buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static Estudante inserir(Estudante estudante) {
        return dao.inserir(estudante);
    }

    public static Estudante atualizar(Estudante estudante) {
        return dao.atualizar(estudante);
    }

    public static void excluir(Estudante estudante) {
        dao.excluir(estudante);
    }
}
