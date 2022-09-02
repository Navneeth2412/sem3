import java.util.Scanner;

abstract class Vehicle{
    public int year_of_man;
    Vehicle(){}
    abstract int getData();
    abstract void putData(int year);
}

class TwoWheeler extends Vehicle{
    int getData(){
        return year_of_man;
    }
    void putData(int year){
        year_of_man=year;
    }
    TwoWheeler(int year)
    {
        year_of_man=year;
    }
}

final class FourWheeler extends Vehicle{
    int getData(){
        return year_of_man;
    }
    void putData(int year){
        year_of_man=year;
    }
    FourWheeler(int year)
    {
        year_of_man=year;
    }
}

class MyTwoWheeler extends TwoWheeler{
    MyTwoWheeler(int year)
    {
        super(year);
    }
}
public class VehicleD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year of Manufacture \n");
        int year=sc.nextInt();
        MyTwoWheeler myTwoWheeler= new MyTwoWheeler(year);
        System.out.println(myTwoWheeler.getData());
    }

}











////////
public abstract class Vehicle {
    int year_of_manufacture;
    abstract int getData();
    abstract void putData(int year_of_manufacture);
    Vehicle(int year_of_manufacture){
        this.year_of_manufacture=year_of_manufacture;
    }
}

class TwoWheeler extends Vehicle{
    TwoWheeler(int year_of_manufacture){
        super(year_of_manufacture);
    }
    int getData(){
        return year_of_manufacture;
    }
    void putData(int year_of_manufacture){
        this.year_of_manufacture=year_of_manufacture;
    }
}

final class FourWheeler extends Vehicle{
    FourWheeler(int year_of_manufacture){
        super(year_of_manufacture);
    }
    int getData(){
        return year_of_manufacture;
    }
    void putData(int year_of_manufacture){
        this.year_of_manufacture=year_of_manufacture;
    }
}

class MyTwoWheeler extends TwoWheeler{

    MyTwoWheeler(int year_of_manufacture) {
        super(year_of_manufacture);
    }
}

public class driver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MyTwoWheeler myTwoWheeler=new MyTwoWheeler(2000);
        System.out.println("Enter the year it was manufactured");
        myTwoWheeler.putData(scanner.nextInt());
        System.out.println("The car was manufactured in "+myTwoWheeler.getData());
        scanner.close();
	}
}