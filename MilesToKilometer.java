 import java.util.Scanner;
public class MilesToKilometer{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no of traveld value:");
    double d=sc.nextDouble();
    System.out.print("Enter the unit M-miles,Km-Kilometer:");
    char m=sc.next().charAt(0);
    double  traveldValues;
    if(m=='M' || m=='m'){
      traveldValues=milesToKilometers(d);
      System.out.println("convert miles to kilometers:"+ traveldValues+"km");
     } else if(m =='K'|| m=='k'){
        traveldValues=kilometersToMiles(d);
        System.out.println("convert kilometers to miles:"+ traveldValues+"mi");
      }
      else{
        System.out.println("invalid ,,,please enter 'M'or'K'");
      }
      sc.close();
    }

    public static double milesToKilometers(double traveldValues){
     
      return(traveldValues*1.609344);
    }
    public static double kilometersToMiles(double traveldValues){
      return(traveldValues/1.609344);

    }
}
 {
  
}
