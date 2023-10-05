package engtelecom.poo;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;

public class Pessoa {
    private final String nome;
    private final String sobrenome;
    private final LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobrenome, String dataNasc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        String[] data = dataNasc.split("/");
        this.dataNasc = LocalDate.of(Integer.parseInt(data[2]), Integer.parseInt(data[1]), Integer.parseInt(data[0]));
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public boolean addTelefone(String r, String n){
        return this.telefones.add(r, n);
    }

    public boolean addEmail(String r, String e){
        return this.emails.add(r, e);
    }

    public boolean removeTelefone(String r){
        return this.telefones.remove(r);
    }

    public boolean removeEmail(String r){
        return this.emails.remove(r);
    }

    public boolean updateTelefone(String r, String n){
        return this.telefones.update(r, n);
    }

    public boolean updateEmail(String r, String e){
        return this.emails.update(r, e);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.nome).append(" ").append(this.sobrenome).append("\n");
        sb.append("Data de nascimento: ").append(this.dataNasc.toString()).append("\n");
        sb.append("Telefones: ").append("\n").append(this.telefones.toString());
        sb.append("E-mails: ").append("\n").append(this.emails.toString());
        return sb.toString();
    }

}
