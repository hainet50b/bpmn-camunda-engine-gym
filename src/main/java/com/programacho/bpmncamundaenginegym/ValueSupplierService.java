package com.programacho.bpmncamundaenginegym;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ValueSupplierService implements JavaDelegate {

    @Override
    public void execute(final DelegateExecution execution) throws Exception {
        System.out.println("Value Supplier Service!");

        execution.setVariable("value", 40);
    }
}
