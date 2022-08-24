package areaShapes;

public class Area {
	
	//rect and square
    public double area(double a, double b){
        return a*b;
    }
    //circle
    public double area(double r){
        return 3.14*(r*r);
    }
    //triangle different lengths
    public double area(double a, double b, double c){
        double p = (a+b+c)/2;
        return Math.sqrt( p*(p-a)*(p-b)*(p-c) );
    }

}
