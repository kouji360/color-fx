package com.colorfx.colorfx.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class FxColor implements Serializable {

    private static final long serialVersionUID = 4678852901357132239L;

    private String id;
    private String name;
    private String colorCode;
}
