import java.util.Scanner;

class roman {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
        int current = 0;
        int ans = 0;
        int previous = 0;
    System.out.println("enter the number : ");
    num = s.nextInt();
        for (int i = s.length() - 1; i >= 0; i--) {
            switch(s.charAt(i)){
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }
            if ( previous > current) {
                ans -= current;
            }else{
                ans += current;
                previous = current;
            }
           
        }
       
    }
    
}