package me.evillootly.survival.data;

import me.evillootly.survival.data.builders.SurvivalConfigBuilder;
import org.bukkit.configuration.serialization.ConfigurationSerializable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SurvivalConfig implements ConfigurationSerializable, Cloneable
{
    private boolean anvilDyeEnabled;
    private boolean anvilPotionEnabled;
    private boolean artifactsEnabled;
    private boolean bloodEnabled;
    private boolean bloodDropsEnabled;
    private boolean chatEnabled;
    private boolean crawlingEnabled;
    private boolean cropsEnabled;
    private boolean deathMessageEnabled;
    private boolean deathNpcEnabled;
    private boolean detectionEnabled;
    private boolean enhancedMonstersEnabled;
    private boolean fallDamageEnabled;
    private boolean fireEnabled;
    private boolean hatsEnabled;
    private boolean headshotsEnabled;
    private boolean joinEnabled;
    private boolean leavesEnabled;
    private boolean leaveEnabled;
    private boolean leaveNpcEnabled;
    private boolean limboEnabled;
    private boolean multistageEnabled;
    private boolean realisticUsernamesEnabled;
    private boolean nametagEnabled;
    private boolean pathsEnabled;
    private boolean realisticDropsEnabled;
    private boolean thirstEnabled;
    private boolean timeEnabled;
    private int spawnRadius;
    private int monsterViewDistance;
    private int parkourDivider;
    private boolean worldsBlacklist;
    private List<String> worlds;
    private List<String> multistage;

    public SurvivalConfig(boolean anvilDyeEnabled, boolean anvilPotionEnabled, boolean artifactsEnabled,
                          boolean bloodEnabled, boolean bloodDropsEnabled, boolean chatEnabled,
                          boolean crawlingEnabled, boolean cropsEnabled, boolean deathMessageEnabled,
                          boolean deathNpcEnabled, boolean detectionEnabled, boolean enhancedMonstersEnabled,
                          boolean fallDamageEnabled, boolean fireEnabled, boolean hatsEnabled,
                          boolean headshotsEnabled, boolean joinEnabled, boolean leavesEnabled, boolean leaveEnabled,
                          boolean leaveNpcEnabled, boolean limboEnabled, boolean multistageEnabled,
                          boolean realisticUsernamesEnabled, boolean nametagEnabled, boolean pathsEnabled,
                          boolean realisticDropsEnabled, boolean thirstEnabled, boolean timeEnabled, int spawnRadius,
                          int monsterViewDistance, int parkourDivider, boolean worldsBlacklist, List<String> worlds,
                          List<String> multistage)
    {
        this.anvilDyeEnabled = anvilDyeEnabled;
        this.anvilPotionEnabled = anvilPotionEnabled;
        this.artifactsEnabled = artifactsEnabled;
        this.bloodEnabled = bloodEnabled;
        this.bloodDropsEnabled = bloodDropsEnabled;
        this.chatEnabled = chatEnabled;
        this.crawlingEnabled = crawlingEnabled;
        this.cropsEnabled = cropsEnabled;
        this.deathMessageEnabled = deathMessageEnabled;
        this.deathNpcEnabled = deathNpcEnabled;
        this.detectionEnabled = detectionEnabled;
        this.enhancedMonstersEnabled = enhancedMonstersEnabled;
        this.fallDamageEnabled = fallDamageEnabled;
        this.fireEnabled = fireEnabled;
        this.hatsEnabled = hatsEnabled;
        this.headshotsEnabled = headshotsEnabled;
        this.joinEnabled = joinEnabled;
        this.leavesEnabled = leavesEnabled;
        this.leaveEnabled = leaveEnabled;
        this.leaveNpcEnabled = leaveNpcEnabled;
        this.limboEnabled = limboEnabled;
        this.multistageEnabled = multistageEnabled;
        this.nametagEnabled = nametagEnabled;
        this.pathsEnabled = pathsEnabled;
        this.realisticDropsEnabled = realisticDropsEnabled;
        this.realisticUsernamesEnabled = realisticUsernamesEnabled;
        this.thirstEnabled = thirstEnabled;
        this.timeEnabled = timeEnabled;
        this.spawnRadius = spawnRadius;
        this.monsterViewDistance = monsterViewDistance;
        this.parkourDivider = parkourDivider;
        this.worldsBlacklist = worldsBlacklist;
        this.worlds = worlds;
        this.multistage = multistage;
    }

    @SuppressWarnings("unused")
    public static SurvivalConfig deserialize(Map<String, Object> map)
    {
        SurvivalConfigBuilder builder = new SurvivalConfigBuilder();
        if (map.containsKey("enable-anvil-dye")
                && map.get("enable-anvil-dye") != null
                && map.get("enable-anvil-dye") instanceof Boolean)
        {
            builder.anvilDyeEnabled((boolean) map.get("enable-anvil-dye"));
        }

        if (map.containsKey("enable-anvil-potions")
                && map.get("enable-anvil-potions") != null
                && map.get("enable-anvil-potions") instanceof Boolean)
        {
            builder.anvilPotionEnabled((boolean) map.get("enable-anvil-potions"));
        }

        if (map.containsKey("enable-artifacts")
                && map.get("enable-artifacts") != null
                && map.get("enable-artifacts") instanceof Boolean)
        {
            builder.artifactsEnabled((boolean) map.get("enable-artifacts"));
        }

        if (map.containsKey("enable-blood")
                && map.get("enable-blood") != null
                && map.get("enable-blood") instanceof Boolean)
        {
            builder.bloodEnabled((boolean) map.get("enable-blood"));
        }

        if (map.containsKey("enable-blood-drops")
                && map.get("enable-blood-drops") != null
                && map.get("enable-blood-drops") instanceof Boolean)
        {
            builder.bloodDropsEnabled((boolean) map.get("enable-blood-drops"));
        }

        if (map.containsKey("enable-chat")
                && map.get("enable-chat") != null
                && map.get("enable-chat") instanceof Boolean)
        {
            builder.chatEnabled((boolean) map.get("enable-chat"));
        }

        if (map.containsKey("enable-crawling")
                && map.get("enable-crawling") != null
                && map.get("enable-crawling") instanceof Boolean)
        {
            builder.crawlingEnabled((boolean) map.get("enable-crawling"));
        }

        if (map.containsKey("enable-crops")
                && map.get("enable-crops") != null
                && map.get("enable-crops") instanceof Boolean)
        {
            builder.cropsEnabled((boolean) map.get("enable-crops"));
        }

        if (map.containsKey("enable-death-npcs")
                && map.get("enable-death-npcs") != null
                && map.get("enable-death-npcs") instanceof Boolean)
        {
            builder.deathNpcEnabled((boolean) map.get("enable-death-npcs"));
        }

        if (map.containsKey("enable-death-message-hide")
                && map.get("enable-death-message-hide") != null
                && map.get("enable-death-message-hide") instanceof Boolean)
        {
            builder.deathMessageEnabled((boolean) map.get("enable-death-message-hide"));
        }

        if (map.containsKey("enable-enhanced-monsters")
                && map.get("enable-enhanced-monsters") != null
                && map.get("enable-enhanced-monsters") instanceof Boolean)
        {
            builder.enhancedMonstersEnabled((boolean) map.get("enable-enhanced-monsters"));
        }

        if (map.containsKey("enable-hats")
                && map.get("enable-hats") != null
                && map.get("enable-hats") instanceof Boolean)
        {
            builder.hatsEnabled((boolean) map.get("enable-hats"));
        }

        if (map.containsKey("enable-fall")
                && map.get("enable-fall") != null
                && map.get("enable-fall") instanceof Boolean)
        {
            builder.fallDamageEnabled((boolean) map.get("enable-fall"));
        }

        if (map.containsKey("enable-fire")
                && map.get("enable-fire") != null
                && map.get("enable-fire") instanceof Boolean)
        {
            builder.fireEnabled((boolean) map.get("enable-fire"));
        }

        if (map.containsKey("enable-headshots")
                && map.get("enable-headshots") != null
                && map.get("enable-headshots") instanceof Boolean)
        {
            builder.headshotsEnabled((boolean) map.get("enable-headshots"));
        }

        if (map.containsKey("enable-join-hide")
                && map.get("enable-join-hide") != null
                && map.get("enable-join-hide") instanceof Boolean)
        {
            builder.joinEnabled((boolean) map.get("enable-join-hide"));
        }

        if (map.containsKey("enable-leaf-drops")
                && map.get("enable-leaf-drops") != null
                && map.get("enable-leaf-drops") instanceof Boolean)
        {
            builder.leavesEnabled((boolean) map.get("enable-leaf-drops"));
        }

        if (map.containsKey("enable-leave-hide")
                && map.get("enable-leave-hide") != null
                && map.get("enable-leave-hide") instanceof Boolean)
        {
            builder.leaveEnabled((boolean) map.get("enable-leave-hide"));
        }

        if (map.containsKey("enable-leave-npcs")
                && map.get("enable-leave-npcs") != null
                && map.get("enable-leave-npcs") instanceof Boolean)
        {
            builder.leaveNpcEnabled((boolean) map.get("enable-leave-npcs"));
        }

        if (map.containsKey("enable-limbo")
                && map.get("enable-limbo") != null
                && map.get("enable-limbo") instanceof Boolean)
        {
            builder.limboEnabled((boolean) map.get("enable-limbo"));
        }

        if (map.containsKey("enable-multistage")
                && map.get("enable-multistage") != null
                && map.get("enable-multistage") instanceof Boolean)
        {
            builder.multistageEnabled((boolean) map.get("enable-multistage"));
        }

        if (map.containsKey("enable-nametag-hide")
                && map.get("enable-nametag-hide") != null
                && map.get("enable-nametag-hide") instanceof Boolean)
        {
            builder.nametagEnabled((boolean) map.get("enable-nametag-hide"));
        }

        if (map.containsKey("enable-paths")
                && map.get("enable-paths") != null
                && map.get("enable-paths") instanceof Boolean)
        {
            builder.pathsEnabled((boolean) map.get("enable-paths"));
        }

        if (map.containsKey("enable-realistic-drops")
                && map.get("enable-realistic-drops") != null
                && map.get("enable-realistic-drops") instanceof Boolean)
        {
            builder.realisticDropsEnabled((boolean) map.get("enable-realistic-drops"));
        }

        if (map.containsKey("enable-realistic-usernames")
                && map.get("enable-realistic-usernames") != null
                && map.get("enable-realistic-usernames") instanceof Boolean)
        {
            builder.realisticUsernamesEnabled((boolean) map.get("enable-realistic-usernames"));
        }

        if (map.containsKey("enable-thirst")
                && map.get("enable-thirst") != null
                && map.get("enable-thirst") instanceof Boolean)
        {
            builder.thirstEnabled((boolean) map.get("enable-thirst"));
        }

        if (map.containsKey("enable-time-scale")
                && map.get("enable-time-scale") != null
                && map.get("enable-time-scale") instanceof Boolean)
        {
            builder.timeEnabled((boolean) map.get("enable-time-scale"));
        }

        if (map.containsKey("monster-view-distance")
                && map.get("monster-view-distance") != null
                && map.get("monster-view-distance") instanceof Integer)
        {
            builder.monsterViewDistance((int) map.get("monster-view-distance"));
        }

        if (map.containsKey("multistage")
                && map.get("multistage") != null
                && map.get("multistage") instanceof List)
        {
            //noinspection unchecked
            builder.multistage((List) map.get("multistage"));
        }

        if (map.containsKey("parkour-divider") 
                && map.get("parkour-divider") != null
                && map.get("parkour-divider") instanceof Integer)
        {
            builder.parkourDivider((int) map.get("parkour-divider"));
        }
        
        if(map.containsKey("spawn-radius")
                && map.get("spawn-radius") != null
                && map.get("spawn-radius") instanceof Integer)
        {
            builder.spawnRadius((int) map.get("spawn-radius"));
        }

        if (map.containsKey("world-blacklist")
                && map.get("world-blacklist") != null
                && map.get("world-blacklist") instanceof Boolean)
        {
            builder.worldsBlacklist((boolean) map.get("world-blacklist"));
        }

        if (map.containsKey("worlds")
                && map.get("worlds") != null
                && map.get("worlds") instanceof List)
        {
            //noinspection unchecked
            builder.worlds((List) map.get("worlds"));
        }
        
        return builder.build();
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public Map<String, Object> serialize()
    {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("enable-anvil-dye", anvilDyeEnabled);
        map.put("enable-anvil-potions", anvilPotionEnabled);
        map.put("enable-artifacts", artifactsEnabled);
        map.put("enable-blood", bloodEnabled);
        map.put("enable-blood-drops", bloodDropsEnabled);
        map.put("enable-chat", chatEnabled);
        map.put("enable-crawling", crawlingEnabled);
        map.put("enable-crops", cropsEnabled);
        map.put("enable-death-npcs", deathNpcEnabled);
        map.put("enable-death-message-hide", deathMessageEnabled);
        map.put("enable-detection", detectionEnabled);
        map.put("enable-enhanced-monsters", enhancedMonstersEnabled);
        map.put("enable-hats", hatsEnabled);
        map.put("enable-fall", fallDamageEnabled);
        map.put("enable-fire", fireEnabled);
        map.put("enable-headshots", headshotsEnabled);
        map.put("enable-join-hide", joinEnabled);
        map.put("enable-leaf-drops", leavesEnabled);
        map.put("enable-leave-hide", leaveEnabled);
        map.put("enable-leave-npcs", leaveNpcEnabled);
        map.put("enable-limbo", limboEnabled);
        map.put("enable-multistage", multistageEnabled);
        map.put("enable-nametag-hide", nametagEnabled);
        map.put("enable-paths", pathsEnabled);
        map.put("enable-realistic-drops", realisticDropsEnabled);
        map.put("enable-realistic-usernames", realisticUsernamesEnabled);
        map.put("enable-thirst", thirstEnabled);
        map.put("enable-time-scale", timeEnabled);
        map.put("monster-view-distance", monsterViewDistance);
        map.put("multistage", multistage);
        map.put("parkour-divider", parkourDivider);
        map.put("spawn-radius", spawnRadius);
        map.put("world-blacklist", worldsBlacklist);
        map.put("worlds", worlds);
        return map;
    }
}
