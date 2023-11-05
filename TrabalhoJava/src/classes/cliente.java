
package classes;

import enums.sexo;
import enums.estadoCivil;

public class cliente {
    
    private String nome;
    private sexo sexo;
    private estadoCivil estadoCivil;
    private String CPF;    
    private String RG;
    private String CEP;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String email;
    private String telefone;
    private String celular;
    private boolean promocional;
    private boolean aceitar;
    
    
    public cliente(){
      this.setNome("Nome");
      this.setSexo(sexo.FE);
      this.setEstadoCivil(estadoCivil.SO);
      this.setCPF("000.000.000-00");      
      this.setRG("000000000");
      this.setEndereco("Endereco");
      this.setNumero(0);
      this.setComplemento("Complemento");
      this.setBairro("Bairro");
      this.setCidade("Cidade");
      this.setEmail("E-mail");
      this.setTelefone("(00)0000-0000");
      this.setCelular("(00)00000-0000");
      this.setPromocional(false);
      this.setAceitar(false);
    }
    
    public cliente(String nome, sexo sexo, estadoCivil estadoCivil, String CPF, String RG, String CEP, String endereco, int numero, String complemento, String bairro, String cidade, String email, String telefone, String celular, boolean promocional, boolean aceitar) {
       this.setNome(nome);
       this.setSexo(sexo);
       this.setEstadoCivil(estadoCivil);
       this.setRG(RG);
       this.setCPF(CPF);
       this.setEndereco(endereco);
       this.setNumero(numero);
       this.setComplemento(complemento);
       this.setBairro(bairro);
       this.setCidade(cidade);
       this.setEmail(email);
       this.setTelefone(telefone);
       this.setCelular(celular);
       this.setPromocional(promocional);
       this.setAceitar(aceitar); 
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }

    public void setSexo(sexo sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(estadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty() ? "ENDERECO" : nome.toUpperCase();
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento.trim().isEmpty() ? "SEM COMPLEMENTO" : nome.toUpperCase();
    }

    public void setBairro(String bairro) {
        this.bairro = bairro.trim().isEmpty() ? "BAIRRO" : nome.toUpperCase();
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade.trim().isEmpty() ? "CIDADE" : nome.toUpperCase();
    }
    
    public void setEmail(String email) {
        this.email = email.trim().isEmpty() ? "SEM E-MAIL" : nome.toUpperCase();
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setPromocional(boolean promocional) {
        this.promocional = promocional;
    }

    public void setAceitar(boolean aceitar) {
        this.aceitar = aceitar;
    }
    
 ///////////////

    public String getNome() {
        return this.nome;
    }

    public sexo getSexo() {
        return this.sexo;
    }

    public estadoCivil getEstadoCivil() {
        return this.estadoCivil;
    }

    public String getRG() {
        return this.RG;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getCEP() {
        return this.CEP;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return cidade;
    }
    
    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getCelular() {
        return this.celular;
    }

    public boolean isPromocional() {
        return this.promocional;
    }

    public boolean isAceitar() {
        return this.aceitar;
    }
    
//////////////    
    
    @Override
    public String toString(){
        return this.nome;
    }
    
///////////////
    
}
