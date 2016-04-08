import org.jibble.pircbot.IrcException;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Patrick on 3/27/2016.
 * Modified by Taylor on 4/8/2016.
 */
 
 
/***
 Bot ideas:
 - a way to send messages on a timer
 */
public class BotDriver
{
    public static void main(String[] args) throws Exception
    {
        // Now start our bot up.
        ShockAmyBot bot = new ShockAmyBot("amyrlinn");

        // Enable debugging output.
        bot.setVerbose(true);

        // Connect to the IRC server.
        try {
            bot.connect("irc.twitch.tv", 6667, "oauth:nyjtvqojyzu9nzqyr7skupq2go9zgl");
            bot.joinChannel("#" + bot.getChannel());
        } catch (IOException | IrcException e) {

            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}