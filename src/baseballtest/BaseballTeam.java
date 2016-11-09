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
public class BaseballTeam extends Sports implements Stats{
    /*
    Default Constructer. Inherits methods from the super class using super()
    */
    public BaseballTeam(){
        super();
    }
    
    /*
    * Overrides the overallPoints() method from the implented Stats class
    * Description: returns the overall points for a team where 2 points are given for each win, 1 point for a tie, and 0 points for a loss.
    */
    public int overallPoints(){
        int points = 0;
        points += (2 * won);
        points = points + tied;
        return points;
    }
    
}
