
package discordbot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;


/**
 * JDA-5.0.0 Discord Bot Tutorial Series.
 * This is the main class where we initialize our bot.
 *
 * @author TechnoVision <a href="https://www.youtube.com/TechnoVisionTV">...</a>
 */
public class TutorialBot {

   public static JDA jda;

    /**
     * Loads environment variables and builds the bot shard manager.
     * @throws LoginException occurs when bot token is invalid.
     */ 
   	public TutorialBot() throws LoginException {
        String token = "MTAxMjkzMjAyNDI4MzE3NzA0MA.Gvl6PP.ZLA5X4XWhG-qpr4mVuB0tvWAy6I7lPN9tl42Qs";
       jda = JDABuilder.createDefault(token).build();
       jda.getPresence().setStatus(OnlineStatus.IDLE);
       jda.getPresence().setActivity(Activity.watching("watching abc"));
      
    }

    /**
     * Retrieves the bot shard manager.
     * @return the ShardManager instance for the bot.
     */
   

    /**
     * Main method where we start our bot.
     */
    public static void main(String[] args) {
        try {
        	TutorialBot bot = new TutorialBot();
        } catch (LoginException e) {
            System.out.println("ERROR: Provided bot token is invalid!");
        }
    }
}

