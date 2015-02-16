package myteam;

import edu.warbot.agents.agents.WarEngineer;
import edu.warbot.brains.WarBrain;
import edu.warbot.brains.adapters.WarEngineerAdapter;

public class WarEngineerBrain extends WarBrain<WarEngineerAdapter> {

    public WarEngineerBrain() {
		super();
	}

	@Override
	public String action() {
		// TODO
		return WarEngineer.ACTION_IDLE;
	}
}
