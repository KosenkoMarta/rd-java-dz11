package person.woman;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterPartnershipTest {
    private Woman woman;
    private Man man;

    @BeforeClass
    public void addNewWomenObject(){
        man = new Man("Dmytro", "Shevchenko", 65, null);
        woman = new Woman("Marta", "Shevchenko", 62, null, "Kosenko");
    }

    @Test
    public void testRegisterPartnership(){
        woman.registerPartnership(man);
        // Перевіряємо, що партнерство було успішно зареєстроване
        Assert.assertEquals(man, woman.getPartner(), "Метод реєстрації партнерства працює неправильно");
        // Перевіряємо, що прізвище woman змінилося на прізвище man
        Assert.assertEquals(man.getLastName(), woman.getLastName(), "Метод реєстрації партнерства працює неправильно");

    }
}
