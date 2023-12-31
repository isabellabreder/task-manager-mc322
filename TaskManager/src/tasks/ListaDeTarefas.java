/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks;

import java.util.ArrayList;

/**
 *
 * @author ana
 */
public abstract class ListaDeTarefas {
    private ArrayList<TarefaEspecifica> tarefas;
    private int quantidade;
    
    public ListaDeTarefas(){
        this.tarefas = new ArrayList<>();
        this.quantidade = quantidade;
    }
    

    public void adicionarAtividade(NovaTarefa tarefa){
        tarefas.add(tarefa);
        quantidade++;
    }

    public void removerAtividade(){
        quantidade--;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
}
