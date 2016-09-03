package com.gekatik;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class Event
  implements Listener
{
  Main plugin;

  public Event(Main Nethad)
  {
    this.plugin = Nethad;
    this.plugin.getProxy().getPluginManager().registerListener(this.plugin, this);
  }

  @EventHandler
  public void playercmd(ChatEvent event) {
    if ((event.getSender() instanceof ProxiedPlayer)) {
      ProxiedPlayer player = (ProxiedPlayer)event.getSender();
      if (!event.getMessage().startsWith("/")) {
        return;
      }
      String[] command = event.getMessage().toLowerCase().split(" ", 2);
      if ((player.hasPermission("wcnp.bypass." + command[0].substring(1))) || (player.hasPermission("wcnp.bypass"))) {
        return;
      }
      if (Main.config.getStringList("BlockedCommands").contains(command[0].substring(1))) {
        player.sendMessage(ChatColor.YELLOW + "");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.config.getString("Face1").replaceAll("#", "█")));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.config.getString("Face2").replaceAll("#", "█")));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.config.getString("Face3").replaceAll("#", "█") + ChatColor.translateAlternateColorCodes('&', Main.config.getString("Line1").replaceAll("%p", "█"))));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.config.getString("Face4").replaceAll("#", "█")));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.config.getString("Face5").replaceAll("#", "█") + ChatColor.translateAlternateColorCodes('&', Main.config.getString("Line2").replaceAll("%p", "█"))));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.config.getString("Face6").replaceAll("#", "█")));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.config.getString("Face7").replaceAll("#", "█")));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.config.getString("Face8").replaceAll("#", "█")));
        player.sendMessage(ChatColor.YELLOW + "");
        event.setCancelled(true);
      }
    }
  }
}