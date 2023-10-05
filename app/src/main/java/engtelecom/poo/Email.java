package engtelecom.poo;

import java.util.HashMap;
import java.util.Map;

public class Email {
    private HashMap<String,String> dados;
    private final String eR = "^[\\w−\\+]+(\\.[\\w]+)∗@[\\w−]+(\\.[\\w]+)∗(\\.[a−z]{2,})$";


    public Email() {
        this.dados = new HashMap<String,String>();
    }

    public boolean add(String r, String e){
        if(e.matches(eR)){
            if(!dados.containsKey(r)){
                dados.put(r, e);
                return true;
            }
        }
        return false;
    }

    public boolean remove(String r){
        if (dados.containsKey(r)){
            dados.remove(r);
            return true;
        }
        return false;
    }

    public boolean update(String r, String e){
        if(e.matches(eR)){
            if(dados.containsKey(r)){
                dados.put(r, e);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Email{");
        for (Map.Entry<String,String> e: dados.entrySet()) {
            sb.append(e.getKey()).append(": ").append(e.getValue()).append("\n");
        }
        return sb.toString();
    }
}
