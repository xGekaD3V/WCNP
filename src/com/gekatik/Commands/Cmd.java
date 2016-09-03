package com.gekatik.Commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Cmd extends Command
{
  public static String prefix = "";

  public Cmd()
  {
    super("wcnp");
  }

  @Override
  public void execute(CommandSender cs, String[] args)
  {
    if ((cs instanceof ProxiedPlayer))
    {
      ProxiedPlayer p = (ProxiedPlayer)cs;
      if (args.length < 1)
      {
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9-----------------------------------------------"));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aThis server is running WCNP by &2Geka          "));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aVersion: &20.1.8                               "));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f                                               "));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aDownload it here:"));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6https://www.spigotmc.org/resources/24717/"));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9-----------------------------------------------"));
      }
    }
  }
}