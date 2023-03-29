public class Coche {
    public int velocidad;

    public void acelerar_Andres(int aceleracion) {
        velocidad+=aceleracion;
    }

    public void decelerar_Andres(int deceleracion) {
        velocidad-=deceleracion;
        if (velocidad <0){
            velocidad = 0;
        }
    }
}
