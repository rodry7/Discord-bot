package cr.una.bot;

import cr.una.bot.commands.Clear;
import cr.una.bot.commands.Info;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class LordTheodoreOQuinn {
    public static JDA jda;
    public static String prefix = "~";

    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder(AccountType.BOT).setToken("NzI2NTkzODczMjA3MzYxNTc3.XvfsoA.sb1mX8unFTMf2zHp78_8hPLiNzU").build();
        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setActivity(Activity.watching("boring comedy shows."));

        jda.addEventListener(new Info());
        jda.addEventListener(new Clear());
    }

}
