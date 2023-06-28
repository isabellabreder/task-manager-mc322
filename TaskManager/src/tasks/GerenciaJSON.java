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
import javax.swing.JTable;

/**
 *
 * @author carlosbarbosa
 */
public class GerenciaJSON {
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public int ExportaTarefas(JTable tarefas, String endereco) {
        try (var escritor = new FileWriter(endereco)) {
            
            gson.toJson(tarefas, escritor);
            return 0;
        } 
        catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public JTable ImportaTarefas(String endereco) {
        JTable tarefas = new JTable();
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