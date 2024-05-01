package org.example.internal.builder.commands.slash

import net.dv8tion.jda.api.entities.Guild
import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.interactions.commands.build.Commands
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction
import org.example.internal.guild.settings.GuildSettings

object SlashCommandBuilder {
        fun build(command: String, description: String, event: GenericEvent) {
            val guild = GuildSettings.guildID(event.jda)
            guild!!.updateCommands().addCommands(
                Commands.slash(command, description)
            ).queue()
        }
}