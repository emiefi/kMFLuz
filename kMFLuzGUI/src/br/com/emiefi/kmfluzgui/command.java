package br.com.emiefi.kmfluzgui;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lbl, String[] args) {
		if(cmd.getName().equalsIgnoreCase("luz")) {
			if(!s.hasPermission("kmfluzgui.usar")) {
				s.sendMessage("§2* §cVocê não possui permissão para usar este comando!");
			}
			
			Player p = (Player) s;
			if(!(p instanceof Player)) {
				s.sendMessage("Você deve estar in-game para executar este comando!");
			}

			if(p.hasPotionEffect(PotionEffectType.NIGHT_VISION)){
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				p.sendMessage("§2* §aLuz apagada com êxito.");
			}else {
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 50), true);
				p.sendMessage("§2* §aLuz ligada com êxito!");
			}
		}
		return false;
	}

}
