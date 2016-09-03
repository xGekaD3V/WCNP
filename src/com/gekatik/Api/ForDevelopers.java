package com.gekatik.api;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class ForDevelopers extends Command
{
  public static String prefix = "";

  public ForDevelopers()
  {
    super("wcnpapifordevelopers");
  }

  public void execute(CommandSender cs, String[] args)
  {
    if ((cs instanceof ProxiedPlayer))
    {
      ProxiedPlayer p = (ProxiedPlayer)cs;
      if (args.length < 1)
      {
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8-=[ &a&l+ &8]=- &8[ &dWCNP &8] -= [ &a&l+ &8]=-"));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "         This feature will                       "));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "         be available soon!                      "));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8-=[ &a&l+ &8]=- &8[ &dWCNP &8] -= [ &a&l+ &8]=-"));
      }
    }
  }
}