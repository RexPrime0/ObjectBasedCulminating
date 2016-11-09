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
 * This class is the super class of Sports teams
 */
abstract class Sports {
    //intilaize variables
    public String name;
    public static int won;
    public static int lost;
    public static int tied;
    public static int players;
    
    /*
    Default constructer. Asks for name of team and the number of players
    */
    public Sports(){
        String name = JOptionPane.showInputDialog("What is your Team's name?");
        String player = JOptionPane.showInputDialog("How many players are on your team?");
        players = Integer.parseInt(player);
    }
    /*
    Adds another win to the team
    */
    public void Win(){
        JOptionPane.showMessageDialog(null, "You won a game!");
        won += 1;
    }
     /*
    Adds another loss to the team
    */
    public void Lose(){
        JOptionPane.showMessageDialog(null, "You lost a game ):");
        lost += 1;
    }
    /*
    Adds another tie to the team
    */
    public void Tie(){
        JOptionPane.showMessageDialog(null, "You tied a game!");
        tied += 1;
    }
     /*
    returns number of wins
    */
    public int getWins(){
    return won;    
    }
    /*
    returns number of losses
    */
    public int getLosses(){
    return lost;    
    }
    /*
    returns number of ties
    */
    public int getTies(){
    return tied;    
    }
    
}


