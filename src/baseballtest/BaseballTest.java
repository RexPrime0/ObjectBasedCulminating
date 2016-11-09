/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

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
        BaseballTeam team = new BaseballTeam();
        team.Win();
        team.Lose();
        team.Tie();
        int points = team.overallPoints();
        System.out.println("Our team has an overall of " + points + " points!");
        
    }
    
}
