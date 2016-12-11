package jade.vampusWorld.agents;

import jade.vampusWorld.enviroments.CaveNodes;

/**
 * Created by Olena_Batura,
 * Date: 11.12.2016,
 * Time: 19:11.
 */
public interface CaveModelListener {
    void CaveModelChanged(CaveNodes[][] caveMap);
}
