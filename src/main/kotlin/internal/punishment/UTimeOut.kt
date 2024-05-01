package org.example.internal.punishment

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import java.time.Duration


object UTimeOut {
    fun timeOutFor(event: SlashCommandInteractionEvent, time: Duration) {
        val guild = event.guild

        guild!!.timeoutFor(event.user, time)
    }
}