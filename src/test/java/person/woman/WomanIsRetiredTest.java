package person.woman;

import com.rd.world.Man;
import com.rd.world.Person;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WomanIsRetiredTest {
    private Woman women;
    private Woman womenSecond;

    @BeforeClass
    public void addNewMenObject(){
        Person partner = new Man("Dmytro", "Shevchenko", 65, women);
        Person partnerSecond = new Man("Yaroslav", "Lysenko", 55, womenSecond);
        women = new Woman("Marta", "Kosenko", 62, partner, "Kosenko");
        womenSecond = new Woman("Alina", "Lysenko", 50, partnerSecond, "maidenAlina");
    }
    //test is retired
    @Test
    public void testIsRetired(){
        Assert.assertTrue(women.isRetired(), "Невірний результат перевірки");
    }
    //test is not retired
    @Test
    public void testIsNotRetired(){
        Assert.assertFalse(womenSecond.isRetired(), "Невірний результат перевірки");
    }
}
