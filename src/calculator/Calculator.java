/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        char sign=in.next().charAt(0);
        if(sign=='+')
        {
            System.out.println(a+b);
        }
        else if(sign=='-')
        {
            System.out.println(a-b);
        }
        else if(sign=='*')
        {
            System.out.println(a*b);
        }
        else if(sign=='/')
        {
            System.out.println(a/b);
        }
    }
    
}
