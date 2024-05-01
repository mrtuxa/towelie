package org.example.internal.events

import net.dv8tion.jda.api.events.session.ReadyEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import org.example.internal.builder.listener.internal.SlashCommandListener

object Ready : ListenerAdapter() {
    override fun onReady(event: ReadyEvent) {
        event.jda.addEventListener(SlashCommandListener.listen(event))
    }
}