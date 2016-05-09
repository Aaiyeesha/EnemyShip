/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemyshiptesting;

/**
 *
 * @author Aaiyeesha Mostak
 */

import java.util.Scanner;

public class EnemyShipTesting 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        // TODO code application logic here
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type ship? (U / R/ B)");
        
        if(userInput.hasNextLine())
        {
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        
        if(theEnemy != null)
        {
            doStuffEnemy(theEnemy);
        }
        else
        {
            System.out.println("Enter U, R or B next time");
        }
        
    }
    
    public static void doStuffEnemy(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
    
}
