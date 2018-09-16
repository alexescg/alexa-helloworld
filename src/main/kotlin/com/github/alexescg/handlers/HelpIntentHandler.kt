package com.github.alexescg.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.*

class HelpIntentHandler : RequestHandler {

    override fun canHandle(handlerInput: HandlerInput): Boolean {
        return handlerInput.matches(Predicates.intentName("AMAZON.HelpIntent"))
    }

    override fun handle(handlerInput: HandlerInput): Optional<Response> {
        val speechText = "I am here to say Hello World to you"
        return handlerInput.responseBuilder
                .withSpeech(speechText).withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build()
    }
}