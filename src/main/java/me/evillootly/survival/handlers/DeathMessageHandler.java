package me.evillootly.survival.handlers;

import me.evillootly.survival.DangerousSurvival;

public class DeathMessageHandler
{
    private transient DangerousSurvival instance;

    public DeathMessageHandler(DangerousSurvival instance)
    {
        this.instance = instance;
    }
}
