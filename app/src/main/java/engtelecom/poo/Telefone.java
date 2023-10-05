package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Telefone {
    private HashMap<String, String> dados;

    public Telefone() {
        this.dados = new HashMap<String,String>();
    }

    public boolean add(String r, String n){
        if(!dados.containsKey(r)){
            dados.put(r, n);
            return true;
        }
        return false;
    }

    public boolean remove(String r){
        if(dados.containsKey(r)){
            dados.remove(r);
            return true;
        }
        return false;
    }

    public boolean update(String r, String n){
        if(dados.containsKey(r)){
            dados.put(r, n);
            return true;
        }
        return false;
    }

    public String formata(String valor) {
        String resultado = valor;

        try {
            MaskFormatter brasilianMask = new MaskFormatter("(##) #####−####");
            brasilianMask.setValueContainsLiteralCharacters(false);
            brasilianMask.setPlaceholderCharacter('_');
            resultado = brasilianMask.valueToString(valor);
            } catch (ParseException ignored) {

            }
        return resultado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        for (Map.Entry<String,String> t: dados.entrySet()) {
            sb.append(t.getKey()).append(": ").append(this.formata(t.getValue())).append("\n");
        }

        return sb.toString();
    }
}
