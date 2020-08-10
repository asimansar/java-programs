import java.util.Scanner;

class greadeandAverage{
    public static void main(String [] args){
        int m1,m2,m3;
        int averageMark;
        
        m1 = Integer.parseInt(args[0]);
        m2 = Integer.parseInt(args[1]);
        m3 = Integer.parseInt(args[2]);

        averageMark=(m1+m2+m3)/3;
              
        switch (averageMark/10) {
            case 10 :
                
            case 9 :
                System.out.println("A-grade");
                break;
            case 8 :
                System.out.println("B-grade");
                break;
            case 7 :
                System.out.println("C-grade");
                break;
            case 6 :
                System.out.println("D-grade");
                break;
            case 5:
                System.out.println("E-grade");
                break;
            default:
                System.out.println("Failed!");
                break;
        }
    }
}