import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarTest {
    Park parking;
    Audi audi;

    @BeforeMethod
    public void setUP(){
        System.out.println("Before method");
         parking = new Park();
         audi = new Audi("Karen",BodyType.Coup);
    }

    @Test
    public void testA(){
        System.out.println("TestA");
        parking.addCar(audi);
//        parking.addCar(new Car());
        System.out.println(parking.getCount());
        Assert.assertTrue(parking.getCount() == 1);
    }
    @Test
    public void testB(){
        System.out.println("TestB");
        parking.removeCar(BodyType.Sedan,0);
        Assert.assertEquals("Car is not there","Car is not there");
//        parking.addCar(new Car());
//        Assert.assertFalse(parking.getCarCount() == 0);
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After method");
    }
}
