import java.util.Scanner;
public class TemparatureConveter {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Temparatue value:");
    double d=sc.nextDouble();
    System.out.println("Enter the unit,C-Celsius,F-Farenheit:");
    char c=sc.next().charAt(0);
    double convertTemparature;
    if(c=='C' || c=='c'){
      convertTemparature=celsiusTOFahrenhit(d);
      System.out.println("convert tempurature to Farenheit:"+convertTemparature+"°F");
    }
    else if(c=='F' || c=='f')
    {
      convertTemparature=fahrenheitToCelsius(d) ;
      System.out.println("convert tempurature to Celsius:"+convertTemparature+"°C");

    }
    else{
      System.out.println("invalid ,,,please enter 'C'or'F'");
    }
    sc.close();
  }
  public static double celsiusTOFahrenhit(double celsius){
    return(celsius*9/5)+32;
  }
  public static double fahrenheitToCelsius(double fahrenhit){
    return(fahrenhit-32)*5/9;
  }

  }

