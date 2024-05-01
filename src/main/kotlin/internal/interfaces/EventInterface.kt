package org.example.internal.interfaces

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent

interface EventInterface {
    interface SlashCommand {
        fun register(event: GenericEvent)
        fun handle(event: SlashCommandInteractionEvent)
    }
}