public class Figura {
    public int altura, base, radio, area;
    String tipo;

    public Figura(){}

    public Figura(FiguraBuilder builder){
        this.altura = builder.altura;
        this.base = builder.base;
        this.radio = builder.radio;
        this.tipo = builder.tipo;
        Boolean result = this.area();
        if(!result){
            System.out.println("el tipo de figura ingresada es INCORRECTA.");
        }

    }

    public void Mostrar_Resultados(){
        System.out.println("La area del "+this.tipo.toLowerCase()+" es: "+this.area);
    }

    private boolean area(){
        switch(this.tipo.toLowerCase()){
            case "circulo":
                this.area = (int)(Math.PI * Math.pow(this.radio, 2));
                return true;
            case "rectangulo":
                this.area = this.base * this.altura;
                return true;
            case "cuadrado":
                this.area = this.base * this.base;
                return true;
            default:
                return false;
        }

    }

    //utilizando build pattern

    public static class FiguraBuilder {
        int altura, base, radio;
        String tipo;

        public FiguraBuilder(String tipo){
            this.tipo = tipo;
        }

        public FiguraBuilder altura(int altura){
            this.altura = altura;
            return this;
        }

        public FiguraBuilder base(int base){
            this.base = base;
            return this;
        }

        public FiguraBuilder radio(int radio){
            this.radio = radio;
            return this;
        }

        public FiguraBuilder tipo(String tipo){
            this.tipo = tipo;
            return this;
        }

        public Figura build(){
            switch(this.tipo.toLowerCase()){
                case "circulo":
                    return new Circulo(this);
                case "rectangulo":
                    return new Rectangulo(this);
                case "cuadrado":
                    return new Cuadrado(this);
                default:
                    return null;
            }
        }

    }

}

