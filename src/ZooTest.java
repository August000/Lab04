 
public class ZooTest {
	
	
	public void fullConstructorTest() throws AssertException{
	
		Zoo zoo = new Zoo(4);
		
		Assert.assertEquals(4, zoo.getAnimals().length);
		Assert.assertEquals(4, zoo.getCapacity());
	}
	
	public void expandZooTest() throws AssertException{
		
		Zoo zoo = new Zoo(1);
		Animal ani1 = new Animal("Weasel","White",10,5);
		Animal ani2 = new Animal("Tiger","White",200,50);
		zoo.addAnimal(ani1);
		zoo.addAnimal(ani2);
		
		Assert.assertEquals(2, zoo.getCapacity());
	}
	
	public void addAnimalTest() throws AssertException{
		
		Zoo zoo = new Zoo(2);
		
		Animal ani = new Animal("White","Weasel",10,5); 
		zoo.addAnimal(ani);
		
		Assert.assertEquals(ani, zoo.getAnimals()[0]);
		
	}
	
	public void totalHeightTest() throws AssertException{
		
		Zoo zoo = new Zoo(2);
		Animal ani1 = new Animal("White","Weasel",10,5);
		Animal ani2 = new Animal("White","Tiger",200,50);
		zoo.addAnimal(ani1);
		zoo.addAnimal(ani2);
		
		Assert.assertEquals(55.0, zoo.getTotalHeight());
	}
	
	public void getAverageWeightDefautTest() throws AssertException {
		
		Zoo zoo = new Zoo(3);
		Animal ani1 = new Animal("White","Weasel",20,5);
		Animal ani2 = new Animal("White","Tiger",200,50);
		zoo.addAnimal(ani1);
		zoo.addAnimal(ani2);
		
		Assert.assertEquals(110, zoo.getAverageWeight());
	}
	
	public void getAverageWeightColorTest() throws AssertException {
		
		Zoo zoo = new Zoo(4);
		Animal ani1 = new Animal("White","Weasel",20,5);
		Animal ani2 = new Animal("White","Tiger",200,50);
		Animal ani3 = new Animal("Bleack","Whale",1000,200);
		zoo.addAnimal(ani1);
		zoo.addAnimal(ani2);
		zoo.addAnimal(ani3);
		
		Assert.assertEquals(110, zoo.getAverageWeight("white"));
	}
	
}

