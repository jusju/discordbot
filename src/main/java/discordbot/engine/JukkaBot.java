package discordbot.engine;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

// DISCORD BOT TOKEN MTE2MTE2Mjk4ODgxNjk2MTYzOQ.G0XoGF.dYl_hBqCxPAXgUz5xU3Kzwaqru6x02G7gLdMtc

public class JukkaBot {
	protected static JukkaBot selfBot;
	private ShardManager shardManager = null;

	public JukkaBot(String token) {
		try {
			shardManager = buildShardManager(token);
		} catch (LoginException e) {
			System.out.println("Failed to start bot! Please check the console for any errors.");
			System.exit(0);
		}
	}

	// The JDA Shardmanager instance, this is the brains of the entire bot. Without
	// this, the bot doesn't boot.
	private ShardManager buildShardManager(String token) throws LoginException {
	    DefaultShardManagerBuilder builder =
	            DefaultShardManagerBuilder.createDefault(token)
	                    .addEventListeners(new DiscordEventListener(this));

	    return builder.build();
	}

	public ShardManager getJDA() {
		return shardManager;
	}
}
