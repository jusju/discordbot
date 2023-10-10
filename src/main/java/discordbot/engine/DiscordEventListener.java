package discordbot.engine;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import discordbot.engine.JukkaBot;

public class DiscordEventListener extends ListenerAdapter {
    public JukkaBot bot;
    public DiscordEventListener(JukkaBot bot) {
        this.bot = bot;
    }
}