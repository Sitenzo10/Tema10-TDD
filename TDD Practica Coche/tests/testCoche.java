import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCoche {
    @Test
    public void test_crear_coche_vel_es_cero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

    @Test
    public void test_acelerar_vel_aumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_Andres(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_decelerar_vel_disminuye(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar_Andres(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void test_decelerar_vel_no_cero(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar_Andres(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
