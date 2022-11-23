package club.aurorapvp;

import club.aurorapvp.listeners.EventListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoMoreDroppedItems extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    // Plugin startup logic
    getServer().getPluginManager().registerEvents(new EventListener(), this);

  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}