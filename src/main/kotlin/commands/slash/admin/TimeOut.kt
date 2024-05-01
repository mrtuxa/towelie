package org.example.commands.slash.admin

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import org.example.internal.builder.commands.slash.SlashCommandBuilder
import org.example.internal.interfaces.EventInterface
import org.example.internal.punishment.UTimeOut.timeOutFor
import org.example.internal.punishment.UTimeOut.timeOutUntil
import java.time.Duration

object TimeOut : EventInterface.SlashCommand{
    override fun register(event: GenericEvent) {
        SlashCommandBuilder.build("timeout-until", "Time out a user", event)
        SlashCommandBuilder.build("timeout-for", "Time out a user", event)
    }

    override fun handle(event: SlashCommandInteractionEvent) {
        val days = event.getOption("days")!!.asLong
        val hours = event.getOption("hours")!!.asLong
        val minutes = event.getOption("minutes")!!.asLong

        // Time out the user for the specified time
        val time = Duration.ofDays(days).plusHours(hours).plusMinutes(minutes)

        if (event.name == "timeout-until") {
            timeOutUntil(event, time)
        } else if (event.name == "timeout-for") {
            timeOutFor(event, time)
        }
    }
}