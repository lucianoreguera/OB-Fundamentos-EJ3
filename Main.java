class Main {  
  public static void main(String args[]) {
    int n1 = 10, n2 = 20, n3 = 30;
    int resultado = suma(n1, n2, n3);
    System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + resultado);

    int puertas = 2;
    Coche coche = new Coche(puertas);
    System.out.println("La cantidad de puertas del coche es: " + coche.getPuertas());
    coche.incrementarPuertas();
    System.out.println("La cantidad de puertas del coche es: " + coche.getPuertas());
  }

  public static int suma(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }
}

class Coche {
  public int cantidadPuertas;

  Coche(int cantidadPuertas) {
    this.cantidadPuertas = cantidadPuertas;
  }

  public int getPuertas() {
    return this.cantidadPuertas;
  }

  public void incrementarPuertas() {
    this.cantidadPuertas++;
  }
}