import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Zalisekile on 2017/03/26.
 */
class RectangleServiceImplTest extends RectangleServiceImpl
{

    @Test
    void calculatArea()
    {
        Rectangle calc = new RectangleServiceImpl();
        int result = calc.calculatArea(5,10);
        assertEquals(50,result,"triangle area lenght 5 and width 10");
    }

}