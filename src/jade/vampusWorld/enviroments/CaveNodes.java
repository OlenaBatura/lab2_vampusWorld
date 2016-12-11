package jade.vampusWorld.enviroments;

import jade.vampusWorld.agents.SpectologAgent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olena_Batura,
 * Date: 11.12.2016,
 * Time: 20:21.
 */
public class CaveNodes {
    int xCoord;
    int yCoord;
    boolean pit;
    boolean vampus;
    boolean isVampusAlive;
    boolean gold;
    List<SpectologAgent> hunters;

    public CaveNodes(int xCoord, int yCoord) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.pit = false;
        this.vampus = false;
        this.isVampusAlive = false;
        this.gold = false;
        this.hunters  = new ArrayList<SpectologAgent>();
    }

    public boolean hasPit() {
        return pit;
    }

    public boolean hasWumpus() {
        return vampus;
    }

    public boolean hasGold() {
        return gold;
    }

    public boolean hasNoPit() {
        return !pit;
    }

    public boolean hasNoVampus() {
        return !vampus;
    }

    public boolean hasNoGold() {
        return !gold;
    }

    public boolean isEmpty() {
        if (hasNoGold() && hasNoVampus() && hasNoPit())
            return true;

        return false;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setPit(boolean pit) {
        this.pit = pit;
    }

    public boolean isVampusAlive() {

        return this.isVampusAlive;
    }

    public void setVampus(boolean vampus) {
        this.vampus = vampus;
        this.isVampusAlive = true;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public boolean hasHunter() {
        if (hunters.size() > 0)
            return true;

        return false;
    }

    public void setVampusAlive(boolean state) {

        this.isVampusAlive = state;
    }
}
