package myteam;

import edu.warbot.agents.agents.WarTurret;
import edu.warbot.brains.WarBrain;
import edu.warbot.brains.adapters.WarTurretAdapter;

public class WarTurretBrain extends WarBrain<WarTurretAdapter> {

    public WarTurretBrain() {
		super();
	}

	@Override
	public String action() {
        // TODO
		return WarTurret.ACTION_IDLE;
	}
}
