/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author carlosbarbosa
 */
public class GerenciaJSON {
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public int ExportaTarefas(ListaDeTarefas lista, String endereco) {
        try (var escritor = new FileWriter(endereco)) {
            
            gson.toJson(lista, escritor);
            return 0;
        } 
        catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public ArrayList<TarefaEspecifica> ImportaTarefas(String endereco) {
        ArrayList<TarefaEspecifica> tarefas = new ArrayList<>();
        try (var leitor = new FileReader(endereco)) {
            tarefas = gson.fromJson(leitor, tarefas.getClass());
            return tarefas;
        } 
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}