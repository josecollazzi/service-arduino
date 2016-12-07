package com.manywho.services.arduino.actions;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.actions.Action;
import com.manywho.services.arduino.types.DigitalInput;
import java.util.List;

@Action.Metadata(name = "Set Digital Inputs", summary = "Set Digital Inputs", uri = "set-digital-inputs")
public class SetDigitalInputs {

    public static class Input {
        @Action.Input(name = "Digital Inputs", contentType = ContentType.List, required = true)
        private List<DigitalInput> digitalInputs;

        public List<DigitalInput> getDigitalInputs() {
            return digitalInputs;
        }
    }

    public static class Output {
        public Output() {}
    }
}
