package com.massisframework.massis.displays;

import com.massisframework.massis.model.building.SimulationObject;

/**
 * Interface that must be implemented by any object that behaves as a display.
 * (e.g 2D/3D)
 *
 * @author rpax
 *
 */
public interface SimulationDisplay {

    /**
     * Notifies to this display that {@code obj} <i>should</i> be updated.
     * Depending on the different implementations of a {@link SimulationDisplay}
     * may have no effect (e.g the object it is not visible at the moment)
     *
     * @param obj
     */
    public void animate(SimulationObject obj);

    /**
     *
     * @return if this display is enabled or not.
     */
    public boolean isDisplayEnabled();
}
