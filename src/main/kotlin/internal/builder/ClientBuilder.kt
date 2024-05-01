package org.example.internal.builder

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.requests.GatewayIntent
import org.example.env
import org.example.internal.events.Ready

class ClientBuilder() {
    fun build() {
        // check if token is present
        env.get["TOKEN"]?.let {
            println("Token found in .env file")
        } ?: run {
            println("Token not found in .env file")
        }

        JDABuilder.createDefault(env.get["TOKEN"])
            .addEventListeners(Ready)
            .setEnabledIntents(
                listOf(
                    GatewayIntent.MESSAGE_CONTENT,
                    GatewayIntent.GUILD_VOICE_STATES,
                    GatewayIntent.GUILD_EMOJIS_AND_STICKERS,
                    GatewayIntent.SCHEDULED_EVENTS
                )
            )
            .build()
    }
}