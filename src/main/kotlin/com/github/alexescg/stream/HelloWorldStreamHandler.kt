package com.github.alexescg.stream

import com.amazon.ask.Skill
import com.amazon.ask.SkillStreamHandler
import com.amazon.ask.Skills
import com.github.alexescg.handlers.*

class HelloWorldStreamHandler : SkillStreamHandler(getSkill()) {

    companion object {

        private val handlers = listOf(
                CancelStopHandler(),
                HelloWorldIntentHandler(),
                HelpIntentHandler(),
                LaunchRequestHandler(),
                SessionEndedRequestHandler()
        )

        private fun getSkill(): Skill {
            return Skills.standard()
                    .addRequestHandlers(handlers)
                    .withSkillId("amzn1.ask.skill.bf27d7a9-1e14-4a3c-9b61-41a349bed927")
                    .build()
        }
    }


}