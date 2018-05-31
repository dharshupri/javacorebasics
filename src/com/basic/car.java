package com.basic;

public class car {
	private String model;
	
	private Double speed;
	
	public car () {
		
	}
		public String getModel() {
			
		
		return model;
		}
	public void setModel(String model) {
		
		this.model = model;
	}
	public Double getSpeed() {
		
		return speed;
	}
	public void setSpeed(Double speed) {
		
	
		this.speed = speed;
	}
		public boolean start()
		{
			return true;
		}
		public void accerlerate() {
		speed+=10;
		
		}
			public static void main(String[]args)
			{
				car car1=new car();
				car car2=new car();
				
				car1.speed=30.0;
				car2.speed=50.0;
				
				System.out.println(car1.speed);
				System. out.println(car2.speed);
			}
			
		}


	


