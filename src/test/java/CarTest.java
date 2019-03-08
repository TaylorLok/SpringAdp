import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;


public class CarTest
{

    @Before
    public void Setup() throws Exception
    {
        Car car = new Car
                .Builder()
                .CarId("CA22222Kin")
                .CarName("BMW")
                .CarModel("Polo")
                .build();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Ignore
    @Test
    public void CarId() {
        Assert.assertEquals("CA198912A", "CA198912A");
    }

    @Test
    public void CarName()
    {
        Car car = new Car
                .Builder()
                .build();
        Assert.assertEquals("Mercedes", "Mercedes");
    }


    @Test
    public void CarModel()
    {
        Assert.assertEquals("Audi", "Audi");
    }

    @Test(timeout = 10000)
    public void getCarName()
    {
        Assert.assertEquals("VW", "VW");
        while (true) ;
    }

    @Test
    public void CarEqualityTest()
    {
        Assert.assertEquals("Car", "Car");
    }

    @Test(expected = AssertionError.class)
    public void CarObjectIdentity()
    {
        Car car = new Car
                .Builder()
                .build();

        Assert.assertEquals("Clio", "Clio");
    }

    @Test
    public void ReadFile()
    {
        try
        {
            FileReader reader = new FileReader("test.txt");
            reader.read();
            reader.close();
            fail("Expected an IOException to be thrown");
        }
        catch (IOException e)
        {
            assertEquals(e.getMessage(),("test.txt (The system cannot find the file specified)"));
        }

    }

}

