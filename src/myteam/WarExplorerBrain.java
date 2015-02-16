package myteam;

import edu.warbot.agents.agents.WarExplorer;
import edu.warbot.brains.WarBrain;
import edu.warbot.brains.adapters.WarExplorerAdapter;

public class WarExplorerBrain extends WarBrain<WarExplorerAdapter> {

	public WarExplorerBrain() {
		super();
	}

	@Override
	public String action() {
        // TODO
		return WarExplorer.ACTION_IDLE;
	}

}
