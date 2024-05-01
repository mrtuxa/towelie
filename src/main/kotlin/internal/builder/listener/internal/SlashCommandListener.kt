package org.example.internal.builder.listener.internal

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import org.example.commands.slash.admin.TimeOut

object SlashCommandListener {
    fun listen(event: SlashCommandInteractionEvent) {
        addListener(event, TimeOut.handle(event))
    }

    fun addListener(event: GenericEvent, listener: Unit) {
        event.jda.addEventListener(listener)
    }
}