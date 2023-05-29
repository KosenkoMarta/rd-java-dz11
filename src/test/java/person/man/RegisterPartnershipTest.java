package person.man;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterPartnershipTest {
    private Woman women;
    private Man men;

    @BeforeClass
    public void addNewWomenObject(){
        men = new Man("Dmytro", "Shevchenko", 65, null);
        women = new Woman("Marta", "Shevchenko", 62, null, "Kosenko");
    }
    //test register partnership
    @Test
    public void testRegisterPartnership(){
        men.registerPartnership(women);
        // Перевіряємо, що партнерство було успішно зареєстроване
        Assert.assertEquals(women, men.getPartner(), "The register partnership method works wrong");

    }
}

