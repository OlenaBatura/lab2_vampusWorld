package jade.vampusWorld.agents;

import jade.core.Agent;

import java.util.List;

/**
 * Created by Olena_Batura,
 * Date: 11.12.2016,
 * Time: 19:11.
 */
public interface NavigatorListener {
    void navigatorListModelChanged(List<? super Agent> hunters);
}
