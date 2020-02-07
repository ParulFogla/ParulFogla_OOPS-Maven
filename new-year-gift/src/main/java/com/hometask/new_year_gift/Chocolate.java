package com.hometask.new_year_gift;

public class Chocolate implements Gift{

	int price,weight,cat;
	String name;
	
	public Chocolate(int price, int weight,String name,int cat) {
		super();
		this.price = price;
		this.weight = weight;
		this.name=name;
		this.cat=cat;
	}
	
	
	public int getPrice()
	{
		return price;
	}
	
	
	public int getWeight()
	{
		return weight;
	}


	public String getName() {
		return name;
	}
	
	public int getCat()
	{
		return cat;
	}

	@Override
	public String toString() {
		return "Name=" +  name + " [price=" + price + ", weight=" + weight  + "]";
	}

	
}
