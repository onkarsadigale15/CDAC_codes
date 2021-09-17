package geometry;

public class Point2D {
	    
	    public float x=0;
		public float y=0;
	    public Point2D(float x,float y)
	    {
	    this.x=x;
	    this.y=y;
	    
	    }
	    public String getDetails()
	    {
	        String str;
	        str="Cordinate X: "+this.x+" Cordinate y: "+this.y;
	        return str;
	    
	    }
	    
	    public boolean isEqual(Point2D another)
	    { 
	        if(this.x==another.x && this.y==another.y)
	        {
	            return true;
	        }
	        else{
	            return false;
	        }

	    }
	    public Point2D createNewPoint(float x,float y)
	    {
	        return new Point2D(this.x+x, this.y+y);
	    }
	    

	    public double calculateDistance(Point2D anotherobj)
	    {
	        double distance=0;
	        distance=(Math.pow((anotherobj.x-this.x),2))+(Math.pow((anotherobj.y-this.y),2));

	        distance=Math.sqrt(distance);

	        System.out.println("Distance is "+distance);
	        return distance;
	    }

	    }


