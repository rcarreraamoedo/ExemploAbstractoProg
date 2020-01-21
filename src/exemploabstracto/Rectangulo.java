
package exemploabstracto;


public class Rectangulo extends Cuadrilatero {

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }



    @Override
    public void calcularArea() {
      //  Cuadrilatero cu = new Cuadrilatero(); NON PODEMOS INSTANCIAR UN OBXECTO POR SER ABSTRACTO
      /* Cuadrilatero c = new Rectangulo ();
       System.out.println("Area rectángulo = " + (c.getBase()*super.getAltura()));*/
    System.out.println(" Area rectangulo = "+ super.getBase()*super.getAltura());
    }
    
    
    
}
