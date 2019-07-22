package me.evillootly.survival;

import me.evillootly.survival.data.PlayerData;
import me.evillootly.survival.data.SurvivalConfig;
import me.evillootly.survival.handlers.*;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DangerousSurvival extends JavaPlugin
{
    //
    // Configuration
    //

    /**
     * The configuration for the plugin.
     */
    private SurvivalConfig config;

    //
    // Handlers
    //

    /** Handles dying in anvils.<br/><br/>
     *
     *  Enabled with <code>enable-anvil-dye</code>
     */
    private AnvilDyeHandler anvilDyeHandler;

    /** Handles potion effects in anvils.<br/><br/>
     *
     *  Enabled with <code>enable-anvil-potion</code>
     */
    private AnvilPotionHandler anvilPotionHandler;

    /** Handles artifacts.<br/><br/>
     *
     *  Enabled with <code>enable-artifacts</code>
     */
    private ArtifactHandler artifactHandler;

    /** Handles blood particles.<br/><br/>
     *
     *  Enabled with <code>enable-blood</code>
     */
    private BloodHandler bloodHandler;

    /** Handles blood drops.<br/><br/>
     *
     *  Enabled with <code>enable-blood-drops</code>
     */
    private BloodDropHandler bloodDropHandler;

    /** Handles ranged chat.<br/><br/>
     *
     *  Enabled with <code>enable-chat</code>
     */
    private ChatHandler chatHandler;

    /** Handles crawling.<br/><br/>
     *
     *  Enabled with <code>enable-crawl</code>
     */
    private CrawlingHandler crawlingHandler;

    /** Handles crop growth and drops.<br/><br/>
     *
     *  Enabled with <code>enable-crops</code>
     */
    private CropHandler cropHandler;

    /** Handles spawning NPCs on death.<br/><br/>
     *
     * Enabled with <code>enable-death-npcs</code>
     */
    private DeathNPCHandler deathNpcHandler;

    /** Handles hiding death messages.<br/><br/>
     *
     * Enabled with <code>enable-death-message-hide</code>
     */
    private DeathMessageHandler deathMessageHandler;

    /** Handles mob detection ranges.<br/><br/>
     *
     * Enabled with <code>enable-detection</code>
     */
    private DetectionHandler detectionHandler;

    /** Handles stronger monsters.<br/><br/>
     *
     * Enabled with <code>enable-enhanced-monsters</code>
     */
    private EnhancedMonsterHandler enhancedMonsterHandler;

    /** Handles custom fall damage.<br/><br/>
     *
     * Enabled with <code>enable-fall</code>
     */
    private FallDamageHandler fallDamageHandler;

    /** Handles stronger monsters.<br/><br/>
     *
     * Enabled with <code>enable-fire</code>
     */
    private FireHandler fireHandler;

    /** Handles hats.<br/><br/>
     *
     *  Enabled with <code>enable-hats</code>
     */
    private HatHandler hatHandler;

    /** Handles headshots.<br/><br/>
     *
     *  Enabled with <code>enable-headshots</code>
     */
    private HeadshotHandler headshotHandler;

    /** Handles hiding join messages.<br/><br/>
     *
     *  Enabled with <code>enable-join-hide</code>
     */
    private JoinHandler joinHandler;

    /** Handles custom leaf drops.<br/><br/>
     *
     *  Enabled with <code>enable-leaf-drops</code>
     */
    private LeafHandler leafHandler;

    /** Handles hiding leave messages.<br/><br/>
     *
     *  Enabled with <code>enable-leave-hide</code>
     */
    private LeaveHandler leaveHandler;

    /** Handles spawning NPCs on player leave.<br/><br/>
     *
     *  Enabled with <code>enable-leave-npcs</code>
     */
    private LeaveNPCHandler leaveNpcHandler;

    /** Handles limbo.<br/><br/>
     *
     *  Enabled with <code>enable-limbo</code>
     */
    private LimboHandler limboHandler;

    /** Handles blocks with multiple breaking stages.<br/><br/>
     *
     * Enabled with <code>enable-multistage</code>
     */
    private MultistageHandler multistageHandler;

    /** Handles hiding and showing nametags.<br/><br/>
     *
     * Enabled with <code>enable-nametag-hide</code>
     */
    private NametagHandler nametagHandler;

    /** Handles desire paths.<br/><br/>
     *
     * Enabled with <code>enable-paths</code>
     */
    private PathHandler pathHandler;

    /** Handles realistic usernames.<br/><br/>
     *
     * Enabled with <code>enable-realistic-usernames</code>
     */
    private RealisticUsernameHandler realisticUsernameHandler;

    /** Handles realistic usernames.<br/><br/>
     *
     * Enabled with <code>enable-realistic-drops</code>
     */
    private RealisticDropHandler realisticDropHandler;

    /** Handles extended time scale.<br/><br/>
     *
     * Enabled with <code>enable-thirst</code>
     */
    private ThirstHandler thirstHandler;

    /** Handles extended time scale.<br/><br/>
     *
     * Enabled with <code>enable-time-scale</code>
     */
    private TimeHandler timeHandler;

    private Map<UUID, PlayerData> playerData;

    /**
     * The plugin main class. Does some initialization, also see {@link #onEnable()} for the rest of the initialization
     * and loading.
     */
    public DangerousSurvival()
    {
        this.playerData = new HashMap<>();
    }

    @Override
    public void onEnable()
    {
        super.onEnable();

        this.config = this.loadConfig();

        this.initHandlers();
    }

    /**
     * Loads the config, creating it if needed.
     *
     * @return A representation of the configuration.
     * TODO: Move to an IO class to reduce mainfile clutter.
     */
    private SurvivalConfig loadConfig()
    {
        if(!getDataFolder().exists())
        {
            getDataFolder().mkdirs();
        }
        File configFile = new File(getDataFolder(), "config.yml");
        if(!configFile.exists())
        {
            this.saveResource("config.yml", false);
        }
        YamlConfiguration config = YamlConfiguration.loadConfiguration(configFile);
        return (SurvivalConfig) config.get("config");
    }

    /**
     * Loads a list of first names from the configuration, creating it if needed.
     *
     * @return The loaded list of names.
     * TODO: Move to an IO class.
     */
    private List<String> loadFirstnames()
    {
        File firstnamesFile = new File(getDataFolder(), "firstnames.yml");
        if(!firstnamesFile.exists())
        {
            this.saveResource("firstnames.yml", false);
        }
        YamlConfiguration firstnames = YamlConfiguration.loadConfiguration(firstnamesFile);
        return firstnames.getStringList("names");
    }

    /**
     * Loads a list of last names from the configuration, creating it if needed.
     *
     * @return The loaded list of names.
     * TODO: Move to an IO class.
     */
    private List<String> loadLastnames()
    {
        File lastnamesFile = new File(getDataFolder(), " lastnames.yml");
        if(!lastnamesFile.exists())
        {
            this.saveResource("lastnames.yml", false);
        }
        YamlConfiguration lastnames = YamlConfiguration.loadConfiguration(lastnamesFile);
        return lastnames.getStringList("names");
    }

    /**
     * Initializes all of the handlers using dependency injection.
     */
    private void initHandlers()
    {
        anvilDyeHandler = new AnvilDyeHandler(this);
        anvilPotionHandler = new AnvilPotionHandler(this);
        artifactHandler = new ArtifactHandler(this);
        bloodDropHandler = new BloodDropHandler(this);
        bloodHandler = new BloodHandler(this);
        chatHandler = new ChatHandler(this);
        crawlingHandler = new CrawlingHandler(this);
        cropHandler = new CropHandler(this);
        deathNpcHandler = new DeathNPCHandler(this);
        deathMessageHandler = new DeathMessageHandler(this);
        detectionHandler = new DetectionHandler(this);
        enhancedMonsterHandler = new EnhancedMonsterHandler(this);
        fallDamageHandler = new FallDamageHandler(this);
        fireHandler = new FireHandler(this);
        hatHandler = new HatHandler(this);
        headshotHandler = new HeadshotHandler(this);
        joinHandler = new JoinHandler(this);
        leafHandler = new LeafHandler(this);
        leaveHandler = new LeaveHandler(this);
        leaveNpcHandler = new LeaveNPCHandler(this);
        limboHandler = new LimboHandler(this);
        multistageHandler = new MultistageHandler(this);
        nametagHandler = new NametagHandler(this);
        pathHandler = new PathHandler(this);
        realisticDropHandler = new RealisticDropHandler(this);
        realisticUsernameHandler = new RealisticUsernameHandler(this, loadFirstnames(), loadLastnames());
        thirstHandler = new ThirstHandler(this);
        timeHandler = new TimeHandler(this);
    }
}
