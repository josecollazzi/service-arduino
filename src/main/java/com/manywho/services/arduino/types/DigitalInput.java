package com.manywho.services.arduino.types;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.types.Type;
@Type.Element(name = DigitalInput.NAME, summary = "Digital Input")
public class DigitalInput implements Type {
    public final static String NAME = "Digital Input";

    @Type.Identifier
    @Type.Property(name = "Input ID", contentType = ContentType.String)
    private String id;

    @Type.Property(name = "Input Value", contentType = ContentType.String)
    private Boolean inputValue;

    public String getId() {
        return id;
    }

    public Boolean getInputValue() {
        return inputValue;
    }
}
