package org.example.internal.self_user.activity

import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.hooks.ListenerAdapter

class SetActivity : ListenerAdapter() {
    override fun onReady(event: net.dv8tion.jda.api.events.session.ReadyEvent) {
        event.jda.presence.activity = Activity.playing("flying to the moon \uD83E\uDD66")
    }
}