/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scorewithbound;

import java.util.Scanner;
/**
 *
 * @author ZETPOM
 */
public class ScoreWithBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ScoreBean sb = new ScoreBean();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();

        sb.addPropertyChangeListener(sub1);
        sb.addPropertyChangeListener(sub2);

        String inp;
        while(true){
            System.out.print("Enter Score ");
            inp = sc.nextLine();
            if(!(inp.equals("")))
                sb.setScoreLine(inp);
            else break;
        }
    }

}
