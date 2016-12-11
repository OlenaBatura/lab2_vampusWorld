package jade.vampusWorld.agents;

import jade.core.AID;
import jade.core.Agent;

/**
 * Created by Olena_Batura,
 * Date: 11.12.2016,
 * Time: 18:57.
 */
public class VampusAgent extends Agent {
    public boolean maximumSpectologsReached() {
        return true;
    }

    public boolean isRegisteredSpectologs(AID senderAID) {
        return true;
    }

    public boolean isSpectologsAlive(AID senderAID) {
        return true;
    }

    public void processAction(AID senderAID, String content) {

    }
}
