
package RevisãoPoo;


public class calculadora {
    public double n1;
    public double n2;
    
    public calculadora(){
        
    }
    
    public calculadora(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public double subtrair(){
        return n1 - n2;
    }
    
    public double somar(){
        return n1 + n2;
    }
    
    public double multiplicar(){
        return n1 * n2;
    }
    public double dividir(){
        return n1/n2;
    }
    
    public double resto(){
        return n1%n2;
    }
    
}
