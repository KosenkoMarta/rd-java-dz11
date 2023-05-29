package person.man;

import com.rd.world.Man;
import com.rd.world.Person;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ManIsRetiredTest {
    private Man men;
    private Man menSecond;

    @BeforeClass
    public void addNewMenObject(){
        Person partner = new Woman("Marta", "Kosenko", 59, men, "Kosenko");
        Person partnerSecond = new Woman("Alina", "Lysenko", 50, menSecond, "maidenAlina");
        men = new Man("Dmytro", "Shevchenko", 65, partner);
        menSecond = new Man("Yaroslav", "Lysenko", 55, partnerSecond);
    }
    //test is retired
    @Test
    public void testIsRetired(){
        Assert.assertTrue(men.isRetired(), "Невірний результат перевірки");
    }
    //test is not retired
    @Test
    public void testIsNotRetired(){
        Assert.assertFalse(menSecond.isRetired(), "Невірний результат перевірки");
    }
}
