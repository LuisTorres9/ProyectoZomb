
package Punto3;

import java.util.Scanner;
public class Principal {
    public static double SuperficieM(Triangulos trian[])
    {
        double area;
        int i=0;
        
        area= trian[0].CalcularArea();
        
        for (i=1; i<trian.length; i++)
        {
            if(trian[i].CalcularArea()>area)
            {
                area = trian[i].CalcularArea();
            }
        }
        return area;
    }
    
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        double base, lados;
        int NumerodeT, i=0;
        //NumerodeT=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de triangulos que desea tener en el vector"));
        
        System.out.println("Ingrese numero de triangulos que desea en el vector");
        NumerodeT=n.nextInt();
        
        Triangulos trian[]= new Triangulos[NumerodeT];
        
        for(i=0; i<trian.length; i++)
        {
            System.out.println("Digite los valores para el triangulo" +(i+1));
            System.out.println("Ingrese base");
            base=n.nextDouble();
            System.out.println("Ingrese lados");
            lados=n.nextDouble();
            
            trian[i]= new Triangulos(base, lados);
            
            System.out.print("/nEl perimetro del triangulo es:" + trian[i].CalcularPerimetro());
            System.out.println("El area del triangulo es:" + trian[i].CalcularArea());
        }
        
        System.out.println("El area del triangulo con mayor superficie es:" + SuperficieM(trian));
    }
    
}
