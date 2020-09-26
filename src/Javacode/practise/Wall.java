package Javacode.practise;

public class Wall {
	
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		if(this.height < 0) {
			this.height =0 ;
			return 0;
		}
		return height;
	}
	
	public Wall(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Wall() {
		this.width = this.getWidth();
		this.height = this.getHeight();
	}
	public double getArea() {
		return this.height * this.width;
	}
	
	
}
