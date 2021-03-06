/**
 *
 */
package com.massisframework.massis.model.building;

import java.util.Map;

import com.massisframework.massis.model.location.SimLocation;
import com.massisframework.massis.model.managers.AnimationManager;
import com.massisframework.massis.model.managers.EnvironmentManager;
import com.massisframework.massis.model.managers.movement.MovementManager;
import com.massisframework.massis.model.managers.pathfinding.PathFindingManager;
import com.massisframework.massis.util.io.JsonState;

/**
 * Represents a Wall.
 *
 * @author rpax
 *
 */
public class SimWall extends SimulationObject {

	public SimWall(Map<String, String> metadata, SimLocation location,
			MovementManager movementManager, AnimationManager animationManager,
			EnvironmentManager environment, PathFindingManager pathManager) {
		super(metadata, location, movementManager, animationManager,
				environment, pathManager);
	}

	@Override
	public JsonState<Building> getState() {
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
