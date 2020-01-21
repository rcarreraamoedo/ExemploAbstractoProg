
package exemploabstracto;


public class Triangulo extends Poligonos{
    
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public void calcularArea() {
      System.out.println("area Triangulo = " + base*altura/2);
      
    }
    
    
    
    
}
