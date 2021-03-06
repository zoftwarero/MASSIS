/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.massisframework.massis.ai.sposh.actions;

import java.util.HashMap;
import java.util.Map;

import com.massisframework.massis.ai.sposh.SPOSHLogicProperty;
import com.massisframework.massis.ai.sposh.SimulationContext;
import com.massisframework.massis.model.agents.LowLevelAgent;

import cz.cuni.amis.pogamut.sposh.executor.ActionResult;
import cz.cuni.amis.pogamut.sposh.executor.Param;
import cz.cuni.amis.pogamut.sposh.executor.PrimitiveInfo;

/**
 * Sends a message to every agent in the vision area
 *
 * @author rpax
 */
@PrimitiveInfo(name = "Communicate By Voice", description = "Sends a message in an area")
public class CommunicateByVoice extends SimulationAction {

    public CommunicateByVoice(SimulationContext ctx)
    {
        super(ctx);
    }

    @Override
    public void init()
    {
    }

    @Override
    public void done()
    {
    }

    @SuppressWarnings("unchecked")
    public ActionResult run(@Param("$message") String message)
    {

        for (LowLevelAgent agent : this.ctx.getBot().getAgentsInVisionRadio())
        {
            Object highLevelData = agent.getHighLevelData();
            final String messagesKey = SPOSHLogicProperty.MESSAGES.toString();
            if (highLevelData instanceof SimulationContext)
            {
                SimulationContext otherAgentCtx = (SimulationContext) highLevelData;

                HashMap<String, Object> agentMentalState = otherAgentCtx.getMentalState();
                if (!agentMentalState.containsKey(messagesKey))
                {
                    agentMentalState.put(messagesKey,
                            new HashMap<String, SimulationContext>());
                }
                ((Map<String, SimulationContext>) agentMentalState.get(
                        messagesKey)).put(message, this.ctx);
            }
        }
        return ActionResult.FINISHED;
    }
}
