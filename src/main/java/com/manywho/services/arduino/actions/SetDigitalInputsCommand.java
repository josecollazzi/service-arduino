package com.manywho.services.arduino.actions;

import com.manywho.sdk.api.run.elements.config.ServiceRequest;
import com.manywho.sdk.services.actions.ActionCommand;
import com.manywho.sdk.services.actions.ActionResponse;
import com.manywho.services.arduino.ServiceConfiguration;

import javax.inject.Inject;

public class SetDigitalInputsCommand implements ActionCommand<ServiceConfiguration, SetDigitalInputs, SetDigitalInputs.Input, SetDigitalInputs.Output> {

    @Inject
    public SetDigitalInputsCommand() {
    }

    @Override
    public ActionResponse<SetDigitalInputs.Output> execute(ServiceConfiguration serviceConfiguration, ServiceRequest serviceRequest, SetDigitalInputs.Input input) {
        try {

            SetDigitalInputs.Output output = new SetDigitalInputs.Output();

            return new ActionResponse<>(output);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
