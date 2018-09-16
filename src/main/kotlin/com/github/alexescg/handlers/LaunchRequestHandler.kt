package com.github.alexescg.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.*

class LaunchRequestHandler : RequestHandler {

    override fun canHandle(handlerInput: HandlerInput): Boolean {
        return handlerInput.matches(Predicates.requestType(LaunchRequest::class.java))
    }

    override fun handle(handlerInput: HandlerInput): Optional<Response> {
        val speechText = "Welcome to Hello world, you can say Hello"
        return handlerInput.responseBuilder
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build()
    }
}