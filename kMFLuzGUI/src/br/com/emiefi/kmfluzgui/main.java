package br.com.emiefi.kmfluzgui;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener{
	public void onEnable() {
		ConsoleCommandSender b = Bukkit.getConsoleSender();
		b.sendMessage("§a[kMFLuzGUI] Plugin ativado com êxito!");
		b.sendMessage("§a[kMFLuzGUI] Criado por yemiefi §fGamersBoard§a!");
	}
	
	public void onDisable() {
		ConsoleCommandSender b = Bukkit.getConsoleSender();
		b.sendMessage("§c[kMFLuzGUI] Plugin desativado com êxito!");
		b.sendMessage("§c[kMFLuzGUI] Criado por yemiefi §fGamersBoard§c!");
	}

}
