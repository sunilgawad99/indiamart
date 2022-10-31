package indianMart.testClasses;

import org.testng.annotations.BeforeClass;

import indianMart.base.Base;

public class BuildingConstructionTest {

	@BeforeClass
	public void openBrowser()
	{
		Base.bowserInitilizer();
	}
	
}
