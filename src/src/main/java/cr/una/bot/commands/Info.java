package cr.una.bot.commands;

import cr.una.bot.LordTheodoreOQuinn;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Info extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(LordTheodoreOQuinn.prefix + "info")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Lord Theodore O'Quinn Bot");
            info.setDescription("Hi! Im a useless bot");
            info.setColor(Color.BLUE);
            info.setFooter("Created by Felipe G", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }

    }
}
