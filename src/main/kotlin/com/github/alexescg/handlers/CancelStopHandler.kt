package com.github.alexescg.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import java.util.*
import com.amazon.ask.request.Predicates.intentName


class CancelStopHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(
                intentName("AMAZON.StopIntent")
                .or(intentName("AMAZON.CancelIntent"))
        )
    }

    override fun handle(input: HandlerInput): Optional<Response> {
        val speechText = "Bye bye"
        return input
                .responseBuilder
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build()
    }

}