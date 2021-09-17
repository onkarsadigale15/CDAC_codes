class Point2D{
    private int x;
    private int y;

    Point2D(int x,int y){
        this.x=x;
        this.y=y;
    };
    public String getDetails() {     
        return " X : "+this.x+"  Y  : "+this.y;
    }
    boolean isEqual(Point2D d){
        return this.x==d.x && this.y==d.y;
    }
    Point2D addOffset(int a,int b){
        x=this.x+a;
        y=this.y+b;
        return new Point2D(x,y);
    }

    double calculateDistance(Point2D p){
        double distance=Math.sqrt(Math.pow((p.x-this.x),2)+Math.pow((p.y-this.y),2));
        return distance;
    }
   
}

