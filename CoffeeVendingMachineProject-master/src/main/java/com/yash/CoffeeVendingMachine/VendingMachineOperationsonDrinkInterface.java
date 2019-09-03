package com.yash.CoffeeVendingMachine;

import com.yash.models.Container;

public interface VendingMachineOperationsonDrinkInterface {


	void prepareDrink(Container containers, String drinkType, Integer quantity);
	
}
