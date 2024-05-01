package org.example.internal.guild.settings

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.entities.Guild
import org.example.env

object GuildSettings {
    fun guildID(jda: JDA): Guild? {
        return jda.getGuildById(env.get["GUILD_ID"])
    }
}