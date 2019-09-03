/**
 * 
 */
package com.yash.CoffeeVendingMachine;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
import com.yash.models.*;
public class ContainerTest {
	@Test
	public void TestContainerFieldForTea()
	{
		Container container=new Container();
				container.setTeaContainer(2000.0);
	assertEquals(2000.0, container.getTeaContainer(),1);
	}
	
	@Test
	public void TestContainerFieldForCoffee()
	{
		Container container=new Container();
				container.setCoffeeContainer(2000.0);
	assertEquals(2000.0, container.getCoffeeContainer(),1);
	}
	
	@Test
	public void TestContainerFieldForMilk()
	{
		Container container=new Container();
				container.setMilkContainer(10000.0);
	assertEquals(10000.0, container.getMilkContainer(),1);
	}
	
	@Test
	public void TestContainerFieldForSugar()
	{
		Container container=new Container();
				container.setSugarContainer(8000.0);;
	assertEquals(8000.0, container.getSugarContainer(),1);
	}
	
	@Test
	public void TestContainerFieldForWater()
	{
		Container container=new Container();
				container.setWaterContainer(15000.0);;;
	assertEquals(15000.0, container.getWaterContainer(),1);
	}

}
