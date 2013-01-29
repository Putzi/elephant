package it.redoddity.elephant;

import java.awt.Color;

public class Elephant {
	
	private int weight = 100;
	private Color color = null;
	private Boolean feeded = false;
	
	private String name = "Dumbo";
	
	public Elephant(String name)
	{
		this.name = name;
	}

	public boolean isEmpty()
	{
		return !this.feeded;
	}

	public void feed()
	{
		this.feeded = true;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {

		return this.weight;
	}

	public void growOneYear() {
		// TODO Auto-generated method stub
		
	}

	public void setColor(Color green) {
		this.color = green;
		
	}

	public Color getColor() {
		return color;
	}

	public void kick() {
		// TODO Auto-generated method stub
		
	}
}
