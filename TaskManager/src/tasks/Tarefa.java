package tasks;

import java.io.File;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isabellabreder
 */
public class Tarefa implements Atividade {
    private String nome;
    private String categoria;
    private String observacoes;
    private DefaultTableModel modelo;
    private Home home;
    private File arquivo;
    
    //construtor
    public Tarefa(DefaultTableModel modelo, Home home){
        this.modelo = modelo;
        this.home = home;
    }
    
    @Override
    public void adicionarAtividade(String nome, String categoria, String observacoes, File arquivo){
        this.nome = nome;
        this.categoria = categoria;
        this.observacoes = observacoes;
        this.arquivo = arquivo;
        
        //adiciona a nova linha à tabela
        Object[] novaLinha = {this.categoria, this.nome, this.observacoes, this.arquivo.getPath()};
        modelo.addRow(novaLinha);
        //limpa os campos após adicionar
        home.clear();
    }
    
    @Override
    public void removerAtividade(){
        int indexLinha = home.getTable().getSelectedRow();
        if (indexLinha != -1){
            modelo.removeRow(indexLinha);
        }
    }
}
