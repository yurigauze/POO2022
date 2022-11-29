package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.servico.EstudanteServico;
import java.util.List;

public class EstudanteControle {
    public static List<Estudante> listarTodasEstudantes(){
        return EstudanteServico.buscarTodos();
    }
    
    public static Estudante inserir(Estudante estudante) {
        return EstudanteServico.inserir(estudante);
    }

    public static Estudante buscarPorId(int codigo) {
        return EstudanteServico.buscarPorId(codigo);
    }
    public static Estudante atualizar(Estudante pessoa) {
        return EstudanteServico.atualizar(pessoa);
    }
    
    public static void excluir (Estudante estudante) {
        EstudanteServico.excluir(estudante);
    }
}

