package tasks;

/**
 *
 * @author isabellabreder
 */

public interface Atividade {
    public void adicionarAtividade(String nome, String categoria, String observacoes, File selecionado);
    public void removerAtividade();
}
