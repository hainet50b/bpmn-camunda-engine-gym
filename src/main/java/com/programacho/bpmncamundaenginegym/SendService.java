package com.programacho.bpmncamundaenginegym;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SendService implements JavaDelegate {

    @Override
    public void execute(final DelegateExecution execution) throws Exception {
        execution
                .getProcessEngineServices()
                .getRuntimeService()
                .createMessageCorrelation("FooEvent")
                .correlate();
    }
}
