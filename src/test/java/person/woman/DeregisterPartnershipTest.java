package person.woman;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeregisterPartnershipTest {
    private Woman woman;
    private Man man;

    @BeforeClass
    public void addNewWomenObject(){
        woman = new Woman("Marta", "Kosenko", 62, null, "Kosenko");
        man = new Man("Dmytro", "Shevchenko", 65, woman);
    }

    @Test
    public void testRegisterPartnership(){
    woman.deregisterPartnership();
    // Перевіряємо, що партнерство зняте та партнер став рівним null
    Assert.assertNull(woman.getPartner(), "Метод скасування реєстрації партнерства працює неправильно");

    // Перевіряємо, що прізвище повернулося до вихідного
    Assert.assertEquals("Kosenko", woman.getLastName(), "Метод скасування реєстрації партнерства працює неправильно");
}

}
