package myteam;

import edu.warbot.agents.agents.WarExplorer;
import edu.warbot.brains.WarBrain;
import edu.warbot.brains.adapters.WarKamikazeAdapter;

public class WarKamikazeBrain extends WarBrain<WarKamikazeAdapter> {
	
	public WarKamikazeBrain() {
		super();
	}

	@Override
	public String action() {
		return WarExplorer.ACTION_IDLE;
	}
}
