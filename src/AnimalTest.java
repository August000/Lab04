/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
    
    public void fullConstructorTest() throws AssertException{
        
    	// Use the full constructor
        Animal animal = new Animal("Orange", "Tony", 200.1, 20);

        Assert.assertEquals("Orange", animal.getColor());
        Assert.assertEquals("Tony", animal.getName());
        Assert.assertEquals(200.1, animal.getWeight(), 0.01);
        Assert.assertEquals(20, animal.getHeight(), 0.01);
        Assert.assertEquals("Tony, a Orange-colored animal. 200.1 pounds, 20.0 inches\n", animal.toString());
    }
    
    public void equalsTest() throws AssertException{
    	
    	Animal animal1 = new Animal("Grey", "Sailey", 200.1, 20);
    	Animal animal2 = new Animal("Grey", "Sailey", 200.1, 20);
    	
    	Assert.assertEquals(true, animal1.equals(animal2));
    }

}

