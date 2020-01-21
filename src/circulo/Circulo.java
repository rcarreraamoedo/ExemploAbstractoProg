
package circulo;

import exemploabstracto.Poligonos;


public class Circulo extends Poligonos{

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
       System.out.println(" Area circulo = " + (Math.PI*Math.pow(radio, 2)));
       
    }
    
    
    
    
}
