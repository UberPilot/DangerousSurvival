package me.evillootly.survival;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class shopGUIS {
	
	public HashMap<String, List<Integer>> unlocks = new HashMap<String, List<Integer>>();
	public HashMap<String, List<Integer>> enabled = new HashMap<String, List<Integer>>();
	
	public shopGUIS() {
		
	}
	
	public ItemStack makeItem(String type, String title, List<String> lore, boolean enchanted) {
		ItemStack item = new ItemStack(Material.valueOf(type));
		ItemMeta itemmeta = item.getItemMeta();
		if(!title.equals("none")) {
		itemmeta.setDisplayName(title);
		}
		if(lore != null) {
			itemmeta.setLore(lore);
		}
		item.setItemMeta(itemmeta);
		if(enchanted == true) {
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 200);
			ItemMeta itemmeta2 = item.getItemMeta();
			itemmeta2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item.setItemMeta(itemmeta2);
		}
		return item;
	}
	
}
