package me.evillootly.survival.handlers;

import me.evillootly.survival.DangerousSurvival;

public class MultistageHandler
{
    private transient DangerousSurvival instance;

    public MultistageHandler(DangerousSurvival instance)
    {
        this.instance = instance;
    }
}
