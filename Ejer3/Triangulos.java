
package Punto3;


public class Triangulos {
    
     double base, lados;

    public Triangulos(double base, double lados) {
        this.base = base;
        this.lados = lados;
    }
    
    public double CalcularPerimetro()
    {
        double perimetro= 2*lados + base;
        return perimetro;
    }
    
    public double CalcularArea()
    {
        double area = (base*Math.sqrt((lados*lados) - (base*base)/4))/2;
        return area;
    }
   
}
