 //HECHO POR JUAN JALABERT RIQUELME
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        if (radio < 0) {
            radio = 0;
        }
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }

    public static class Cilindro extends Circulo {
        private double altura;

        public Cilindro(double radio, double altura) {
            super(radio);
            this.altura = altura;
            if (altura < 0) {
                altura = 0;
            }
        }

        public double getAltura() {
            return altura;
        }

        public double getVolume() {
            return getArea() * getAltura();
        }

    }


        public static void main (String[]args){
            Circulo ej1 = new Circulo(5);
            Cilindro ej2 = new Cilindro(5, 5);
            System.out.println(ej1.getArea());
            System.out.println(ej2.getVolume());
        }
    }

