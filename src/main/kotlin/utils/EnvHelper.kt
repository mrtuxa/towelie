package utils

import io.github.cdimascio.dotenv.Dotenv
import io.github.cdimascio.dotenv.dotenv
import java.io.File


fun CheckEnvFile(dotenv: Dotenv) {
    // check if .env file exists and is not empty and if a token is present
    val envFile = File(".env")
    if (envFile.exists() && envFile.length() > 0) {
        dotenv["TOKEN"]?.let {
            println("Token found in .env file")
        } ?: run {
            println("Token not found in .env file")
        }
    } else {
        println("No .env file found")
    }
}
