package classes;

public class NumerosRacionais {
    //Atributos
    
    private int numerador = 0;
    private int denominador = 0;
    
    //Construtores
    public NumerosRacionais() {
        
        numerador = 0;
        denominador = 0;
    }
    
    public NumerosRacionais(int numerador, int denominador){
        
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public NumerosRacionais(NumerosRacionais objeto){
        
        this.numerador = objeto.numerador;
        this.denominador = objeto.denominador;
    }
    //Get
    public String get(){
        
        return (numerador + "" + denominador + "");
    }
    //Set's
    public void set(int numerador, int denominador){
        
    }
    
    public NumerosRacionais set(NumerosRacionais objeto){
        
        this.numerador = objeto.numerador;
        this.denominador = objeto.denominador;
        
        return null;        
    }
    //Metodos
    public NumerosRacionais adicionar(NumerosRacionais objeto){
        
        this.numerador = objeto.numerador;
        this.denominador = objeto.denominador;
        
        return null;
    }
    
    public NumerosRacionais subtrai(NumerosRacionais objeto){
        
        this.numerador = objeto.numerador;
        this.denominador = objeto.denominador;
        
        return null;
    }
    
    public NumerosRacionais multiplicar(NumerosRacionais objeto){
        
        this.numerador = objeto.numerador;
        this.denominador = objeto.denominador;
        
        return null;
    }
    
    public NumerosRacionais dividir(NumerosRacionais objeto){
        
        this.numerador = objeto.numerador;
        this.denominador = objeto.denominador;
        
        return null;
    }
    
    public boolean igualdade(NumerosRacionais objeto){
        
        this.numerador = objeto.numerador;
        this.denominador = objeto.denominador;
        
        return false;       
    }
    
    public NumerosRacionais reduzirRacional(){
        
        return null;
        
    }
    //Metodos Privados
    private int mdc(int n1, int n2 ){
        
        return 0;
        
    }
    
    private int mmc(int n1, int n2){
        
        return 0;
        
    }
}
