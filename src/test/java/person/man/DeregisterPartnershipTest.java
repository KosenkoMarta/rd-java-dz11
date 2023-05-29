package person.man;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeregisterPartnershipTest {
    private Man man;
    private Woman woman;

    @BeforeClass
    public void addNewWomenObject() {
        man = new Man("Dmytro", "Shevchenko", 65, null);
        woman = new Woman("Marta", "Shevchenko", 62, man, "Kosenko");
    }

    @Test
    public void testDeregisterPartnership(){
        man.deregisterPartnership();
        // Перевіряємо, що партнерство зняте та партнер став рівним null
        Assert.assertNull(man.getPartner(), "Метод скасування реєстрації партнерства працює неправильно");

    }

}
