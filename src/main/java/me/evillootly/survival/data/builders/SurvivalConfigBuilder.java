package me.evillootly.survival.data.builders;

import me.evillootly.survival.data.SurvivalConfig;

import java.util.LinkedList;
import java.util.List;

public final class SurvivalConfigBuilder
{
    private boolean anvilDyeEnabled = false;
    private boolean anvilPotionEnabled = false;
    private boolean artifactsEnabled = false;
    private boolean bloodEnabled = false;
    private boolean bloodDropsEnabled = false;
    private boolean chatEnabled = false;
    private boolean crawlingEnabled = false;
    private boolean cropsEnabled = false;
    private boolean deathMessageEnabled = false;
    private boolean deathNpcEnabled = false;
    private boolean detectionEnabled = false;
    private boolean enhancedMonstersEnabled = false;
    private boolean fallDamageEnabled = false;
    private boolean fireEnabled = false;
    private boolean hatsEnabled = false;
    private boolean headshotsEnabled = false;
    private boolean joinEnabled = false;
    private boolean leavesEnabled = false;
    private boolean leaveEnabled = false;
    private boolean leaveNpcEnabled = false;
    private boolean limboEnabled = false;
    private boolean multistageEnabled = false;
    private boolean realisticUsernamesEnabled = false;
    private boolean nametagEnabled = false;
    private boolean pathsEnabled = false;
    private boolean realisticDropsEnabled = false;
    private boolean thirstEnabled = false;
    private boolean timeEnabled = false;
    private int spawnRadius = 100;
    private int monsterViewDistance = 64;
    private int parkourDivider = 10;
    private boolean worldsBlacklist = false;
    private List<String> worlds = new LinkedList<>();
    private List<String> multistage = new LinkedList<>();

    public SurvivalConfigBuilder() {}

    public SurvivalConfigBuilder anvilDyeEnabled(boolean anvilDyeEnabled)
    {
        this.anvilDyeEnabled = anvilDyeEnabled;
        return this;
    }

    public SurvivalConfigBuilder anvilPotionEnabled(boolean anvilPotionEnabled)
    {
        this.anvilPotionEnabled = anvilPotionEnabled;
        return this;
    }

    public SurvivalConfigBuilder artifactsEnabled(boolean artifactsEnabled)
    {
        this.artifactsEnabled = artifactsEnabled;
        return this;
    }

    public SurvivalConfigBuilder bloodEnabled(boolean bloodEnabled)
    {
        this.bloodEnabled = bloodEnabled;
        return this;
    }

    public SurvivalConfigBuilder bloodDropsEnabled(boolean bloodDropsEnabled)
    {
        this.bloodDropsEnabled = bloodDropsEnabled;
        return this;
    }

    public SurvivalConfigBuilder chatEnabled(boolean chatEnabled)
    {
        this.chatEnabled = chatEnabled;
        return this;
    }

    public SurvivalConfigBuilder crawlingEnabled(boolean crawlingEnabled)
    {
        this.crawlingEnabled = crawlingEnabled;
        return this;
    }

    public SurvivalConfigBuilder cropsEnabled(boolean cropsEnabled)
    {
        this.cropsEnabled = cropsEnabled;
        return this;
    }

    public SurvivalConfigBuilder deathMessageEnabled(boolean deathMessageEnabled)
    {
        this.deathMessageEnabled = deathMessageEnabled;
        return this;
    }

    public SurvivalConfigBuilder deathNpcEnabled(boolean deathNpcEnabled)
    {
        this.deathNpcEnabled = deathNpcEnabled;
        return this;
    }

    public SurvivalConfigBuilder detectionEnabled(boolean detectionEnabled)
    {
        this.detectionEnabled = detectionEnabled;
        return this;
    }

    public SurvivalConfigBuilder enhancedMonstersEnabled(boolean enhancedMonstersEnabled)
    {
        this.enhancedMonstersEnabled = enhancedMonstersEnabled;
        return this;
    }

    public SurvivalConfigBuilder fallDamageEnabled(boolean fallDamageEnabled)
    {
        this.fallDamageEnabled = fallDamageEnabled;
        return this;
    }

    public SurvivalConfigBuilder fireEnabled(boolean fireEnabled)
    {
        this.fireEnabled = fireEnabled;
        return this;
    }

    public SurvivalConfigBuilder hatsEnabled(boolean hatsEnabled)
    {
        this.hatsEnabled = hatsEnabled;
        return this;
    }

    public SurvivalConfigBuilder headshotsEnabled(boolean headshotsEnabled)
    {
        this.headshotsEnabled = headshotsEnabled;
        return this;
    }

    public SurvivalConfigBuilder joinEnabled(boolean joinEnabled)
    {
        this.joinEnabled = joinEnabled;
        return this;
    }

    public SurvivalConfigBuilder leavesEnabled(boolean leavesEnabled)
    {
        this.leavesEnabled = leavesEnabled;
        return this;
    }

    public SurvivalConfigBuilder leaveEnabled(boolean leaveEnabled)
    {
        this.leaveEnabled = leaveEnabled;
        return this;
    }

    public SurvivalConfigBuilder leaveNpcEnabled(boolean leaveNpcEnabled)
    {
        this.leaveNpcEnabled = leaveNpcEnabled;
        return this;
    }

    public SurvivalConfigBuilder limboEnabled(boolean limboEnabled)
    {
        this.limboEnabled = limboEnabled;
        return this;
    }

    public SurvivalConfigBuilder multistageEnabled(boolean multistageEnabled)
    {
        this.multistageEnabled = multistageEnabled;
        return this;
    }

    public SurvivalConfigBuilder nametagEnabled(boolean nametagEnabled)
    {
        this.nametagEnabled = nametagEnabled;
        return this;
    }

    public SurvivalConfigBuilder pathsEnabled(boolean pathsEnabled)
    {
        this.pathsEnabled = pathsEnabled;
        return this;
    }

    public SurvivalConfigBuilder realisticDropsEnabled(boolean realisticDropsEnabled)
    {
        this.realisticDropsEnabled = realisticDropsEnabled;
        return this;
    }

    public SurvivalConfigBuilder realisticUsernamesEnabled(boolean realisticUsernamesEnabled)
    {
        this.realisticUsernamesEnabled = realisticUsernamesEnabled;
        return this;
    }

    public SurvivalConfigBuilder thirstEnabled(boolean thirstEnabled)
    {
        this.thirstEnabled = thirstEnabled;
        return this;
    }

    public SurvivalConfigBuilder timeEnabled(boolean timeEnabled)
    {
        this.timeEnabled = timeEnabled;
        return this;
    }

    public SurvivalConfigBuilder spawnRadius(int spawnRadius)
    {
        this.spawnRadius = spawnRadius;
        return this;
    }

    public SurvivalConfigBuilder monsterViewDistance(int monsterViewDistance)
    {
        this.monsterViewDistance = monsterViewDistance;
        return this;
    }

    public SurvivalConfigBuilder parkourDivider(int parkourDivider)
    {
        this.parkourDivider = parkourDivider;
        return this;
    }

    public SurvivalConfigBuilder worldsBlacklist(boolean worldsBlacklist)
    {
        this.worldsBlacklist = worldsBlacklist;
        return this;
    }

    public SurvivalConfigBuilder worlds(List<String> worlds)
    {
        this.worlds = worlds;
        return this;
    }

    public SurvivalConfigBuilder multistage(List<String> multistage)
    {
        this.multistage = multistage;
        return this;
    }

    public SurvivalConfig build() { return new SurvivalConfig(anvilDyeEnabled, anvilPotionEnabled, artifactsEnabled, bloodEnabled, bloodDropsEnabled, chatEnabled, crawlingEnabled, cropsEnabled, deathMessageEnabled, deathNpcEnabled, detectionEnabled, enhancedMonstersEnabled, fallDamageEnabled, fireEnabled, hatsEnabled, headshotsEnabled, joinEnabled, leavesEnabled, leaveEnabled, leaveNpcEnabled, limboEnabled, multistageEnabled, realisticUsernamesEnabled, nametagEnabled, pathsEnabled, realisticDropsEnabled, thirstEnabled, timeEnabled, spawnRadius, monsterViewDistance, parkourDivider, worldsBlacklist, worlds, multistage); }
}
