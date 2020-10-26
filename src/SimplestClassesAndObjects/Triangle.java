package SimplestClassesAndObjects;

public class Triangle {
    private double[] a = new double[2];
    private double[] b = new double[2];
    private double[] c = new double[2];

    public Triangle(double[] a, double[] b, double[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double length(double[] a, double[] b){
        double length = Math.abs(Math.sqrt(Math.pow((a[0]-b[0]),2)+Math.pow((a[1]-b[1]),2)));
        return length;
    }
    public double perimetr(){
        double a_length = length(a,b);
        double b_length = length(b,c);
        double c_length = length(a,c);

        return a_length+b_length+c_length;
    }
    public double suqare(){
        double a_length = length(a,b);
        double b_length = length(b,c);
        double c_length = length(a,c);
        double p = perimetr()/2;
        return Math.sqrt(p*(p-a_length)*(p-b_length)*(p-c_length));
    }
    public void centr(){
        double centr_x = (a[0]+b[0]+c[0])/3;
        double centr_y = (a[1]+b[1]+c[1])/3;
        System.out.println("Координаты точки пересечения медины: x: "+centr_x+" y: "+centr_y);
    }
}
