import org.jibble.pircbot.IrcException;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Patrick on 3/27/2016.
 */
public class BotDriver
{
    public static void main(String[] args) throws Exception
    {
        // Now start our bot up.
        ShockBot bot = new ShockBot();

        // Enable debugging output.
        bot.setVerbose(true);

        // Connect to the IRC server.
        try {
            bot.connect("irc.twitch.tv", 6667, "oauth:8rlfrhhhisck4eqob9tp5cs0e8izax");
            bot.joinChannel("#shockwve");
        } catch (IOException | IrcException e) {

            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}