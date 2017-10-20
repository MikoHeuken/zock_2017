package zock_2017;

public class Vertex {
	
	
	public	double x;
	public	double y;
	
	
	public Vertex(double x, double y){
		
		this.x = x;
		this.y = y;
	}
	
	
	public String toString(){
		
		return "("+x+", "+y+") ";
		
	}
	
	
	public double length(){
		
		return Math.sqrt(x*x+y*y);
	
	}
	
	
	public Vertex skalarMult (double s){
		
		return new Vertex(x*s, y*s);
		
	}
	
	
	public void skalarMultMod (double s){
		
		x=x*s;
		y=y*s;		
		
	}
	
	
	public Vertex add(Vertex v){
		
		return new Vertex(v.x+x, v.y+y);
	}
	
	
	public void addMod(Vertex v){
		
		x = v.x+x;
		y = v.y+y;		
	}
	
	
	public Vertex sub(Vertex v){
		
		return new Vertex(v.x-x, v.y-y);
	}
	
	
	public void subMod(Vertex v){
		
		x = v.x-x;
		y = v.y-y;		
	}
	
	
	public double getX(){return x;}
	
	public double getY(){return y;}
	
	public void setX(double x){this.x = x;}
	
	public void setY(double y){this.y = y;}
	
	public boolean equals(Object thatObject){
		
		if(thatObject instanceof Vertex){
			Vertex that = (Vertex)thatObject;
			return this.x == that.x && this.y == that.y;
		}
		return false;
	}
	
	
	public double distance(Vertex v){
		
		double xx=this.x-v.x;
		double yy=this.y-v.y;
		
		return Math.sqrt(xx*xx+yy*yy);
	}
	
	
	public void normalize(){
		
		double factor = length();
		x=x/factor;
		y=y/factor;

	}
	
	
}
