package person.woman;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGetSetWoman {
    private Woman woman;
    private Man man;

    @BeforeClass
    public void addNewMenObject(){
        woman = new Woman("Firstname", "Lastname", 44, man, "Maidenname");
        man = new Man("Firstname", "Lastname", 45, woman);

    }

    @Test
    public void testFirstname(){
        woman.setFirstName("Marta");
        Assert.assertEquals(woman.getFirstName(), "Marta", "Ім'я не таке саме");
    }

    @Test
    public void testLastname(){
        woman.setFirstName("Shevchenko");
        Assert.assertEquals(woman.getFirstName(), "Shevchenko", "Прізвище не таке саме");
    }

    @Test
    public void testAge(){
        woman.setAge(60);
        Assert.assertEquals(woman.getAge(), 60, "Вік не такий самий");
    }

    @Test
    public void testPartner(){
        woman.setPartner(man);
        Assert.assertEquals(woman.getPartner(), man, "Партнер не той самий");
    }
}
