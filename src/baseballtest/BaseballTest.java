/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;
import javax.swing.JOptionPane;
/**
 *
 * @author Abels6598
 */
public class BaseballTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declare the baseball team
        BaseballTeam team = new BaseballTeam();
        /*
        Make the team win once, lose once, and then tie once. Calculate overall points and display them to user.
        */
        team.Win();
        team.Lose();
        team.Tie();
        int points = team.overallPoints();
        JOptionPane.showMessageDialog(null, "Our team has an overall of " + points + " points!");
        System.exit(0);
    }
    
}
