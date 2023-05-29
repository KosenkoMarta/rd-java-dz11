package person.man;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGetSetMan {
    private Man man;
    private Woman woman;

    @BeforeClass
    public void addNewMenObject(){
        man = new Man("Firstname", "Lastname", 45, woman);
        woman = new Woman("Firstname", "Lastname", 44, man, "Maidenname");
    }

    @Test
    public void testFirstname(){
        man.setFirstName("Dmytro");
        Assert.assertEquals(man.getFirstName(), "Dmytro", "Ім'я не таке саме");
    }

    @Test
    public void testLastname(){
        man.setFirstName("Shevchenko");
        Assert.assertEquals(man.getFirstName(), "Shevchenko", "Прізвище не таке саме");
    }

    @Test
    public void testAge(){
        man.setAge(66);
        Assert.assertEquals(man.getAge(), 66, "Вік не такий самий");
    }

    @Test
    public void testPartner(){
        man.setPartner(woman);
        Assert.assertEquals(man.getPartner(), woman, "Партнер не той самий");
    }
}
