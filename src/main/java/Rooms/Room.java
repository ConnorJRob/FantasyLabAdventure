package Rooms;

import Characters.EnemyCharacters.Enemy;
import Treasure.Treasure;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Treasure> treasure;
    private Enemy enemy;

    public Room(String name, Enemy enemy) {
        this.name = name;
        this.treasure = new ArrayList<Treasure>();
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
