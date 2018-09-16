package com.github.alexescg.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.model.SessionEndedRequest
import com.amazon.ask.request.Predicates
import java.util.*

class HelloWorldIntentHandler : RequestHandler {

    override fun canHandle(handlerInput: HandlerInput): Boolean {
        return handlerInput.matches(Predicates.intentName("HelloWorldIntent"))
    }

    override fun handle(handlerInput: HandlerInput): Optional<Response> {
        val speechText = "I am alive Hello World"
        return handlerInput.responseBuilder
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build()
    }

}