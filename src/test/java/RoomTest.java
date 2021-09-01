import Characters.EnemyCharacters.Dragon;
import Characters.MeleeCharacters.Knight;
import Rooms.Room;
import Treasure.Treasure;
import Treasure.TreasureType;
import Weapons.Weapon;
import Weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Dragon dragon;
    Dragon woundedDragon;
    Treasure treasure1; Treasure treasure2; Treasure treasure3; Treasure treasure4;
    Treasure treasure5;
    Knight knight;
    Weapon weapon;

    @Before
    public void before(){
        treasure1 = new Treasure(TreasureType.GOLD);
        treasure2 = new Treasure(TreasureType.GOLD);
        treasure3 = new Treasure(TreasureType.GEM);
        treasure4 = new Treasure(TreasureType.ARTIFACT);
        treasure5 = new Treasure(TreasureType.GOLD);
        dragon = new Dragon(150, "Rimefang");
        woundedDragon = new Dragon(5, "BasicallyDead");
        room = new Room("Dungeon Entrance", woundedDragon);
        weapon = new Weapon("Arcanite Reaper", WeaponType.SWORD);
        knight = new Knight(50, "Zsolt the Honorable", weapon);
    }

    @Test
    public void roomCanAddTreasure(){
        room.addTreasure(treasure1);
        room.addTreasure(treasure2);
        room.addTreasure(treasure3);
        room.addTreasure(treasure4);
        room.addTreasure(treasure5);
        assertEquals(5, room.getTreasure().size());
    }

    @Test
    public void roomHasEnemy(){
        assertEquals(dragon, room.getEnemy());
    }

    @Test
    public void adventurerWins(){
        room.addTreasure(treasure1); room.addTreasure(treasure2); room.addTreasure(treasure3); room.addTreasure(treasure4);
        room.addTreasure(treasure5);
        assertEquals(5, room.getTreasure().size());
        knight.meleeAttack(room.getEnemy());
        room.rewardAdventurer();
        assertEquals(0, room.getTreasure().size());
    }
}
