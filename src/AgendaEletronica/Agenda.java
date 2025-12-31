package AgendaEletronica;
import java.util.ArrayList;


public class Agenda {
    
    private ArrayList<Contato> contatos= new ArrayList<>();

    
    public void adicionar (Contato novoContato){
    contatos.add(novoContato);
    }
    
    public void remover (int indice){
    
    contatos.remove(indice);
    }
    
   
    public ArrayList<Contato> getContatos() {
        return contatos;
    }
    
    
}