package org.example

import io.github.cdimascio.dotenv.dotenv
import net.dv8tion.jda.api.events.GenericEvent
import org.example.internal.builder.ClientBuilder
import utils.CheckEnvFile

object env {
    val get = dotenv()
}

fun main(event: GenericEvent) {
    CheckEnvFile(env.get)

    ClientBuilder().build()
}