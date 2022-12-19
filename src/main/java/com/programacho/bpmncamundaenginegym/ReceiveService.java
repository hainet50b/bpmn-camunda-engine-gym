package com.programacho.bpmncamundaenginegym;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.EventSubscription;
import org.springframework.stereotype.Component;

@Component
public class ReceiveService implements JavaDelegate {

    @Override
    public void execute(final DelegateExecution execution) throws Exception {
        final EventSubscription subscription = execution
                .getProcessEngineServices()
                .getRuntimeService()
                .createEventSubscriptionQuery()
                .eventType("message")
                .singleResult();

        System.out.println("Id: " + subscription.getId());
        System.out.println("Process instance Id: " + subscription.getProcessInstanceId());
        System.out.println("Execution Id: " + subscription.getExecutionId());
        System.out.println("Activity Id: " + subscription.getActivityId());
        System.out.println("Event type: " + subscription.getEventType());
        System.out.println("Event name: " + subscription.getEventName());
        System.out.println("Created: " + subscription.getCreated());
    }
}
