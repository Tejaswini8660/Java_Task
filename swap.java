public class swap {
  public static void main(String args[]){
/*int x=5,y=7;
System.out.println("Before swap  "+x+"  and  "+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("After swaping  "+x+"  and  "+y);
  }
}*/
int x=8,y=5;
System.out.println("before swping  "+x+"  and  "+y);
x=x^y;
y=x^y;
x=x^y;
System.out.println("After swaping  "+x+"  and  "+y);
  }
}
