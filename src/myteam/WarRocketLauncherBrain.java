package myteam;

import edu.warbot.agents.agents.WarRocketLauncher;
import edu.warbot.brains.WarBrain;
import edu.warbot.brains.adapters.WarRocketLauncherAdapter;

public class WarRocketLauncherBrain extends WarBrain<WarRocketLauncherAdapter> {

	public WarRocketLauncherBrain() {
		super();
	}
	
	@Override
	public String action() {
        // TODO
		return WarRocketLauncher.ACTION_IDLE;
	}
	
}