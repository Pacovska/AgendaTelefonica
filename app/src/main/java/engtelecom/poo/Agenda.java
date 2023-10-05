package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public int size(){
        return this.contatos.size();
    }

    public boolean isEmpty(){
        return this.contatos.isEmpty();
    }

    public Pessoa get(int pos){
        return this.contatos.get(pos);
    }

    public void addPessoa(Pessoa p){
        contatos.add(p);
    }

    public boolean removePessoa(int pIndex){
        if(contatos.size() == 0 || pIndex >= contatos.size() || pIndex < 0){
            return false;
        }
        contatos.remove(pIndex);
        return true;
    }

    public boolean addTelefone(String r, String n, int pIndex){
        if(pIndex >= contatos.size() || pIndex < 0) {
            return false;
        }
        contatos.get(pIndex).addTelefone(r, n);
        return true;
    }

    public boolean addEmail(String r, String e, int pIndex){
        if(pIndex >= contatos.size() || pIndex < 0) {
            return false;
        }
        contatos.get(pIndex).addEmail(r, e);
        return true;
    }

    public boolean updateTelefone(String r, String n, int pIndex){
        if(pIndex >= contatos.size() || pIndex < 0) {
            return false;
        }
        contatos.get(pIndex).updateTelefone(r, n);
        return true;
    }

    public boolean updateEmail(String r, String e, int pIndex){
        if(pIndex >= contatos.size() || pIndex < 0) {
            return false;
        }
        contatos.get(pIndex).updateEmail(r, e);
        return true;
    }

    public boolean removeTelefone(String r, int pIndex){
        if(pIndex >= contatos.size() || pIndex < 0) {
            return false;
        }
        contatos.get(pIndex).removeTelefone(r);
        return true;
    }

    public boolean removeEmail(String r, int pIndex){
        if(pIndex >= contatos.size() || pIndex < 0) {
            return false;
        }
        contatos.get(pIndex).removeEmail(r);
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contatos.size(); i++) {
            sb.append(i+1).append(" - ").append(contatos.get(i).getNome());
            sb.append(" ").append(contatos.get(i).getSobrenome()).append("\n");
        }
        return sb.toString();
    }
}
