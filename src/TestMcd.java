import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMcd {

    private Mcd mcd = new Mcd();

    @Test
    void calculoMCD() {
        mcd.setNum1(72);
        mcd.setNum2(16);
        assertEquals(8, mcd.calculoMCD());
    }


}