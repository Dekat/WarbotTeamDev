package myteam;

import edu.warbot.agents.agents.WarBase;
import edu.warbot.brains.WarBrain;
import edu.warbot.brains.adapters.WarBaseAdapter;

public class WarBaseBrain extends WarBrain<WarBaseAdapter> {

	public WarBaseBrain() {
		super();
	}
	
	@Override
	public String action() {
        // TODO
		return WarBase.ACTION_IDLE;
	}

}
