import org.jibble.pircbot.PircBot;

import java.lang.*;

/**
 * Created by Patrick on 3/27/2016.
 */
public class ShockBot extends PircBot
{
    public ShockBot()
    {
        this.setName("ShockBot_");
        this.setLogin("ShockBot_");
    }

    public void onMessage(String channel, String sender, String login, String hostname, String message)
    {
        System.out.println(channel);
        switch(message)
        {
            case "!faq": this.sendMessage(channel, "FAQ is here: http://pastebin.com/sizkcmzS");
                break;

            case "!ban":
                if (sender.equalsIgnoreCase("shockwve")) {
                    String[] splitmsg = message.split("+ ");
                    if (splitmsg.length > 2)
                        System.out.println("Incorrect Usage of Command. Usage: !ban <user>");
                    else {
                        String user = splitmsg[1];
                        this.ban(channel, user);
                        System.out.println("" + user + " is now banned.");
                    }
                }
                break;

            default:
                CharSequence rheyix = "rheyix";
                if (message.contains(rheyix) && sender.equalsIgnoreCase("shockwve"))
                    this.sendMessage(channel, "Rheyix is literally the worst runner at A Hat in Time Kappa");
                CharSequence shock = "shockwve";
                if (message.contains(shock) && sender.equalsIgnoreCase("shockwve"))
                    this.sendMessage(channel, "white graps LMAO");
        }
    }

    public String checkBTMemes()
    {
        return "";
    }
}
