import java.util.Scanner;

class Complex {
    double real, img;

    Complex(){}
    Complex(double tempreal, double tempimg)
    {
        this.real=tempreal;
        this.img=tempimg;
    }

    Complex add(Complex c1, Complex c2)
    {
        Complex c3= new Complex(0,0);
        c3.real=c1.real+c2.real;
        c3.img=c1.img+c2.img;
        return c3;
    }

    Complex sub(Complex c1, Complex c2)
    {
        Complex c3=new Complex(0,0);
        c3.real=c1.real-c2.real;
        c3.img=c1.img-c2.img;
        return c3;
    }

    Complex mul(Complex c1, Complex c2)
    {
        Complex c3=new Complex(0,0);
        c3.real=(c1.real*c2.real)-(c1.img*c2.img);
        c3.img=(c1.real*c2.img)+(c1.img*c2.real);
        return c3;
    }

    void display()
    {
        System.out.println(real + " + " + img + 'i');
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first complex number ");
        System.out.println("Enter real part ");
        double r1=s.nextDouble();
        System.out.println("Enter imaginary part ");
        double i1=s.nextDouble();
        Complex c1= new Complex(r1,i1);
        c1.display();
        System.out.println("Enter second complex number ");
        System.out.println("Enter real part ");
        double r2=s.nextDouble();
        System.out.println("Enter imaginary part ");
        double i2=s.nextDouble();
        Complex c2= new Complex(r2,i2);
        c2.display();
	    Complex c3= new Complex();
	    c3=c3.add(c1,c2);
	    Complex c4= new Complex();
	    c4=c4.sub(c1,c2);
	    Complex c5= new Complex();
	    c5=c5.mul(c1,c2);
        System.out.println("Addition : ");
	    c3.display();
	    System.out.println("Subtraction : ");
	    c4.display();
	    System.out.println("Multiplication : ");
        c5.display();
        s.close();
    }
}
