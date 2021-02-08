package com.xworkz.spring;

public class Projector {

	private int life;// const
	private boolean hd;//const
	private double maxDistance;//const
	private double cost;//property
	public Projector(int life, boolean hd, double maxDistance) {
		super();
		this.life = life;
		this.hd = hd;
		this.maxDistance = maxDistance;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Projector [life=" + life + ", hd=" + hd + ", maxDistance=" + maxDistance + ", cost=" + cost + "]";
	}
}
