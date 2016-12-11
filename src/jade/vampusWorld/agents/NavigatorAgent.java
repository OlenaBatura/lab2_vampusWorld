package jade.vampusWorld.agents;

import jade.core.Agent;

import java.util.List;

/**
 * Created by Olena_Batura,
 * Date: 11.12.2016,
 * Time: 1:52.
 */
public class NavigatorAgent extends Agent implements NavigatorListener {

    @Override
    public void navigatorListModelChanged(List<? super Agent> navigatorAgents) {
           updateNavigatorAgentList(navigatorAgents);
    }

    private void updateNavigatorAgentList(List<? super Agent> navigatorAgents) {

    }

}
