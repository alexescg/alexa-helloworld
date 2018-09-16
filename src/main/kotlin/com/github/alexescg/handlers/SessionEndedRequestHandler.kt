package com.github.alexescg.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.model.Response
import com.amazon.ask.model.SessionEndedRequest
import com.amazon.ask.request.Predicates
import java.util.*

class SessionEndedRequestHandler : RequestHandler {

    override fun canHandle(handlerInput: HandlerInput): Boolean {
        return handlerInput.matches(Predicates.requestType(SessionEndedRequest::class.java))
    }

    override fun handle(handlerInput: HandlerInput): Optional<Response> {
        return handlerInput.responseBuilder.build()
    }

}