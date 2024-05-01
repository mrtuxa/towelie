package org.example.commands.slash.admin

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


class TimeOutOld : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        if (event.name == "timeout") {
            val userID = event.getOption("user")!!.asUser.id

            val duration = event.getOption("duration")!!.asInt

            timeoutUser(event, userID, duration)
        }
    }

    private fun timeoutUser(event: SlashCommandInteractionEvent, userId: String, duration: Int) {
        // Apply timeout logic here, for example, assign a timeout role to the user

        // Schedule task to remove timeout role after duration

        val executor = Executors.newSingleThreadScheduledExecutor()
        executor.schedule({}, duration.toLong(), TimeUnit.SECONDS)

        // Provide feedback to the user
        event.reply("User has been timed out for $duration seconds.").queue()
    }
}