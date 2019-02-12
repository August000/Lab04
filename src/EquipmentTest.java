
public class EquipmentTest{
	
	// Tests full Equipment constructor and getter methods
	public void fullConstructorTest() throws AssertException{
		
		Equipment eq = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
	
		Assert.assertEquals("Batarang", eq.getName());
		Assert.assertEquals(5, eq.getCount());
		Assert.assertEquals(5.0, eq.getTotalWeight());
		Assert.assertEquals(5.0, eq.getTotalPrice());
		Assert.assertEquals("A boomerang for bats", eq.getDescription());
		
	}
	
	public void toStringTest() throws AssertException {
		
		Equipment eq = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		Assert.assertEquals("Name: Batarang, Number: 5, Weight: 5.00 lbs, Price: $5.00 - A boomerang for bats", eq.toString());
	}
	
	public void equalsTest() throws AssertException {
		
		Equipment eq1 = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		Equipment eq2 = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		
		Assert.assertEquals(true, eq1.equals(eq2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}