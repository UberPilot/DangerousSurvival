package me.evillootly.survival.data;

import org.bukkit.Material;

public class MultistageEntry
{
    /** The material that events should listen for. */
    @SuppressWarnings("WeakerAccess")
    public final Material to;

    /** The material that <code>to</code> should be transformed into. */
    @SuppressWarnings("WeakerAccess")
    public final Material from;

    /**
     * Represents an entry in the multistage list.
     * @param to The material that events should listen for.
     * @param from The material that <code>to</code> should be transformed into.
     */
    @SuppressWarnings("unused")
    public MultistageEntry(Material to, Material from)
    {
        this.to = to;
        this.from = from;
    }
}
