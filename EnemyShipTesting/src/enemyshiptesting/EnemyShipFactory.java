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
public class EnemyShipFactory 
{
    public EnemyShip makeEnemyShip(String newShipType)
    {
        EnemyShip newShip = null;
        
        if(newShipType.equals("U"))
        {
            return new UFOEnemyShip();
        }
        
        else if(newShipType.equals("B"))
        {
            return new BigUFOEnemyShip();
        }
        
        else if(newShipType.equals("R"))
        {
            return new RocketEnemyShip();
        }
        
        else return null;
    }
}
