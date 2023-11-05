
package enums;

public enum sexo {

    FE("Feminino"),
    MA("Masculino");
    
    private String Sexo;
    
    private sexo(String sexo){
        this.Sexo = sexo;
    }
    
    public String toString(){
        return Sexo;
    }
    
}
