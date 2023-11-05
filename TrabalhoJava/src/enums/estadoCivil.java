
package enums;

public enum estadoCivil {

    SO("Solteiro"),
    CA("Casado"),
    DI("Divorciado"),
    VI("Viúvo");
    
    private String relacionamento;
    
    private estadoCivil(String relacionamento){
        this.relacionamento = relacionamento;
    }
    
    public String toString(){
        return relacionamento;
    }
    
}
