package io.github.jython234.ExamplePlugin;

import net.redstonelamp.Server;
import net.redstonelamp.plugin.java.JavaPlugin;
import net.redstonelamp.ui.Logger;

/**
 * An Example Java Plugin for RedstoneLamp.
 *
 * @author jython234
 */
public class ExamplePlugin extends JavaPlugin{

    /*
        This is used internally in RedstoneLamp, it will be removed soon.
     */
    public ExamplePlugin(Server server, Logger logger, String name, String version, String[] authors, String website) {
        super(server, logger, name, version, authors, website);
    }

    /*
        This is where your plugin will be enabled. Register handlers for commands and events here
     */
    @Override
    public void onEnable() {
        getLogger().info("ExamplePlugin enabled!");
    }

    /*
        This is where your plugin will be disabled. Save any files you use here
     */
    @Override
    public void onDisable() {
        getLogger().info("ExamplePlugin disabled!");
    }
}
