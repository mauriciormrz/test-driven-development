package numerosromanos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumerosRomanosTest {

    private NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    public void pasar1ARomanos(){

        String romano = numerosRomanos.convertirAromanos(1);
        assertEquals(romano, "I");
    }

    @Test
    public void pasar2ARomanos(){

        String romano = numerosRomanos.convertirAromanos(2);
        assertEquals(romano, "II");
    }

    @Test
    public void pasar3ARomanos(){

        String romano = numerosRomanos.convertirAromanos(3);
        assertEquals(romano, "III");
    }

    @Test
    public void pasar4ARomanos(){

        String romano = numerosRomanos.convertirAromanos(4);
        assertEquals(romano, "IV");
    }

    @Test
    public void pasar5ARomanos(){

        String romano = numerosRomanos.convertirAromanos(5);
        assertEquals(romano, "V");
    }

    @Test
    public void pasar6ARomanos(){

        String romano = numerosRomanos.convertirAromanos(6);
        assertEquals(romano, "VI");
    }

    @Test
    public void pasar7ARomanos(){

        String romano = numerosRomanos.convertirAromanos(7);
        assertEquals(romano, "VII");
    }

    @Test
    public void pasar8ARomanos(){

        String romano = numerosRomanos.convertirAromanos(8);
        assertEquals(romano, "VIII");
    }

    @Test
    public void pasar9ARomanos(){

        String romano = numerosRomanos.convertirAromanos(9);
        assertEquals(romano, "IX");
    }
}
